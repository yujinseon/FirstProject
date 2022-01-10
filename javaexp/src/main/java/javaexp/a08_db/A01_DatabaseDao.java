package javaexp.a08_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class A01_DatabaseDao {
	/*
	# Database 처리..
	1. 처리 순서
		1) jdbc드라이버를 메모리에 로딩
			C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
			복사해서 \src\main\webapp\WEB-INF\lib 에 위치
	
	2. Dao 클래스 선언
		1) 전역 필드 선언 : 연결객체, 대화객체, 결과객체 선언..
		2) 연결 처리 기능 메서드 구현
			- jdbc 메모리 로딩
			- ip/port/계정/비밀번호 통해서 연결
		3) 조회기능메서드 처리
			- 공통 연결 메서드 호출
			- 대화객체 호출
			- 결과객체 호출
			- vo객체 담기
	3. 웹프로그램에서 DB서버 처리 방법
		1)프로그램 처리 구성도
			브라우저	웹Sever			DBServer
			요청처리	요청페이지호출된
					DB수행이필요한 페이지	DB데이터
					DAO
	
	
	# DAO 처리 순서
	1. 공통 필드 선언
		공통적으로 사용될 객체 선언
		연결, 대화, 결과
	2. 공통으로 사용할 연결 처리 기능 메서드 선언
	
	 * 
	 * */

	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	// 연결 공통 메서드.
	public void setConn() {
		// 1.공통 소스 드라이버 패키지 설정
		//	컴파일 예외 처리..
		//	메모리에 해당 클래스 로딩..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러: "+e.getMessage());
		}
		// 2.특정 서버에 연결
		String info="jdbc:oracle:thin:@localhost:1521:xe";
		try {
			//DriverManager.getConnection("접속정보","계정","비밀번호");
			con =DriverManager.getConnection(info,"scott","tiger");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러: "+e.getMessage());
		}
		System.out.println("접속 성공");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01_DatabaseDao dao = new A01_DatabaseDao();
		dao.setConn();

	}

}
