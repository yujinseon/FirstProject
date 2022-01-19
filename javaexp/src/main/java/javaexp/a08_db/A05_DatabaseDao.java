package javaexp.a08_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javaexp.a04_vo.Dept;
import javaexp.a04_vo.Emp;

public class A05_DatabaseDao {



	// 1. 필드 선언
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
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
	// 등록 처리 
	public void insertEmp(Emp ins) {
		String sql = "INSERT INTO emp02 VALUES ("+ins.getEmpno()+",'"+ins.getEname()
		+"','"+ins.getJob()+"',"+ins.getMgr()+",sysdate,"+ins.getSal()+","
		+ins.getComm()+","+ins.getDeptno()+")";
		try {
			setConn();
			// 자동커밋 방지
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			// 자원해제
			stmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 예외시 rollback 처리
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
		}
	}
	/*
	 * 
	 * */

	// public Emp(String ename, String job, double sal, String hiredateS, int deptno, int empno){}
	
	// 등록 처리 
	// ex) PreparedStatement로 처리하세요..
	// ~14:40 풀이하겠습니다.
	public void insertEmpPre(Emp ins) {
		String sql = "INSERT INTO emp02 VALUES (?,?,?,?,sysdate,?,?,?)";
		try {
			setConn();
			// 자동커밋 방지
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ins.getEmpno());
			pstmt.setString(2, ins.getEname());
			pstmt.setString(3, ins.getJob());
			pstmt.setInt(4, ins.getMgr());
			pstmt.setDouble(5, ins.getSal());
			pstmt.setDouble(6, ins.getComm());
			pstmt.setDouble(7, ins.getDeptno());
			pstmt.executeUpdate();
			con.commit();
			// 자원해제
			pstmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 예외시 rollback 처리
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
		}
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
		if(pstmt!=null) { 
			try {
				pstmt.close();
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
	// public Emp(String ename, String job, double sal, String hiredateS, int deptno, int empno){}
	
	public void updateEmp02(Emp upt) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "update emp02\r\n"
					+ "			SET ename='"+upt.getEname()+"',\r\n"
					+ "				job = '"+upt.getJob()+"',\r\n"
					+ "				sal = "+upt.getSal()+",\r\n"
					+ "				hiredate = to_date('"+upt.getHiredateS()+"','YYYYMMDD'),\r\n"
					+ "				deptno = "+upt.getDeptno()+"\r\n"
					+ "		   where empno = "+upt.getEmpno();
			stmt  = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB관련 예외:"+e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
			
		}catch(Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		}
		
	}
	// public Emp(String ename, String job, double sal, String hiredateS, int deptno, int empno){}
	
	public void updateEmp02Pre(Emp upt) {
		try {
			System.out.println("#pstmt 수정#");
			setConn();
			con.setAutoCommit(false);
			/*
			 # 주의 
			 set ename='?' X
			     deptno=?  O
			 */
			String sql = "update emp02\r\n"
					+ "			SET ename=?,\r\n"
					+ "				job = ?,\r\n"
					+ "				sal = ?,\r\n"
					+ "				hiredate = to_date(?,'YYYYMMDD'),\r\n"
					+ "				deptno = ?\r\n"
					+ "		   where empno = ?";
			pstmt  = con.prepareStatement(sql);
			pstmt.setString(1, upt.getEname());
			pstmt.setString(2, upt.getJob());
			pstmt.setDouble(3, upt.getSal());
			pstmt.setString(4, upt.getHiredateS());
			pstmt.setInt(5, upt.getDeptno());
			pstmt.setInt(6, upt.getEmpno());
			pstmt.executeUpdate(); // ~14:21
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB관련 예외:"+e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
			
		}catch(Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		}
		
	}
	public void updateDept(Dept upt) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "update dept02\r\n"
					+ "	set dname = '"+upt.getDname()+"',\r\n"
					+ "	    loc = '"+upt.getLoc()+"' "
					+ "	where  deptno = "+upt.getDeptno();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			stmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 예외:"+e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			closeRsc();
		} catch(Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		}
		
	}
	/*
	DELETE 
FROM emp02
WHERE empno= 7499
	 * */
	// ex) delete from dept02 where deptno=30
	// main()    dao.deleteEmp02(7499);
	public void deleteEmp02(int empno) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "DELETE \r\n"
					+ "FROM emp02\r\n"
					+ "WHERE empno= "+empno;
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			stmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 예외:"+e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			closeRsc();
		} catch(Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		}
		
	}
	/*
		DELETE 
	FROM emp02
	WHERE empno= 7499
		 * */
		// ex) delete from dept02 where deptno=30
		// main()    dao.deleteEmp02(7499);
		public void deleteDept02(int deptno) {
			try {
				setConn();
				con.setAutoCommit(false);
				String sql = "DELETE \r\n"
						+ "FROM dept02\r\n"
						+ "WHERE deptno= "+deptno;
				stmt = con.createStatement();
				stmt.executeUpdate(sql);
				con.commit();
				stmt.close(); con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("DB 예외:"+e.getMessage());
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				closeRsc();
			} catch(Exception e) {
				System.out.println("일반 예외:"+e.getMessage());
			}
			
		}
	// public Emp(String ename, String job, double sal, String hiredateS, int deptno, int empno){}
		
		public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// 7499 '홍길동'  사원   20220110  3500  10
		/*
			public Emp(String ename, String job, double sal, 
			String hiredateS, int deptno, int empno)
		 * */
		Emp upt = new Emp("홍길동(수정)","대리",3500,"20220110",10,7521);
		A05_DatabaseDao dao = new A05_DatabaseDao();
		// 	public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptno) {
		Emp ins = new Emp(5555,"오영수","대리", 7577,new Date(),3000.0,100.0,10);
		dao.insertEmpPre(ins);
		
		dao.updateEmp02Pre(upt);
		// dbscript에서 데이터 변경내용 확인..
		
		dao.updateDept(new Dept(30,"인사","서울"));
		dao.deleteEmp02(7499);
		dao.deleteDept02(30);
		
		
		
	}
}
