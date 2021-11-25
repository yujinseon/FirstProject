package javaexp.a00_exp;

public class A01_1029 {

	public static void main(String[] args) {
		/*
		 1. 자바의 기본 변수 선언과 할당을 통해 아래의 변수를 선언하고 출력하세요
		 	이름 나이 취미
		 2. 변수와 사칙연산자와 나머지 연산을 활용하여 아래와 같은 내용을 처리하세요
		 	1) 곰돌이 3마리가 5개씩 빵을 먹은 총 갯수
		 	2) 20개의 빵을 3마리의 곰돌이가 동이랗게 먹은 갯수와 남은 나머지
		 	3) 총 잔액 100000에서 교통비300 2회 식대 7000, 간식비 3000을 뺀 나머지
		 3. 컴퓨터 가격이 1000000이상이면 고가 그 외에는 저가로 처리하기로 했다
		 	해당 프로그램을 조건문에 의하여 처리하고 출력
		 4. 반복문을 이용하여 15~45까지 출력하고, 10부터 discount 0까지 출력하세요
		 5. 자바의 heap 영역과 stack 영역에 대하여 객체의 메모리 사용 방법을 예제를 통해 기술하세요
		 */
		
		System.out.println("예제 1번");
		String name = "홍길동";
		int age = 25;
		String hobby = "축구";
		
		System.out.print("이름: " + name + " 나이: " + age + " 취미: " + hobby);
		System.out.println();
		
		System.out.println("예제 2번");
		int bear1 = 3, bread1 = 5, bread2 = 20;
		int account = 100000, busPay = 3000, foodPay = 3000;
		System.out.println("곰돌이 3마리가 5개씩 빵을 먹은 총 개수: " + bear1*bread1);
		System.out.println("20개의 빵을 3마리의 곰돌이가 동일하게 먹은 개수와 남은 나머지 -> " + 
								"먹은 개수: " + (bear1*bread2)+ " " + "나머지 개수: " + (bear1%bread2));
		System.out.println("총 잔액 100000에서 교통비 3000 2회 식대 7000, 간식비 3000을 뺸 나머지 ->" + 
								"나머지 금액: " + (account - busPay*2 - 7000));
		
		 System.out.println("예제 3번");
		 int comPrice = 600000;
		 if(comPrice >= 1000000 ) {
			 System.out.println("고가입니다");
		 }else {
			 System.out.println("저가입니다");
		 }
		 
		 System.out.println("예제 4번");
		 for(int i=15; i<=45; i++) {
			 System.out.print(i + ",");
		 }
		 System.out.println();
		 for(int i=10; i>=0; i--) {
			 System.out.print(i + ",");
		 }
		 
		 System.out.println();
		 System.out.println("예제 5번");
		 Example e1 = new Example();
		 Example e2 = new Example();
			// Example객체는 heap영역에 저장되는데, stack영역에서는 
			// 해당 객체의 주소만 저장한다.
			// @42f30e0a heap 영역의 주소
			System.out.println("e1객체의 heap영역 주소:" + e1);
			System.out.println("e2객체의 heap영역 주소:" + e2);
	}

}

class Example{} // Example 클래스를 선언
