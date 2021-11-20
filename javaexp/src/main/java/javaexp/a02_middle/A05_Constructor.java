package javaexp.a02_middle;

public class A05_Constructor {

	public static void main(String[] args) {
		Product p1 = new Product("홍길동");
		// 객체의 참조변수.필드명으로 접근하여 사용할 수 있다.
		System.out.println(p1.name);
		
		Bus b1 = new Bus("651번 버스");
		System.out.println("버스의 번호: " + b1.num);
	}

}
// 클래스 구성요소2 : 생성자
// 1. 주로 필드값을 매개변수로 초기화 한다
//	매개변수	: 생성자나 메서드에서 데이터를 외부에 받을 때, 해당 데이터 유형으로
//	선언한 내용으로 데이터를 전송해서, 받은 데이터를 활용할 때 사용하는 변수이다.
class Product{
	String name;
	//생성자
	Product(String name){
		this.name = name; // 매개변수로 넘어오는 변수명과 필드명이 동일하기에 구분하기 위하여
						// this.필드명으로 선언하여 할당한다.
	}
}
// ex) 클래스로 Bus 선언하고 문자열로 버스 번호를 할당할 수 있게 필드와 생성자를 선언하시오
//	메인 메서드에서 해당 객체를 생성하고,

class Bus{
	String num;
	// 생성자
	Bus(String num){
		this.num = num;
	}
}