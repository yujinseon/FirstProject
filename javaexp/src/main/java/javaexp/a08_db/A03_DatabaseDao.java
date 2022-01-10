package javaexp.a08_db;
//javaexp.a08_db.A03_DatabaseDao
//import javaexp.a04_vo.Dept

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javaexp.a04_vo.Dept;
import javaexp.a04_vo.Emp;
import javaexp.a04_vo.Emp2;
import javaexp.a04_vo.EmpSch;
import javaexp.a04_vo.Job;

public class A03_DatabaseDao {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("접속 성공");
	}
	public void deptList() {
		
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT * FROM DEPT";
			rs = stmt.executeQuery(sql);
			int rowNum=1;
			while(rs.next()) {
				System.out.print("행: "+rowNum+++"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t"); //select을 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+"\n");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
		}
		
	}
	/*
	 1. Dept(deptno, dname, loc) VO 생성
	 2. 리턴할 기능 메서드 선언 
	 3. 매개변수 처리
	 	select*from dept where loc like '%'||'A'||'%';
	 4. while() 처리할 VO생성하고 ArrayList에 담기
	 5. main()에서 출력하기
	 * */
	public ArrayList<Dept> deptList(String loc) {
		ArrayList<Dept> deptlist = new ArrayList<Dept>();
		
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT  * \r\n"
					+ "FROM dept \r\n"
					+ "WHERE loc like '%'||'A'||'%'";
			rs = stmt.executeQuery(sql);
			int rowNum=1;
			while(rs.next()) {
				System.out.print("행: "+rowNum+++"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t"); //select을 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+"\n");
				
				deptlist.add(new Dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
				
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
		}
		return deptlist;
	}
	public ArrayList<Emp2> getEmpList2(int deptno){
		ArrayList<Emp2> list = new ArrayList<Emp2>();
		String sql = "SELECT  empno no, ename name, job, deptno\r\n"
				+ "				FROM emp \r\n"
				+ "				WHERE deptno=\"+deptno";
		return list;
	}
	/*
	 ex) 직책을 기준으로 부서명, 사원이름, 직책명, 급여를 검색하여 출력
	  	-VO작성, 동적sql작성
	  	- 고급자(메서드정의까지)
	 * */
	public ArrayList<Job> getJobList(String job){
		ArrayList<Job> joblist = new ArrayList<Job>();
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT dname, ename, job, sal  \r\n"
					+ "FROM emp, dept\r\n"
					+ "WHERE emp.deptno = dept.deptno\r\n"
					+ "AND job like '%'||'MAN'||'%'";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				joblist.add(new Job(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
				
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
		}
		return joblist;
	}
	/*
	 	SELECT *
		FROM EMP e 
		WHERE ename LIKE '%%'
		AND job LIKE '%%'
		and sal BETWEEN 1000 AND 3000
		AND deptno =10;
		/*
		 # 위와 같이 매개변수로 처리할 데이터가 많을 때
		 1. 매개변수를 나열하든지
		 2. 위 매개변수를 객체로 VO를 만들고, 그 VO로 매개변수를 전송할게 한다
		 Class EmpSch{
		 	private String ename;
		 	private String job;
		 	private int fr_sal;
		 	private int to_sal;
		 	private int deptno;
		 }
 * */
	public ArrayList<Emp> getEmpListSch(EmpSch sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql = "SELECT *\r\n"
				+ "		FROM EMP e \r\n"
				+ "		WHERE ename LIKE '%"+sch.getEname()+"%'\r\n"
				+ "		AND job LIKE '%"+sch.getJob()+"%'\r\n"
				+ "		and sal BETWEEN "+sch.getFr_sal()+" AND "+sch.getTo_sal()+"\r\n"
				+ "		AND deptno ="+sch.getDeptno();
		return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A03_DatabaseDao dao = new A03_DatabaseDao();
		dao.deptList();
		ArrayList<Dept> dlist = dao.deptList("A");
		System.out.println("# 화면 출력 내용 #");
		for(Dept d:dlist) {
			System.out.println(d.getDeptno()+"\t"+d.getDname()+"\t"+d.getLoc());
		}
		ArrayList<Job> jlist = dao.getJobList("MAN");
		System.out.println("# 화면 출력 내용 #");
		for(Job j:jlist) {
			System.out.println(j.getDname()+"\t"+j.getEname()+"\t"+j.getJob()+"\t"+j.getSal());
		}
		
	}
	/*
	 jsp 로딩
	 1. import VO, ArrayList, dao
	 2. table 화면 구성
	 	데이터 list 구문 tr 부분 반복처리..
	 * */
}
