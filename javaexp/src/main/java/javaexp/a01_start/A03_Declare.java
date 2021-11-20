package javaexp.a01_start;

public class A03_Declare {

	public static void main(String[] args) {
		// #선언
		// 데이터유형 사용할이름;
		int num01; // 정수형 데이터를 할당 할 것이고, 이름을 num01이라고 명명
		// 변수명 = 값;
		num01 = 25; // num01 이라는 변수에 25가 할당이 됨
		System.out.println(num01); // num01을 통해서 할당된 데이터를 출력
		System.out.println("num01에 할당된 데이터는 " + num01 + "입니다");
		// ex) 사과의 가격(price)을 변수로 선언하고, 3000 할당하여 출력
		// 		개수를 변수(cnt)로 선언하고, 3을 할당하고 출력
		
		int price = 3000;
		int cnt = 3;
		
		System.out.println("사과의 가격은 " + price + "원 이고, 구매한 개수는 " 
				+ cnt +"개 입니다.");
	}

}
