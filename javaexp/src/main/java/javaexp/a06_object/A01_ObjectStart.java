package javaexp.a06_object;

import javaexp.a06_object.vo.Car;
import javaexp.a06_object.vo2.Bus;
import javaexp.a06_object.vo3.Truck;

public class A01_ObjectStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # class와 객체와의 관계
		 1. class : 객체를 만들기 위한 도면 역할을 한다
		 2. 객체 : 선언된 클래스를 아래의 형식으로 main()메서드가 있는 곳에서
		 	생성자를 통해 생성할 수 있다.
		 	Car c1 : 클래스명(Car), 참조변수(c1)
		 	new Car() : heap메모리에 객체를 생성자를 통해 생성
		 		class 내부에 default 생성자에 의해 생성된다
		 		
		 * */	
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println("heap영역의 주소값확인:"+c1);
		System.out.println("heap영역의 주소값확인:"+c2);
		/*
		 # 객체의 메모리 사용
		 1. stack : 객체의 주소값 cf) 도서관 책을 검색하는 단말기 위치 print
		 2. heap : 객체의 실제 메모리 cf) 실제 위 위치 print로 책을 찾음
		 * */
		
		//c1.name : 객체가 있는 heap 영역의 주소를 찾아가서, 해당 객체의
		//필드값(name)으로 호출
		System.out.println("heap영역의 주소값확인:"+c1.name);
		Bus b1 = new Bus();
		Bus b2 = new Bus();
		//System.out.println("heap영역의 주소값확인:"+b1);
		//System.out.println("heap영역의 주소값확인:"+b2);
		System.out.println("heap영역의 주소값확인:"+b1.bnum);
		
		Truck t1 = new Truck();
		System.out.println("heap영역의 주소값확인:"+t1.speed);
	}

}
