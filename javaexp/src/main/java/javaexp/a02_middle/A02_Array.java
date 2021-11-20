package javaexp.a02_middle;

public class A02_Array {

	public static void main(String[] args) {
		// 배열의 선언
		int[] array;
		// 배열의 객체 생성 : 3의 길이를 가진 정수형 배열
		array = new int[3]; 
		// 0부터 시작하는 index별로 배열의 데이터 할당.
		array[0] = 25;
		array[1] = 30;
		array[2] = 40;
		System.out.println("배열의 첫번째 데이터:" + array[0]);
		System.out.println("배열의 두번째 데이터:" + array[1]);
		System.out.println("배열의 세번째 데이터:" + array[2]);
		System.out.println();
		// ex) points 배열로 국어 영어 수학 점수를 할당하고, 출력 처리하세요.
		int[] points = {90,93,91};
		System.out.println("국어 점수:" + points[0]);
		System.out.println("영어 점수:" + points[1]);
		System.out.println("수학 점수:" + points[2]);
	}

}
