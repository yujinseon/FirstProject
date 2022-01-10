package javaexp.a08_db;
// javaexp.a08_db.A03_DatabaseDao

// javaexp.a04_vo.Dept

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javaexp.a04_vo.Emp;
import javaexp.a04_vo.EmpSch;


public class A04_DatabaseDao {
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
			System.out.println("드라이버 예외:" + e.getMessage());
		}
		// 서버접속
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info, "scott", "tiger");
		System.out.println("DB 접속 성공!!");
	}

	// 자원의 해제에 대한 예외에 대하여 처리해주는 공통기능 메서드
	void closeRsc() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public void deptList() {
		try {
			setConn();
			String sql = "select * from dept02";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int row = 1;
			while (rs.next()) {
				System.out.print("행:" + row++ + "\t");
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString(2) + "\t"); // select를 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3) + "\n"); // select를 통해서 데이터 순서로 1부터
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외:" + e.getMessage());
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public ArrayList<Emp> getEmpListSch(EmpSch sch) {
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql = "	SELECT *\r\n" + "	FROM emp02\r\n" + "	WHERE ename LIKE '%" + sch.getEname() + "%'\r\n"
				+ "	AND job LIKE '%" + sch.getJob() + "%'\r\n" + "	AND sal BETWEEN " + sch.getFr_sal() + " AND "
				+ sch.getTo_sal() + "\r\n" + "	AND deptno = " + sch.getDeptno();

		return list;
	}
	/*
	 * deptList()
	 * 
	 * 
	 * public ArrayList<String> getJobs()
	 */

	public ArrayList<Emp> getJobMaxSal(String job) {
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			setConn();
			String sql = "SELECT *\n"+     /*SELECT *FROM EMPWHERE...*/
					"FROM EMP\n"+
					"WHERE (JOB, SAL) = (\n"+
					"	SELECT job, max(sal) msal\n"+
					"		FROM emp\n"+
					"		GROUP BY job\n"+
					"		HAVING job = '"+job+"'\n"+
					")";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptno) 
				Emp e = new Emp(rs.getInt("empno"),rs.getString("ename"),
						rs.getString("job"), rs.getInt("mgr"), rs.getDate("hiredate"),
						rs.getDouble("sal"), rs.getDouble("comm"), rs.getInt("deptno"));
				list.add(e);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외:" + e.getMessage());
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return list;
	}
	// ctrl+shift+f (소스정리)
	public ArrayList<String> getJobs() {
		ArrayList<String> jobs = new ArrayList<String>();
		try {
			setConn();
			String sql = "SELECT DISTINCT JOB FROM EMP";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				jobs.add(rs.getString(1)); // select의 첫번째
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외:" + e.getMessage());
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return jobs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A04_DatabaseDao dao = new A04_DatabaseDao();
		dao.deptList();

	}
}
