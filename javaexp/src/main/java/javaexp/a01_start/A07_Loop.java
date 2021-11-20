package javaexp.a01_start;

public class A07_Loop {

	public static void main(String[] args) {
		// # 반복문의 기본 형식
		// for(초기값; 조건식; 증감식;){
		//	반복할 내용
		// }
		for(int i=1; i<=10; i++) {
			System.out.println("카운트: " + i);
		}
		// 10~20
		System.out.println("# 10~20 ");
		for(int i=10; i<=20; i++) {
			System.out.println("카운트: " + i);
		}
		// ex1) 30~50까지 출력
		System.out.println("30~50까지 출력");
		for(int i=30; i<=50; i++) {
			System.out.println("카운트: " + i);
		}
		System.out.println();
		for(int i=100; i>=90;i--) {
			System.out.print(i+",");
		}
		System.out.println();
	}

}
