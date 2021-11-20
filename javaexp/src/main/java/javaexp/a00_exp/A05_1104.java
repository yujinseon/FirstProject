package javaexp.a00_exp;

public class A05_1104 {

	public static void main(String[] args) {
		//1번 생성자와 메서드의 차이점 기술
		/*
		 메서드는 객체간의 데이터 전달 수단으로써 외부로부터 매개값을 받을 수 있고,
		 리턴값이 있다
		 생성자는 필드를 초기화 하기 위해서 사용되며 리턴 타입이 없다
		 
		 강사님 풀이:
		 1) 객체 생성시
		 	생성자를 통한 데이터 처리는 객체 생성시 한번만 처리할 수 있다
		 	ex) Person p1 = new Person("홍길동", 25, "서울");
		 		p1 = new Person("신길동", 27, "부산"); // heap영역에 다른 객체가 생성이 되기에 객체라고 할 수 없다
		 	
		 	메서드는 계속 2번이상 호출하여 같은 객체에 데이터의 변경이 가능하다
		 		p1.setName("신길동");
		 		p1.setAge(24);
		 		p1.setAge(23);
		 2) 리턴값 처리
		 		생성자는 리턴값이 없다. 주로 매개변수를 통해서 필드의 초기화를 위해서 선언하는 경우가 많다.
		 		메서드는 리턴값이 있다. 외부에서 호출한 데이터를 return 형식으로 처리해준다.
		 3) 공통
		 	매개변수를 통해서 데이터 처리
		 	오버로딩 : 매개변수의 개수, 타입, 타입이 다른 순서
		 */
		
		//3번
		ElProduct ele1 = new ElProduct("전자레인지", 30000);
		ele1.buy1();
		
		ElProduct ele2 = new ElProduct("에어프라이어", 40000);
		int tot = ele2.buy2(3);
		System.out.println(ele2.eletronic+" 총 구매 비용: " + tot);
		
		ElProduct ele3 = new ElProduct("미니냉장고", 150000);
		int totPrice = ele3.buy3(3, 0.2);
		System.out.println("총 금액: " + totPrice);
		
		//4번
		/*
		 생성자와 메서드의 오버로딩이란 형식은 같지만 매개변수의 개수 혹은 타입, 순서가 달라 이름은 같지만
		 여러가지 형태의 객체를 사용할 수 있는것을 말한다
		 */
		Guitar g1 = new Guitar("야마하");
		System.out.println(g1.company);
		Guitar g2 = new Guitar("데임", "통기타");
		System.out.println(g2.company+g2.kind);
		// 메서드의 이름은 같지만 매개변수의 개수가 다르기 때문에 선언이 가능하다
		g1.buy(150000);
		g1.buy(200000, 3);
		
		//5번
		// 일반 변수는 각각의 객체를 공유하지 않지만 static 변수는 객체를 공유한다
		Couple c1 = new Couple(50000, "홍길동");
		Couple c2 = new Couple(70000, "김길동");
		
		c1.money += 20000;
		c1.account += 30000;
		c2.money += 10000;
		c2.account -= 10000;
		System.out.println(c1.name + "의 돈은" + c1.money + "커플 계좌 잔액은" + c1.account);
		System.out.println(c2.name + "의 돈은" + c2.money + "커플 계좌 잔액은" + c2.account);
		
		//6번
		Friend fr1 = new Friend("홍길동" , 50000);
		Friend fr2 = new Friend("김길동", 40000);
		Friend fr3 = new Friend("장길동", 100000);
		
		System.out.println("# 입금 금액: 30000원 #");
		System.out.println(fr1.name + "의 잔액: " + (fr1.money - 30000) + "원");
		System.out.println("여행 경비 잔액: " + (fr1.shareMoney += 30000)+ "원");
		System.out.println(fr2.name + "의 잔액: " + (fr2.money - 30000) + "원");
		System.out.println("여행 경비 잔액: " + (fr2.shareMoney += 30000)+ "원");
		System.out.println(fr3.name + "의 잔액: " + (fr3.money - 30000) + "원");
		System.out.println("여행 경비 잔액: " + (fr3.shareMoney += 30000)+ "원");
		
	}
	
	

}
//3번
class ElProduct{
	String eletronic;
	int price;
	
	ElProduct(String eletronic, int price) {
		this.eletronic = eletronic ; 
		this.price = price;
	}
	
	void buy1() {
		System.out.println(eletronic +" 구매 총 비용: " + price);
	}
	
	int buy2(int cnt) {
		return price * cnt;
	}
	
	int buy3(int cnt, double dis) {
		System.out.println("할인율: " +(dis*100)+"%");
		//(int)(dis*100)+"% 적용 구매 비용:"+price+"원"
		int disPrice = (int)(price*cnt - price * dis);
		return disPrice;		
	}
			
}
//4번
class Guitar{
	String company;
	String kind;
	
	// 두 생성자의 이름은 같지만 매개변수의 개수가 다르기에 성립된다
	Guitar(String company){
		this.company = company;
	}
	
	Guitar(String company, String kind){
		this.company = company;
		this.kind = kind;
	}
	
	void buy(int price) {
		System.out.println(company + "회사의 기타는" + price +"원 입니다");
	}
	
	void buy(int price, int cnt) {
		System.out.println(company + "회사의 기타는" + price +"원 이고" + cnt + "개를 구매 합니다");
	}
		
}

//5번

class Couple{
	//필드
	String name; // 일반변수
	int money; // 일반변수 : 각 객체가 가지고 있는 메모리 영역
	static int account; // static 변수 : 객체가 생성되더라도 공유할 수 있는 메모리 영역
	
	Couple(int money, String name){
		this.name = name;
		this.money = money;
	}
	
}

//6번
class Friend{
	static int shareMoney;
	String name;
	int money;
	
	Friend(String name, int money){
		this.name = name;
		this.money = money;
	}
	/*
	 void addCommMoney(int money) {
	 System.out.println("입금액:" + money);
	 this.money -= money;
	 shareMoney += money;
	 showInfo();
	}
	 void showInfo() {
		 System.out.println(name+"의 정보");
		 System.out.println("개인 계좌 좐액:" + money);
		 System.out.println("친구와 함께 갈 경비:" + shareMoney);
	 }
	 */
}
