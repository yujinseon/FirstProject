package javaexp.a07_exception;

public class A01_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 예외 처리
		 1. 오류의 종류
		 	1) 에러
		 		- 하드웨어의 잘못된 동작/고장 오류
		 		- 에러 발생되면 프로그램 종료
		 		- 정상 실행 상태로 돌아갈 수 없음
		 	2) 예외
		 		- 사용자의 잘못된 조장 또는 개발자의 잘못된 코딩으로 인한 오류
		 		- 예외가 발생되면 프로그램 종료
		 		- 예외 처리 추가하면 정상 실행 상태로 돌아갈 수 있음
		 	3) 내용
		 		- 일반(컴파일 체크)예외
		 		- 실행 예외
		 
		 2. 예외 처리 기본 형식
			 try{
			 	//예외가 나올만한 코드
			 }catch(Exception e){
			 	// 예외가 나왔을 때, 처리될 코드
			 	 
			 }finally{
			 	//예외가 나오거나 나오지 않았을 때, 모두 처리될 코드
			 }
		 3. runtime 예외 처리 기본 프로세스
		 	1) 실행 처리에서 나올만한 코드를 처리한다.
		 	2) 에러 처리에 나오는 예외를 복사하여 catch(예외 클래스)에 선언한다
		 	3) 예외 내용을 수행하는 내용을 확인한다.
		 	
		 * */
	//	String name1 = null;
		//System.out.println("예외 처리 안됨!");
		//System.out.println(name1.toString());
		
		try {
			System.out.println("처리1");
			String name = null;
			//String name = "홍길동";
			System.out.println("처리2");
			System.out.println(name.toString());
			System.out.println("처리3");
		}catch(NullPointerException e) {
			System.out.println("#예외발생#");
			System.out.println("처리4"+e.getMessage());
		}finally {
			System.out.println("#finally 구문#");
			System.out.println("처리5");
		}
			System.out.println("처리6");
		// 실행 예외로 heap메모리에 없는 상황에서 수행 처리되는 메서드
		
	}

}
