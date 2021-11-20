package javaexp.a02_middle;

public class A22_ObjectVsObject {

	public static void main(String[] args) {
		SmartMan sm = new SmartMan("장훈주"); // 필드 name에 데이터 할당
		Phone p1 = new Phone("Apple");
		sm.buyPhone(p1); // 생성된 객체는 buyPhone 메서드에 의해 할당.
		sm.showInfo();
	}

}
// ex1) 사람이 소유한 폰을 1:1 관계로 설정하여 처리되는 것을 진행하세요

/*
 1단계: (이름, 폰) 클래스 선언
 2단계: 객체 생성 SmartMan sm = new SmartMan("장훈주");
 3단계: 메서드를 통해서 외부에 객체가 생성되어 배개변수로 할당되고,
 		이것이 필드(Phone p01)에 할당된다
 		sm.buyPhone(new Phone("애플"));
 4단계: showInfo(); 를 통해서 현재 정보를 출력
 		
 */
class SmartMan{
	// 사람의 이름 : 생성자를 통해서 할당
	// 핸드폰 객체 메모리 선언
	Phone p01;
	//사람의 이름: 생성자를 통해서 할당
	String name;
	// 생성자
	SmartMan(String name){
		this.name = name;
	}
	//메서드1 buyPhone
	void buyPhone(Phone p01) {
		this.p01 = p01;
		System.out.println(name + "가 폰을 구매하다");
	}
	
	//메서드2 showInfo() 사람을 이름과 구매한 핸드폰 제조사 출력 
	void showInfo() {
		System.out.println("이름:"+name);
		if(p01!=null) { // p01이 heap영역에 객체가 생성되어 있을 때..
			System.out.println("가지고 있는 폰!");
			p01.show();
		}else {
			System.out.println("핸드폰을 구매하지 않았습니다");
		}
		
	}
}

class Phone{
	// 핸드폰 제조사 속성 선언 생성자를 통해서 할당
	String com;
	
	Phone(String com){
		this.com = com;
	}
	void show() {
		System.out.println("핸드폰의 제조사:"+com);
	}
}