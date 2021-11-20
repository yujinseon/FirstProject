package javaexp.a02_middle;

public class A15_ClassExp {

	public static void main(String[] args) {
		Book01 b1 = new Book01();
		Book01 b2 = new Book01();
		Book01 b3 = new Book01();
		// 매개변수가 있는 생성자
		Book01 b4 = new Book01("해리포터", "타라덩컨");
		Book01 b5 = new Book01("자바", "스프링");
		
		b1.title = "해리포터";
		b2.title = "율리시스 무어";
		b3.title = "타라덩컨";
		
		b1.price = 7000;
		b2.price = 8000;
		b3.price = 9000;
		
		System.out.println("첫 번째 책 이름: " + b1.title + "\t" +"가격: " + b1.price);
		System.out.println("두 번째 책 이름: " + b2.title + "\t" +"가격: " + b2.price);
		System.out.println("세 번째 책 이름: " + b3.title + "\t" +"가격: " + b3.price);
		//매개변수가 있는 생성자 출력
		System.out.println("책 이름 출력: " + b4.title1 + "," + b4.title2);
		
	}

}
//ex) Book 클래스에 도서명과 가격을 설정하여
class Book01{
	String title;
	String title1;
	String title2;
	int price;
	// 기본 생성자
	Book01(){}
	// 매개변수가 있는 생성자
	Book01(String title1, String title2){
		this.title1 = title1;
		this.title2 = title2;
	}
}

