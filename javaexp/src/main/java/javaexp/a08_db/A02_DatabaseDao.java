package javaexp.a08_db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javaexp.a04_vo.Emp;
public class A02_DatabaseDao {
	//ex) 연결 처리 객체만들기
	// 1. 공통 필드 선언
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	// 2. 공통 메서드 선언
	public void setConn() throws SQLException {
		// 1) 드라이버 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러: "+e.getMessage());
		}
		// 2) 특정 서버 연결
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		
		con =DriverManager.getConnection(info,"scott","tiger");
		
		System.out.println("접속 성공");
	}
	// 조회 처리 메서드 구현1단계(출력)
	public void empList() {
		//1. 연결공통메서드 호출
		try {
			setConn();
			//2. Statement 객체 생성 (Connection ==> Statement)
			stmt = con.createStatement();
			String sql ="SELECT * FROM EMP";
			//3. ResultSet 객체 생성.sql의 결과(Statement ==> ResultSet)
			rs = stmt.executeQuery(sql);
			//4. while()을 통해 결과 내용 처리 sql의 결과는 처리
			//		rs.next() 행(세로) 단위로 이동하게 처리
			int rowNum=1;
			while(rs.next()) {
				System.out.println(rowNum+++"행\t");
				//rs.get데이터유형("컬럼명/alias명")
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getDouble("sal")+"\t");
				System.out.print(rs.getDouble("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\n");
			}
			//5. 자원해제
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//6. 예외처리..
			System.out.println("에러: "+e.getMessage());
			if(rs!=null) rs=null; //강제로 자원해제
			if(stmt!=null) stmt=null; //강제로 자원해제

		}
		
		
		
		
	}
	
	// 조회 처리 메서드 구현1단계(출력)
	// 리턴 VO 만들고 ArrayList<VO> 선언하기 자동 import ctrl+shift+o
	public ArrayList<Emp> empList(String ename) {
		//리턴할 객체 선언
		ArrayList<Emp> emplist =new ArrayList<Emp>();
		//메서드의 마지막 부분 return emplist;
		
		//1. 연결공통메서드 호출
		try {
			setConn();
			//2. Statement 객체 생성 (Connection ==> Statement)
			stmt = con.createStatement();
			String sql ="SELECT  * \r\n"
					+ "FROM emp \r\n"
					+ "WHERE ename like '%'||'"+ename+"'||'%'";
			//3. ResultSet 객체 생성.sql의 결과(Statement ==> ResultSet)
			rs = stmt.executeQuery(sql);
			//4. while()을 통해 결과 내용 처리 sql의 결과는 처리
			//		rs.next() 행(세로) 단위로 이동하게 처리
			int rowNum=1;
			
			// 행단위로 단위 객체를 생성하여 ArrayList에 할당 처리
			while(rs.next()) {
				System.out.println(rowNum+++"행\t");
				//rs.get데이터유형("컬럼명/alias명")
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getDouble("sal")+"\t");
				System.out.print(rs.getDouble("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\n");
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emplist.add(emp);
			}
			//5. 자원해제
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//6. 예외처리..
			System.out.println("에러: "+e.getMessage());
			if(rs!=null) rs=null; //강제로 자원해제
			if(stmt!=null) stmt=null; //강제로 자원해제
			if(con!=null) con=null;
		}
		
		return emplist;
		
		
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 및 메서드 처리
		A02_DatabaseDao dao = new A02_DatabaseDao();
		dao.empList();
		System.out.println("데이터 크기: "+dao.empList("A").size());		
		System.out.println("# ArrayList<Emp>를 통한 화면 출력");
		for(Emp emp:dao.empList("A")) {
			System.out.println(emp.getEname()+"\t"+emp.getJob());
		}
	}

}
