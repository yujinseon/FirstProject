package javaexp.a02_middle;

public class A03_ClassVsObject {

	public static void main(String[] args) {
		// 클래스명 참조변수명 = new 생성자명();
		// 클래스를 기준으로 하나의 객체가 만들어진다
		Food f1 = new Food();
		Food f2 = new Food();
		Food f3 = new Food();
		// 하나의 도면으로 여러 개의 건물을 만들 수 있듯이,
		// 하나의 클래스로 여러 개의 객체가 만들어 질 수 있다.
		// heap 영역상의 객체의 위치는 참조변수에 따라서 다르게 나타난다.
		// 참조변수(위치 값)은 stack 영역에 할당 되어 있다.
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	}

}
// Food라는 하나의 클래스가 선언됨..
class Food{
	
}