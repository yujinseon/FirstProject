package javaexp.a01_start;

public class A04_DataType {

	public static void main(String[] args) {
		/* 다중행 주석
		 1. 정수형과 실수형 데이터 처리
		 2. char 유형의 변경..
		 */
		int num01 = 25;
		double num02 = 30.45;
		System.out.println("정수형 데이터: " + num01);
		System.out.println("실수형 데이터: " + num02);
		char ch01 = 'A'; // 홑 따옴표로 문자 한 자를 할당할 수 있다
		System.out.println("문자형 데이터: " + ch01);
		// char -> char[](문자열) -> String 문자열
		int code01 = 66;
		char ch02 = (char)code01; // int형의 값을 형변환으로 char로 할당하면 해당 코드 값에 연결된
		// 문자가 할당될 수 있다.
		System.out.println(code01+"의 문자: "+ch02);
		System.out.println();
		// ex) 학생의 이름, 국어, 영어, 수학 점수 선언
		//		총점 데이터를 선언하고 국어, 영어, 수학 점수를 할당
		// 		평균 데이터 총점/3.0으로 실수값을 할당하고
		// 		아래 형식으로 출력
		//		학생 이름 : @@
		//  	국어 : @@
		//		영어 : @@
		//		수학 : @@
		//		총점 : @@
		//		평균 : @@
		String name = "홍길동";
		int kor = 90, eng = 90, math = 90;
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		System.out.println();
		int apple = 3000, banana = 4000, stberry = 12000 ;
		int sum2 = apple*2 + banana*3 + stberry*5;
		System.out.println("총 비용: " + sum2);
	}

}
