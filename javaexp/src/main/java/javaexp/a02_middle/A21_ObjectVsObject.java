package javaexp.a02_middle;

public class A21_ObjectVsObject {
	/*
	 # 객체와 객체 1:1 관계
	 1. 클래스 내부에 외부에 있는 클래스를 선언하여 활용할 수 있다
	 2. 이것은 객체로 되었을 때, 객체와 객체와의 연관관계를 설정하여 사용할 때, 처리가 되는 부분이다.
	 3. 예를 들어 상점에 가서 물건을 하나 구매시, 연인 관계에 있는 남/여, 사람과 가지고 있는 핸드폰
	 */
	
	public static void main(String[] args) {
		// 구매할 객체 생성
		Fruit f1 = new Fruit("사과", 3000);
		// 마트 객체 생성
		Mart m1 = new Mart("행복마트");
		// 마트에서 구매할 객체 할당
		m1.buyProduct(f1);
		// 구매한 정보내역 출력
		m1.showInfo();
	}

}
class Fruit{
	String name;
	int price;
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void show() {
		System.out.println("물건의 이름: " + name);
		System.out.println("물건의 가격: " + price);
	}
}
class Mart{
	String name; // 마트의 이름
	Fruit fu; // 마트에서 판매하는 과일의 객체
	
	Mart(String name){
		this.name = name;
	}
	
	void buyProduct(Fruit fu) { // Fruit fu = new Fruit("사과", 3000)
		 System.out.println("물건 구매");
		 this.fu = fu; // 결국, 이 객체가 가지고 있는 필드에 객체가 할당된다.
	}
	void showInfo() {
		System.out.println("마트의 이름: " + name);
		System.out.println("Fruit 객체 할당 여부:" + (fu!=null)); // 메모리에 할당이 되어 있으면 true
		// 위에 buyProduct()를 통해서 객체가 할당된 여부에 따라서 해당 Fruit객체를 사용 처리..(if(fu!=null))
		// 만약에 heap 영역에 객체가 생성되지 않는 상황에 해당 객체의 필드를 호출하면 nullPointerException
		// 라는 runtime 에러가 발생하기 때문에 사전에 조건문 확인 후, 처리한다.
		if(fu!=null) {
			System.out.println("구매한 과일은");
			fu.show();
		}else {
			System.out.println("마트에서 Fruit를 구매하지 않음");
		}
	}
	
}