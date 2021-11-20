package javaexp.a02_middle;

public class A04_Field {

	public static void main(String[] args) {
		//객체 생성
		Book b1 = new Book();
		// 참조변수.필드명 = 데이터 할당..
		b1.title = "자바 기초";
		b1.price = 28000;
		
		Book b2 = new Book();
		b2.title = "jsp 시작";
		b2.price = 30000;
		// sysout 후 ctrl+space 하면 자동 완성
		System.out.println("# b1 객체의 데이터");
		System.out.println(b1.title + ":" + b1.price);
		System.out.println("# b2 객체의 데이터");
		System.out.println(b2.title+":"+b2.price);
	}

}
class Book{
	String title; // 객체가 할당할 수 있는 데이터를 저장하는 곳 : 필드
	int price;
	Book(){} // 선언하지 않더라도 사용할 수 있는 생성자
	
}
