package javaexp.a02_middle;

public class A17_ClassExp {
/*
 	# 메서드 리턴값 처리와 오버로딩 처리.
 	1. 객체가 만들고, 메서드를 처리할 때, 리턴값이 있다
 		이 리턴값을 해당 메서드에서 호출하는 곳으로 데이터를 전달하는 것을 말한다
 		
 	2. 객체의 경우, 생성자를 통해서 필드값에 데이터를 할당하고,
 		현재 할당한 필드값을 기능 메서드에 의해서 호출하여 리턴하여 사용할 수 있다
 		
 	3. 여러 개의 매개변수에 의해 데이터값을 초기화 및 기존 필드값에 영향을 미쳐서 리턴하는 처리
 */
	public static void main(String[] args) {
		Prod p1 = new Prod();
		String name = p1.getName();
		System.out.println("리턴된 값:"+name);
		Prod p2 = new Prod("딸기");
		String fpname = p2.getPname();
		System.out.println("생성자 입력 후, 메서드 리턴값:"+fpname);
		Prod p3 = new Prod("사과",3000);
		//
		int lastPrice =p3.dicCount(0.2); // 20%할인된 금액
		System.out.println("최종 금액:" + lastPrice + "원");
	}

}
class Prod{
	String pname;
	int price;
	
	Prod(){} // 기존 생성자 선언
	Prod(String pname){
		this.pname = pname;
	}
	Prod(String pname, int price){
		this.pname = pname;
		this.price = price;
	}
	// 등록된 기준되는 가격을 기능 메서드의 매개변수에 의해 할인이 되어,
	// 할인된 값을 리턴 처리
	int dicCount(double dis) {
		System.out.println("# 현재 제품 정보 #");
		System.out.println("물건명: " +pname);
		System.out.println("가격: "+price);
		// 1.0 ==> 100%, 0.1 ==> 10%
		System.out.println("할인율: " +(dis*100)+"%");
		int disPrice = (int)(price-price * dis); // 할인된 최종금액을 리턴
		return disPrice;
	}
	
	String getPname() {
		return pname;
	}
	
	
	String getName() {
		return "사과";
	}
}
