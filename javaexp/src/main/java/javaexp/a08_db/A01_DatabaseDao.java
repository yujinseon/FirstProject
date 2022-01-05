package javaexp.a08_db;

public class A01_DatabaseDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 * */
	}

}
