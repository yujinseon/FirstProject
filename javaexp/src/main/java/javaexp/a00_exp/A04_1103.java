package javaexp.a00_exp;

public class A04_1103 {

	public static void main(String[] args) {
		//1번 - 클래스와 객체의 관계 기술
		/*
		 클래스는 객체를 만들기 위한 큰 틀인 설계도의 역할을 가지고 있고
		 객체는 구현할 대상을 뜻한다.
		 
		 강사님의 풀이
	     클래스는 실제 객체를 만들 설계도 역할을 한다
		 코드로 만들 클래스는 컴파일 단계까지만 진행되며, 이 컴파일 된 클래스는
		 main()가 있는 클래스에서 실행으로 해당 클래스를 new 생성자() 형태로 호출하여 메모리에 로딩할 수 있다
		 클래스명 참조변수 = new 생성자();
		 하나의 선언된 클래스에서 여러개의 객체를 생성할 수 있고, 이렇게 생성된 객체는 heap 영역에 메모리를 만들고,
		 참조변수에 의해서 stack영역에 hea영역의 주소값을 저장하여 처리된다
		 */
		
		//2번
		/*
		 stack 영역은 크기가 고정되어 있는 데이터 유형(int,double,char,String 등등...)이나, 
		 객체의 경우 heap 영역이 주소값이 저장이 되고
		 heap 영역은 배열이나 객체형태로 크기가 커질 수 있는 데이터 유형이 실제 저장되는 곳 이다
		 
		 강사님의 풀이:
		 객체는 생성이 되면 heap 영역에 메모리를 만들어 생성을 하고, 이 heap 영역의 주소값을 stack영역에 참조변수로 저장한다
		 하나의 클래스를 통해서 만들어진 여러 객체들을 각각 다른 heap영역에 저장되기에 다른 주소값을 가진다
		 Person p1 = new Person();
		 Person [2 = new Person();
		 new Person() : 힙 영역에 객체가 생성, p1, p2 참조변수로 힙 영역의 주소값을 스택 영역에 저장한다
		 System.out.pritnln(p1); // 해당 참조변수를 확인할 수 있다
		 ex) 도서관의 실제 책이 있는것(힙 영역에 객체가 생성),
		 	 이 책이 있는 곳을 단말기를 통해 검색해서 그 위치를 파악(스택영역에 힙 영역의 위치 저장)
		 */
		Exp exp = new Exp();
		System.out.println(exp);
		// exp에는 그 heap영역의 메모리 주소를 stack영역에 참조명으로 할당
		// @42f30e0a heap 영역의 주소가 할당
		
		//3번
		/*
		 class Person{
		 
		 }
		 
		 default 생성자는 생성자를 따로 생성하지 않았을때 기본으로 생성자에 생성되고
		 코드에 의해 선언된 생성자가 있는 순간, 기존의 default 생성자는 사라진다
		 
		 강사님의 풀이:
		 1. 클래스만 선언하여도 내부적으로 Person(){} 모양의 생성자가 default로 선언이 된다
		 	그래서, main()메서드를 통해서 Person p01 = new Person();으로 해당 클래스의 생성자를 호출할 수 있다
		 	
		 2. default 생성자는 개발자가 추가 코딩을 통해서 생성자를 선언할 때, 사라진다
		 	이 때는 선언한 생성자가 있을 때만 해당 객체가 생성자를 통해서 생성이 되고, 호출이 가능하다
		 	ex) main()메서드
		 	Person p01 = new Person();와 같은 코드의 경우, 생성자를 선언하지 않을 때는 에러가 발생하지 않지만,
		 	위와 같이 생성자를 매개변수가 있는 생성자를 선언했을 때, 에러가 발생한다
		 	선언하는 순간 default 생성자는 사라진다
		 	
		 3. 기존에 매개변수가 없는 생성자도 에러없이 사용하고 싶으면, 추가하여 default생성자와 모양이 같은 매개변수가
		 	없는 생성자를 선언하면 된다
		 	class Person{
		 		Person(){}
		 		Person(String name){}
		 	}
		 */
		
		//4번
		/*
		 받아 올 매개 변수와 필드 명의 이름이 같기에 구분하려고 필드를 구분하려고 this를 쓴다
		 사용 방법은 this.필드명 이다.
		 
		 강사님의 풀이:
		 class Person{
		 	String name;
		 	int age;
		 	Person(String name, int age){
		 		this.name = name;
		 		this.age = age;
		 		}
		 		 this라는 것은 객체가 생성될 때, 내부적으로 현재 호출된 이 객체를 지칭한다.
		 		 this.필드, this.메서드(), this() 현재 객체의 선언된 생성자를 호출한다.
		 		 외부에서는 참조변수로 호출하여 참조변수.멤버로 처리하지만, 객체에서는 this로 현재 생성된 이 객체를
		 		 지칭한다.
		 		 자바에서는 조금 여유롭게 this라는 키워드를 선언하지 않아도 필드나 메서드를 지칭하지만,
		 		 객체지향적인 프로그램에서 반드시 선언하여야 하는 경우가 많다.
		 		 자바에서는 주로 외부에서 입력되는 매개변수의 변수명과 필드명이 동일할 때, 활용되는 경우가 많다.
		 	}
		 	Person p01 = new Person("홍길동", 25);
		 	p01.name; // 생성자에 의해서 필드값이 할당되어 해당 데이터를 호출하여 사용할 수 있다.
		 	p01.name;
		 	p01.show();
		 	
		 */
		
		//5번
		/*
		 생성자의 이름은 같아도 되나 매개변수의 개수나 타입이 달라아햔다
		 
		 강사님의 풀이:
		 class Person(){
		 	Person(){}
		 	Person(String name){}
		 	Person(String name, int age){}
		 }
		 1. 생성자는 오버로딩 규칙에 의해서 여러 개를 하나의 클래스에서 선언할 수 있다
		 2. 오버로딩 규칙이 있는 근본적인 이유는 외부에서 호출할 때, 다르게 식별하여 호출이 가능하기 때문이다.
		 3. 생성자도 메서드도 이름은 같지만, 매개변수가 다르면 다른 생성자로, 다른 메서드로 식별할 수 있기 때문에
		 	선언이 가능한 것이다.
		 4. 결론적으로 생성자나 메서드는 식별이 가능하게 매개변수가 선언되면 선언이 가능하고 이것을 오버로딩이라고 하는데,
		 	일반적으로 매개변수의 개수, 매개변수의 데이터유형, 매개변수의 선언 순서에 따라서 다른 생성자/메서드를 선언할
		 	수 있는 것을 말한다
		 */
		
		//6번
		Computer com = new Computer("라이젠", "AMD", 16, "2TB");
		com.showInfo();
		
		//7번
		com.changeCpu("인텔");
		
		//8번
		com.ramSpecUp();
		
		//9번
		AirPlane a1 = new AirPlane("아시아나", 300, 125);
		AirPlane a2 = new AirPlane("대한항공", 250, 325);
		
		a1.getonPassNum(150);
		a1.speedUp();
		a1.speedDown();
		a1.getoffPassNum(57);
		
		a2.getonPassNum(77);
		a1.speedUp();
		a1.speedDown();
		a1.getoffPassNum(30);
		
		//10번
		Bus bus = new Bus(651, "방화역", "풍무역", 5);
		bus.loadPerson(2);
	}

}
//2번
class Exp{
	
}

