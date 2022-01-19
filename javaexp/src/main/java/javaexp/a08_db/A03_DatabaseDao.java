package javaexp.a08_db;
// javaexp.a08_db.A03_DatabaseDao
// javaexp.a04_vo.Dept

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javaexp.a04_vo.Dept;
import javaexp.a04_vo.Emp;
import javaexp.a04_vo.Emp2;
import javaexp.a04_vo.Emp3;
import javaexp.a04_vo.EmpDept01;
import javaexp.a04_vo.EmpSal;
import javaexp.a04_vo.EmpSch;
import javaexp.a04_vo.LocSalSch;

public class A03_DatabaseDao {
	// 1. 필드 선언
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	// 2. 공통 기능 메서드
	public void setConn() throws SQLException {
		// 드라이버
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 예외:"+e.getMessage());
		}
		// 서버접속
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info, "scott","tiger");
		System.out.println("DB 접속 성공!!");
	}
	// 3. deptlist 기능 메서드..
	public void deptList() {
		try {
			setConn();
			String sql = "select * from dept";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int row=1;
			while(rs.next()) {
				// dept 컬럼 데이터 가져와서 출력하기..
				// select deptno, dname, loc from dept
				System.out.print("행:"+row+++"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t"); // select를 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+"\n"); // select를 통해서 데이터 순서로 1부터
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외:"+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	// 3. deptlist 기능 메서드..
	/* 진행하시고, 조별로 손들어 주세요..
	1. Dept(deptno, dname, loc)  Vo 생성.
	2. 리턴할 기능 메서드 선언.
	3. select * from dept where loc like '%'||'A'||'%';
	4. while() 처리할 VO생성하고, ArrayList에 담기
	5. main()에서 출력처리.
	 
	~11:40까지 일단 해보시고, 같이 진행하겠습니다
	 * */
	
	public ArrayList<Dept> deptList(String loc) {
		ArrayList<Dept> dlist = new ArrayList<Dept>();
		// return dlist;
		try {
			setConn();
			String sql = "select * \r\n"
					+ "from dept \r\n"
					+ "where loc like '%'||'"+loc+"'||'%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int row=1;
			while(rs.next()) {
				dlist.add( new Dept(rs.getInt(1), rs.getString(2), rs.getString(3) ) );
				// dept 컬럼 데이터 가져와서 출력하기..
				// select deptno, dname, loc from dept
				System.out.print("행:"+row+++"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t"); // select를 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+"\n"); // select를 통해서 데이터 순서로 1부터
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외:"+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return dlist;
	}
	public ArrayList<Emp2> getEmpList2(int deptno){
		ArrayList<Emp2> list = new ArrayList<Emp2>();
		String sql = "\"SELECT empno no, ename name, job, deptno\r\n"
				+ "					FROM emp\r\n"
				+ "             WHERE deptno="+deptno;
		// 연결객체 공통 메서드
		try {
			setConn();
			// 대화객체
			stmt = con.createStatement();
			// 결과객체
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Emp2(rs.getInt("no"), rs.getString("name"),
						          rs.getString("job"), rs.getInt("deptno") ));
			}
			// 자원해제
			rs.close(); stmt.close(); con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		
		return list;
	}
	/*
	ex) 직책을 기준으로 부서명, 사원이름, 직책명, 급여를 검색하여 출력하세요
	 	- VO작성, 동적sql작성
	 	- 고급자(메서드정의까지)
	 	SQL 
SELECT dname, ename, job, sal
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND job LIKE '%'||'MAN'||'%'
	 * */
	public ArrayList<Emp3> list3(String job){
		ArrayList<Emp3> list = new ArrayList<Emp3>();
		String sql = "SELECT dname, ename, job, sal\r\n"
				+ "FROM emp e, dept d\r\n"
				+ "WHERE e.deptno = d.deptno\r\n"
				+ "AND job LIKE '%'||'"+job+"'||'%'";
		// ex) DB처리 ResultSet 객체 처리하기..
		try {
			setConn();
			// 대화 객체
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Emp3(rs.getString(1), rs.getString(2),
						  rs.getString(3), rs.getDouble(4)));
			}
			rs.close();stmt.close();con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			closeRsc();//자원 해제 공통 메서드.
		}
		
		
		
		return list;
	}
	// 자원해제 공통 메서드 선언..
	void closeRsc() {
		if(rs!=null) { 
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		if(stmt!=null) { 
			try {
				stmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		if(con!=null) { 
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}		
		
	}
	
	
	/*
	ex) 관리자번호를 기준으로 사원번호, 사원명, 관리자번호, 급여를 검색하는 VO,
	 	sql을 작성하세요.
	 	1) sql 작성
	 	2) vo 작성     sql vo까지 작성하고 손들어 주세요. 빨리 작성한 조는 손을 들고 다음 단계로 진행
	 				  해주세요.
	 	-------------------------
	 	3) 기능 메서드 작성 - 리턴값, 매개변수
	 	4) 동적 sql 작성.
	 	--------------
	 	5) DB ResultSet 처리
	 	6) VO객체 담기.
class Emp4{
	private int empno;
	private String ename;
	private int mgrno;
	private double salary;
}
String sql = "SELECT empno, ename, mgr mgrno, sal salary "+
			 "FROM emp "+
			 "WHERE mgr = "+mgr;	 	
	 	
	 * */
		/*
	SELECT *
	FROM emp
	WHERE ename LIKE '%%'
	AND job LIKE '%%'
	AND sal BETWEEN 1000 AND 3000
	AND deptno = 10;
	/*
	# 위와 같이 매개변수로 처리할 데이터가 많을 때
	1. 매개변수를 나열하든지
	2. 위 매개변수를 객체로 VO를 만들고, 그 VO로 매개변수를 전송하게 한다.
	class EmpSch{
		private String ename;
		private String job;
		private int fr_sal;
		private int to_sal;
		private int deptno;
	} 
	 * */ 
	// ArrayList<Emp>  : select * 를 통해서 결과를 받을 데이터를 VO(한 행)단위를
	//    모아서 동적배열을 선언하여 처리될 부분
	// getEmpListSch(EmpSch sch) :의  EmpSch sch는 아래 sql문에 들어갈
	//    where 조건문의 데이터를 처리하기위해 속성을 지정하여 전달하는 객체 선언 부분.
	//    ex) + "	WHERE ename LIKE '%"+sch.getEname()+"%'\r\n"
	public ArrayList<Emp> getEmpListSch(EmpSch sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql = "	SELECT *\r\n"
				+ "	FROM emp\r\n"
				+ "	WHERE ename LIKE '%"+sch.getEname()+"%'\r\n"
				+ "	AND job LIKE '%"+sch.getJob()+"%'\r\n"
				+ "	AND sal BETWEEN "+sch.getFr_sal()+" AND "+sch.getTo_sal()+"\r\n"
				+ "	AND deptno = "+sch.getDeptno();
		
		return list;
	}
	/*
		ex) 관리자번호를 기준으로 사원번호, 사원명, 관리자번호, 급여를 검색하는 VO,
		 	sql을 작성하세요.
		 	1) sql 작성
		 	2) vo 작성     sql vo까지 작성하고 손들어 주세요. 빨리 작성한 조는 손을 들고 다음 단계로 진행
		 				  해주세요.
		 	-------------------------
		 	3) 기능 메서드 작성 - 리턴값, 매개변수
		 	4) 동적 sql 작성.
		 	--------------
		 	5) DB ResultSet 처리
		 	6) VO객체 담기.
	class Emp4{
		private int empno;
		private String ename;
		private int mgrno;
		private double salary;
	}
	String sql = "SELECT empno, ename, mgr mgrno, sal salary "+
				 "FROM emp "+
				 "WHERE mgr = "+mgr;	 	
		 	
		 * */
			/*
		SELECT *
		FROM emp
		WHERE ename LIKE '%%'
		AND job LIKE '%%'
		AND sal BETWEEN 1000 AND 3000
		AND deptno = 10;
		/*
		# 위와 같이 매개변수로 처리할 데이터가 많을 때
		1. 매개변수를 나열하든지
		2. 위 매개변수를 객체로 VO를 만들고, 그 VO로 매개변수를 전송하게 한다.
		class EmpSch{
			private String ename;
			private String job;
			private int fr_sal;
			private int to_sal;
			private int deptno;
		} 
		 * */ 
		// ArrayList<Emp>  : select * 를 통해서 결과를 받을 데이터를 VO(한 행)단위를
		//    모아서 동적배열을 선언하여 처리될 부분
		// getEmpListSch(EmpSch sch) :의  EmpSch sch는 아래 sql문에 들어갈
		//    where 조건문의 데이터를 처리하기위해 속성을 지정하여 전달하는 객체 선언 부분.
		//    ex) + "	WHERE ename LIKE '%"+sch.getEname()+"%'\r\n"
		public ArrayList<Emp> getEmpListSchPrd(EmpSch sch){
			ArrayList<Emp> list = new ArrayList<Emp>();
			String sql = "	SELECT *\r\n"
					+ "	FROM emp\r\n"
					+ "	WHERE ename LIKE '%"+sch.getEname()+"%'\r\n"
					+ "	AND job LIKE '%"+sch.getJob()+"%'\r\n"
					+ "	AND sal BETWEEN "+sch.getFr_sal()+" AND "+sch.getTo_sal()+"\r\n"
					+ "	AND deptno = "+sch.getDeptno();
			
			return list;
		}
	// 급여가 1000~3000사이의 사원의 수를 처리
	public int getCnt(int fr_sal, int to__sal){
		int cnt =0;
		String sql = "SELECT count(*) cnt \n"+
					 "From emp \n" +
					 "WHERE sal BETWEEN "+fr_sal+" AND "+to__sal; 
		return cnt;
	}	
	// salgrade/emp를 조인하여 3500에 해당하는 사원명과 급여등급을 처리하세요
	/*
class EmpSal{
	private String ename;
	private String grade;
	private double sal;
}

	 * */
	public ArrayList<EmpSal> getSalGrade(int sal){
		ArrayList<EmpSal> list = new ArrayList<EmpSal>();
		String sql = "SELECT ename, grade, sal \n"+
					 "FROM emp e, salgrade s \n"+	
					 "WHERE e.sal BETWEEN losal AND hisal \n"+
					 "AND sal = "+sal;
		return list;
	} 	
	/*
	# 동적 sql, 리턴값처리, 매개변수처리 기능메서드 선언 연습
	1. 
	 * 
	 * */
	public Emp getEmp01(int empno){
		Emp emp=null;
		String sql = "SELECT * "+
					 "FROM emp "+
					 " WHERE empno="+empno;
		return emp;
	} 	
	public ArrayList<Emp> empListSch2(Emp sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql = "SELECT deptno, empno, ename, mgr, job " +
					 "FROM emp " + 
					 "WHERE job LIKE '%'||'"+sch.getJob()+"'||'%' " + 
					 "AND mgr = "+sch.getMgr()+" " + 
					 "AND deptno= "+sch.getDeptno();
	    return list;			  
	}	
	public ArrayList<EmpDept01> empDeptSch(LocSalSch sch){
		ArrayList<EmpDept01> list = new ArrayList<EmpDept01>();
		String sql = "SELECT e.*, d.loc "+
					 "FROM emp e, dept d "+
					 "WHERE e.deptno = d.deptno "+
					 "AND loc LIKE '%'|| '"+sch.getLoc()+"' ||'%' "+
					 "AND sal BETWEEN "+sch.getFr_sal()+" AND "
					 	+sch.getTo_sal();
		return list;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A03_DatabaseDao dao = new A03_DatabaseDao();
		dao.deptList();
		ArrayList<Dept> dlist = dao.deptList("A");
		System.out.println("# 화면 출력 내용 #");
		for(Dept d:dlist) {
			System.out.print(d.getDeptno()+"\t");
			System.out.print(d.getDname()+"\t");
			System.out.print(d.getLoc()+"\n");
		}
		/*
		jsp 로딩..
		1. import vo, arraylist, dao
		2. table화면 구성
			데이터 list 구문 tr 부분 반복처리..
		 
		 * */
		
	}
}
