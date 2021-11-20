package javaexp.a02_middle;

public class A01_Memory {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		// Person객체는 heap영역에 저장되는데, stack영역에서는 
		// 해당 객체의 주소만 저장한다.
		// @42f30e0a heap 영영의 주소
		System.out.println("p1객체의 heap영역 주소:" + p1);
		System.out.println("p2객체의 heap영역 주소:" + p2);
	}

}

class Person{} // Person 클래스를 선언

