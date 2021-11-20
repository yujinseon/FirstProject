package javaexp.a02_middle;

public class A11_MethodParam {
	/*
	 # 매개변수
	 1. 메서드나 생성자에서 전달되어온 데이터를 받아서 처리할 때, 사용되는 소괄호() 안에 선언된
	 	변수를 매개변수라고 한다.
	 	
	 2. 매개변수의 데이터 유형
	 		1) 선언된 데이터 유형에 맞게 데이터를 전달하여야 한다
	 		ex) 자판기에 지폐만 입력되게 처리했으면, 해당 입력 가능한 지폐만 입력하여야 한다
	 			동전이나 다른 수단으로는 입력이 되지 않는다.
	 			
	 3. 매개변수의 갯수
	 	1) 매개변수를 호출할 때, 한번에 여러가지 데이터를 입력할 수 있다
	 		이 때, "매개변수1, 매개변수2, 매개변수3" 형태로 데이터를 선언하고 해당 갯수에
	 		맞게 데이터를 전달하면 된다
	 		ex) 자판기에 지폐를 입력하고, 번호를 선택하는 2가지 입력 처리를 하는 경우가 있다
	 			이렇게 1개 이상의 일벽 정보를 처리할 때, 활용된다
	 */
	 static void inputAutoMachine(int money, String menu) {
		 System.out.println("# 자판기 입력 처리 #");
		 System.out.println("입력한 금액: " + money);
		 System.out.println("선택한 메뉴: " + menu);
	 }
	 
	 /*
	 4. 매개변수의 데이터유형에 따른 순서
	 	각 입력데이터를 유형의 순서에 맞게 입력을 하여야 한다
	 */
	 static void buyProd(String pname, int price) {
		 System.out.println("# 구매 정보 #");
		 System.out.println("구매한 물건: "+pname);
		 System.out.println("구매한 가격: "+price);
	 }
	 // 매개변수로 배열 받기
	 static void inputArray(String[] names) {
		 System.out.println("# 매개변수로 배열을 입력 #");
		 System.out.println("배열의 갯수:" + names.length);
		 System.out.println("배열의 첫번째 데이터 :" + names[0]);
	 }
	 
	static void callString(String str) {
		System.out.println("문자열 데이터 매개변수:" + str);
	}
	static void callInt(int num01) {
		System.out.println("입력한 숫자:" + num01);
	}
	// 이름을 출력하는 메서드
	static void callName(String name) {
		System.out.println("이름: " + name);
	}
	// 나이(정수)를 출력하는 메서드
	static void callAge(int age) {
		System.out.println("나이: " + age + "살");
	}
	// 몸무게를 출력하는 메서드
	static void callWeight(double weight) {
		System.out.println("몸무게: " + weight + "kg");
	}
	// 학생 정보를 입력하는 메서드
	static void callStudent(String name, int kor, int eng, int math) {
		System.out.println("# 학생 정보 입력 메서드 #");
		System.out.println("학생명: " + name +"\t"+ "국어 점수: " + kor+"\t" + "영어 점수: " + eng
				+"\t"+ "수학 점수: " + math);
	}
	
	public static void main(String[] args) {
		// 호출할 때, 데이터 유형은 순서에 맞게 입력하여야 한다
		inputAutoMachine(1000,"커피");
		inputAutoMachine(2000,"사이다");
		// 학생 정보 입력 메서드
		callStudent("장훈주", 90, 95, 100);
		
		buyProd("사과", 3000);
		
		//매개변수로 배열 받기
		String[] innames = {"홍길동", "김길동", "마길동"};
		inputArray(innames);
		
		callString("홍길동");
		callString("장훈주");
		callInt(257);
		callName("장훈주");//이름 출력
		callAge(25); //나이 출력
		callWeight(62.8); // 몸무게 출력
		
	}

}


class Person01{
	
	String getName() {
		return "장훈주";
	}
	void call() {
		System.out.println("안녕");
	}
}
