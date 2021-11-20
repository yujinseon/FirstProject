package javaexp.a01_start;

public class A02_Print {

	public static void main(String[] args) {
		// 1. 출력 형태
		System.out.println("안녕하세요1");
		System.out.println("안녕하세요2(줄바꿈포함)");
		//	실행 단축키 ctrl + f11
		// 2. System.out.print("줄바꿈하지 않고 출력");
		System.out.print("사과,");
		System.out.print("바나나,");
		System.out.println("딸기!!!");
		System.out.println();
		// ex) 다음과 같은 화면을 위 기능 메서드로 처리해 주세요..
		//	# 좋아하는 과일 종류 #
		//	1. 딸기
		//	2. 바나나
		// 	3. 사과
		//	# 좋아하는 전자제품 #
		//	1. 핸드폰, 2. 컴퓨터, 3. UHD TV
		System.out.println("# 좋아하는 과일 종류 #");
		System.out.println("1. 딸기");
		System.out.println("2. 바나나");
		System.out.println("3. 사과");
		System.out.println("# 좋아하는 전자제품 #");
		System.out.print("1. 핸드폰, 2. 컴퓨터, 3. UHD TV");
	}

}
