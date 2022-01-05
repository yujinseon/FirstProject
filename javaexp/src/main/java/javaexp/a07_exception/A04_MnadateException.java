package javaexp.a07_exception;

public class A04_MnadateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 예외의 위임
		1. 예외는 메서드 단위로 위임할 수 있다
			위임된 예외는 해당 메서드가 호출하는 순간 한꺼번에 처리가
			가능하다.
			- 메서드 단위로 처리할 내용을 호출하는 곳에서 한꺼번에
			처리할 필요성이 있을 때 사용한다
			public void 메서드단위() throws ClassNotFoundException{}
			각 메서드에 있는 예외처리 내용을 메서드 단위로 위임하여 처리하는 것을 말한다.
			- 위임된 메서드가 호출하면 다시 try{}catch{}
		2.  기본 형식
			1) 메서드명 throws 위임된 예외1, 위임된 예외2{}
		 * */
		DBConn db = new DBConn();
		db.oraDBConn();
		//예외가 위임되었기 떄문에 예외를 처리하라고 메시지가 뜬다
		try {
			// 한꺼번에 위임되 내용을 처리..
			db.mySqlDBConn();
			db.mssqlDBConn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
		try {
			db.method01(); // 런타임 에러이기 때문에 당장은 에러 x 그러나 실행위해 예외처리
			db.method02();
		}catch(NullPointerException e) {
			System.out.println("예외: "+e.getMessage());
		}
	}

}
class DBConn{
	public void method01() throws NullPointerException{
		String s=null;
		System.out.println(s.toString());
	}
	public void method02() throws NullPointerException{
		String s2=null;
		System.out.println(s2.toString());
	}
	public void method03() {
		String s2=null;
		try {
			System.out.println(s2.toString());
		}catch(NullPointerException e) {
			System.out.println("예외: "+e.getMessage());
		}
	}
	public void oraDBConn() {
		//예외를 바로 처리한 경우
		System.out.println("오라클 DB연결");
		//예외의 두번째 형태인 컴파일 예외로 반드시 처리하여야 되는 내용
		try {
			Class driver1 = Class.forName("java.oracle.JDBCDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("예외: "+e.getMessage());
		}
	}
	public void mySqlDBConn() throws ClassNotFoundException {
		//예외를 위임한 경우..
		System.out.println("mysql DB연결");
		Class driver2 = Class.forName("java.mysql.JDBCDriver");
	}
	public void mssqlDBConn() throws ClassNotFoundException {
		System.out.println("MSsql DB연결");
		Class driver2 = Class.forName("java.mysql.JDBCDriver");
	}
}