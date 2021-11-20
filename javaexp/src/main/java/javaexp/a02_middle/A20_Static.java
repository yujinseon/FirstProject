package javaexp.a02_middle;

public class A20_Static {

	public static void main(String[]args) {
		Building63.drawPay = 3000000; // 객체의 종속된 변수가 아니고, 클래스의 종속된 변수 클래스명.변수
		Building63 b1 = new Building63("서울", "홍길동");
		Building63 b2 = new Building63("부산", "김길동");
		Building63 b3 = new Building63("제주도", "마길동");
	  //b3.drawPay = 3000000; // 특정한 객체에 static변수의 데이터를 설정하면, 모든 객체에 영향을 미쳐서
							  // 동일한 데이터를 확인 할 수 있다
		System.out.println(b3.drawPay+"\t"+b3.loc);
		System.out.println(b2.drawPay+"\t"+b2.loc);
		System.out.println(b1.drawPay+"\t"+b1.loc);
		
		//예제) 커플 객체 두개를 만들고, 각각의 계좌잔액에 입금, 출금 했을 때 계좌 잔액을 공유하게 하시오
		Couple cp1 = new Couple("홍길동", "남자");
		Couple cp2 = new Couple("김미미", "여자");
		
		cp1.account += 3000;
		cp2.account += 5000;
		cp2.account -= 1000;
		System.out.println("계좌 잔액: " + Couple.account); // static 변수는 객체를 공유한다
		// 즉 각각 저장되는 것이 아닌 static 변수의 객체를 공유하기에 데이터를 공유
	}
	
	/*
	 # static
	 1. 일반 멤버(필드, 메서드)들 각 객체마다 다른 메모리를 기능을 수행할 수 있다.
	 	가지고 있는 구성요소에 다른 메모리로 각각 수행할 수 있다.
	 
	 2. 하나의 클래스로 부터 만들어지는 객체들이 new를 통해 생성되는 이 생성된 모든 객체들이
	 	가지는 <<공유 메모리 영역>>을 사용하고자 할 때, static을 붙여서 사용할 수 있다.
	 ex) 빌딩(객체)이 많이 만들어지더라도 도면의 가격은 동일하게 적용되어야 할 때, 사용 하듯이
	 	 static 변수도
	 	 
	 3. static변수는 객체가 공유하기에 아예, 객체 생성없이 클래스명.static변수명으로 사용할 수 있다.
	 
	 4. 클래스로부터 만들어지는 모든 객체들이 특정한 변수(static)인 경우에 공유가 필요로 하여, 공유할 수 있는 메모리를
	 	만들 경우에 변수명 앞에 static을 붙여준다
	 
	 5. static 메서드는 공유 메서드로 주로 static 변수의 데이터를 입력하거나 리턴할 때, 사용된다..
	 */
	
}
class Building63{
	String loc;
	String owner;
	static int drawPay;
	Building63(String loc, String owner){
		this.loc = loc;
		this.owner = owner;
	}
}

class Couple{
	//필드
	String name;
	String sex;
	static int account;
	
	Couple(String name, String sex){
		this.name = name;
		this.sex = sex;
	}
	
}