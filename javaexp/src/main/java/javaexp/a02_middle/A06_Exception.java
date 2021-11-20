package javaexp.a02_middle;

public class A06_Exception {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("3" + 1/0); // 에러가 발생하면 더 이상 수행 할 수 없음
			// 에러가 나더라도 해당 에러에 대한 표시를 해주고 정상 프로세스를 진행 할 수 있게 하는 것이
			// 예외 처리이다
		}catch(Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
		System.out.println("4");
		System.out.println("5");
	}

}
