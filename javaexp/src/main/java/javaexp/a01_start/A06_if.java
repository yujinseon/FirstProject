package javaexp.a01_start;

public class A06_if {

	public static void main(String[] args) {
		/*
		 # 조건문..
		 1. if(비교연산자)
		 */
		int inputPoint = 80;
		System.out.println("입력한 점수: " + inputPoint);
		if(inputPoint>=70) {
			System.out.println("통과!!");
		}
		System.out.println("처리 끝!");
		/*
		 2. if(비교연산자){
		 	비교 연산자가 true일 경우 처리
		 }else{
		 	비교 연산자가 false일 경우 처리
		 }
		 */
		System.out.println();
		
		int age = 25;
		System.out.println("입력한 나이: " + age);
		if(age>=18) {
			System.out.println("성인입니다!");
		}else {
			System.out.println("미성년입니다!");
		}
		// ex) 가격과 갯수를 변수를 선언하고 할당한 후, 총 비용이 10000이상이면 
		//		10%할인 입니다. 그 외에는 5% 할인입니다를 출력 처리..
		System.out.println();
		System.out.println("예제");
		int price = 3000;
		int num = 3;
		int sum = price * num;
		System.out.println("총 가격: " + sum + "원");
		
		if(sum >= 10000) {
			System.out.println("10% 할인 입니다");
		}else {
			System.out.println("5% 할인 입니다");
		}
		
	}

}
