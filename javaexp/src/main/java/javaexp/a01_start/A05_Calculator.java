package javaexp.a01_start;

public class A05_Calculator {

	public static void main(String[] args) {
		/*
		 # 연산자
		 1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
		 		연산자 : 연산에 사용되는 표시나 기호(+,-,*,/,%,=,<=,++...)
		 		피 연산자: 연산ㅇ 대상이 되는 데이터(리터럴, 변수)
		 			30,40,50 ==> 리터럴 데이터
		 			int num01 = 25;
		 			num01 = 30;
		 		연산식 : 연산자와 피연산자를 이용하여 연산의 과정을 기술하는 것
		 			int num01 = 30 + 25;
		 # 자바의 활용 연산자들
		 1. 산술 연산자(사칙 연산자와 나머지 연산자)
		 	1) 종류
		 	+, -, *, /, %
		 	2) 산술 연산자를 처리하면 int형 이상에서 할당하여 처리할 수 있다.
		 	byte num01 = 25;
		 	byte num02 = 30;
		 	byte num03 = num01 + num02; (x)
		 	int num04 = num01+02;
		 	3) 나눗셈의 결과값이 소수점 이하가 되려면, 피연산자가 적어도 하나는 실수이어야 한다
		 	아니면, 형변환을 처리하여야 한다.
		 	10/3 ==> 3
		 	10/3.0 ==> 3.333
		 	10/(double)3 ===> 3.3333
		 	
		 */
		
		int num01 = 25;
		int num02 = 5;
		System.out.println("덧셈: " + num01 + " + "+ num02 + " = " + (num01+num02));
		// () 괄호를 해주어야지 정상적인 연산 결과를 확인할 수 있다. - 연산자 우선순위
		// ex) 위의 형식과 같이 사칙연산자와 나머지 연산자를 이용하여 출력 결과를 처리하세요
		
		System.out.println("나눗셈: " + num01 + " / "+ num02 + " = " + (num01/num02));
		System.out.println("뺄셈: " + num01 + " - "+ num02 + " = " + (num01-num02));
		System.out.println("곱셈: " + num01 + " * "+ num02 + " = " + (num01*num02));
		System.out.println("나머지: " + num01 + " % "+ num02 + " = " + (num01%num02));
		System.out.println("나눗셈과 나머지: " +num01 + " / "+ num02 + " = " + (num01/num02)
				+ " 나머지는 " + (num01%num02));
		// 아래의 내용을 적절한 변수와 연산자를 선언하여 연산식을 만들고 형식에 맞게 출력 하시오
		// ex1) 곰돌이 두 마리가 각각 빵 5개, 과일 3개를 먹었다. 총 먹은 음식의 갯수를 아래와 같이 출력
		//		곰돌이 1 먹은 총 음식: @@
		//		곰돌이 2 먹은 총 음식: @@
		//		총계: @@
		// ex2) 현재 홍길동의 계좌에 1000000이 입금되었다. 오늘 교통비로 5000, 식비로 7000을 소비하여
		//		계좌로 출금할려고 한다.	현 잔액을 출력하세요
		System.out.println();
		
		System.out.println("예제1번");
		int bread = 5;
		int fruit = 3;
		int sum = bread + fruit;
		System.out.println("곰돌이 1 먹은 총 음식: " + (bread+fruit) + "개");
		System.out.println("곰돌이 2 먹은 총 음식: " + (bread+fruit) + "개");
		System.out.println("총계: " + sum*2 + "개");
		
		System.out.println();
		
		System.out.println("예제 2번");
		int acc = 1000000;
		int busmoney = 5000;
		int foodmoney = 7000;
		System.out.print("전체 금액: " + (acc)+", ");
		System.out.print("소비 금액: " + (busmoney+foodmoney)+ ", ");
		System.out.println("현재 잔액: " + (acc-busmoney-foodmoney));
		
	}

}
