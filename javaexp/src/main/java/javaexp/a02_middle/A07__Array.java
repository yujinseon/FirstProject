package javaexp.a02_middle;

public class A07__Array {

	public static void main(String[] args) {
		/*
		 # 배열이란?
		 1. 같은 타입의 데이터를 연속된 공간에 저장하는 자료구조
		 2. 각 데이터 저장 위치는 인덱스(0부터 시작 ) 부여해 접근
		 # 배열의 장점
		 1. 중복된 변수 선언 줄이기 위해 사용
		 2. 반복문 이용해 요소들을 쉽게 처리
		  	ex) 
		  	int sum = score1;
		  	sum += score2;
		  	sum += score3;
		  	int avg = sum/30;
		  	int sum = 0;
		  	for(int idx =0;idx<30;idx++){
		  		sum+=score[idx];
		  	}
		  	int avg = sum/30;
		 */
		// # 배열 선언
		// 1. 배열을 사용하기 위해 우선 배열 변수를 선언하여야 한다.
		// 	  타입[] 변수명
		int[] intArray;
		double dblArray[];
		// 2. 배열 변수는 참조 변수 - 배열 생성되지 전 null 초기화 가능
		String strArray[] = null;
		//	heap 영역에 객체가 만들어지지 않는 상황이라서 배열의 index를 사용하면 에러 발생
//		System.out.println(strArray[0]);
		// 3. 값 목록으로 배열 생성하는 방법
		// 	1) 변수 선언과 동시에 값 목록 대입..
		//		데이터타입[] 변수 = {값1,값2,값3....};
		int[] prices = {3000,4000,5000};
		//	2) 변수 선언 후 값 목록 대입
		//		변수 = new 타입[]{값1, 값2, 값3...};
		intArray = new int[] {10,20,30};
		// 4. new 연산자로 값이 할당되지 않는 배열 생성. (객체생성)
		//	1) 배열 생성시 값을 가지고 있지 않음
		//	2) 향후 값들을 저장할 배열을 미리 생성하고 싶은 경우
		//		타입[] 변수 = new 타입[길이];
		double heights[] = new double[3];
		//	스택 영역에 heights, 힙 영역에 실수가 3개 들어갈 수 있는 배열형 객체 생성
		//	5. 배열의 길이
		//		1) 배열에 저장할 수 있는 전체 항목수
		//		2) 배열의 길이 : 배열변수.length
		//		3) 배열의 길이는 읽기 전용
		System.out.println("heights의 길이:" + heights.length);
		// 6. 배열의 index로 접근하여 호출하거나 데이터를 저장할 수 있다
		//	  배열명[index번호] : index 번호는 0부터 시작한다
		heights[0] = 30.7;
		heights[1] = 40.7;
		heights[2] = 50.7;
		System.out.println("두번쨰 배열의 데이터:" + heights[1]);
		//	크기 이상의 배열을 호출하면 에러가 발생
//		heights[3] = 150.7;
		String[] names = null;
		names = new String[3];
		names[0] = "홍길동1";
		names[1] = "홍길동2";
		names[2] = "홍길동3";
		int[] kors = {90,80,70};
		System.out.println("이름\t국어점수");
		System.out.println(names[0]+"\t"+kors[0]);
		System.out.println(names[1]+"\t"+kors[1]);
		System.out.println(names[2]+"\t"+kors[2]);
		
	}

}
