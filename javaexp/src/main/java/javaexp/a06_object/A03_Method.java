package javaexp.a06_object;

public class A03_Method {
	/*
	 # 매서드의 기능에 대한 이해와 실습
	 1. 리턴값에 대한 이해
	 	1) 리턴값을 메서드로 통해 리턴되는 데이터 유형을 말한다
	 	2) 초기에 선언된 유형으로 실제 마지막에 return @@@; 부분에 데이터를
	 		리턴하여야 한다.
	 	3) 실제 할당이 가능한 데이터유형을 선언하여야 한다
	 	4) 리턴되는 데이터가 없을 때는 void를 선언하여야 한다
	 		- void가 선언되었을 때는 return @@; 구문이 필요가 없다
	 2. 기본 형식
	 	리턴형식 메서드명(){}
	 3. 연습예제
	 	static(객체생성이 사용가능), main() 클래스가 있는 클래스에서 선언(객체 생성이 메서드 바로활용)
	 	
	 * */
	static String getString() {//리턴유형이 String
		return "홍길동"; //실제 리턴되는 데이터 "홍길동" String s = "홍길동"; 이 가능하기에 선언
	}
	static int getInt() {//리턴유형이 String
		return 26; //실제 리턴되는 데이터 "홍길동" String s = "홍길동"; 이 가능하기에 선언
	}
	static boolean getBoolean() {//리턴유형이 String
		return true; //실제 리턴되는 데이터 "홍길동" String s = "홍길동"; 이 가능하기에 선언
	}
	
	static void show() {
		System.out.println("리턴 유형이 없는 기능 메서드");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ret1 = getString();
		System.out.println(ret1);
		System.out.println(getInt());
		System.out.println(getBoolean());
		show();
	}

}