//6번
// Computer Class Start
class Computer{
	String company;
	String cpu;
	int ram;
	String hdd;
	
	Computer(String company, String cpu, int ram, String hdd){
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	void showInfo() {
		System.out.println("#컴퓨터의 정보#");
		System.out.println("제조사: " + company);
		System.out.println("cpu: " + cpu);
		System.out.println("ram: " + ram);
		System.out.println("hdd: " + hdd);
	}
	
	// 7번
	void changeCpu(String chCpu) {
		this.cpu = chCpu;
		System.out.println("변경 후 cpu: " + cpu);
	}
	
	//8번
	void ramSpecUp() {
		ram *= 2;
		System.out.println("2배 증가된 램 용량: " + ram);
	}	
}
//Computer Class End

//9번
// AirPlane 클래스 Start
class AirPlane{
	String company;
	int speed;
	int pass;
	
	AirPlane(String company, int speed, int pass){
		this.company = company;
		this.speed = speed;
		this.pass = pass;
	}
	
	void currentSpeed() {
		System.out.println("현재 속도는 " + speed + " km/h 입니다");
	}
	
	//현재 속도를 올리는 처리
	void speedUp() {
		speed += 10;
		currentSpeed();
	}
	
	//현재 속도를 내리는 처리
	void speedDown() {
		speed -= 5;
		currentSpeed();
	}
	
	//탑승 객 수 탑승 누적 처리
	void getonPassNum(int getonPass) {
		pass += getonPass;
		System.out.println(getonPass+"명이 승차하였습니다");
		System.out.println("현재 탑승 인원은: " + pass + "명 입니다");
	}
	
	//탑승 객 수 하차 누적 처리
	void getoffPassNum(int getoffPass) {
		pass -= getoffPass;
		System.out.println(getoffPass+"명이 하차 하였습니다");
		System.out.println("현재 인원은 " + pass + " 명 입니다");
	}
}

//10번
class Bus {
	int busNum;
	String start;
	String end;
	int loadNum;
	
	Bus(int busNum, String start, String end, int loadNum){
		this.busNum = busNum;
		this.start = start;
		this.end = end;
		this.loadNum = loadNum;
	}
	
	void loadPerson(int cnt) {
		loadNum += cnt;
		System.out.println("탑승 한 인원 수 : " + cnt);
		System.out.println("현재 탑승 승객 수 : " + loadNum);

	}
}

