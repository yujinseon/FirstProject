package javaexp.a02_middle;

public class A12_MethodProcess {
	
	/*
	 # 메서드의 기능 프로세스 처리
	 1. 메서드는 입력값을 통해, 조건문이나 반복문을 이용하여,
	 	원하는 결과값을 프로세스로 처리하여,
	 	저장하거나, 출력, 리턴 처리할 수 있다.
	 	ex) 자판기에 금액을 입력하고, 선택을 했을 때, 해당하는 물건이나오고,
	 		잔액도 처리하여 나오는 경우와 같이 메서드는 기능 프로세스를 중괄호{}에서
	 		처리한다.
	 */
	// 김밥의 단가가 2500일때, 매개변수로 입력된 갯수를 받아서 총액을 리턴 처리하는 메서드
	static int calcuTot(int cnt) {
		System.out.println("주문한 김밥의 갯수:" + cnt + "줄");
		int price = 2500;
		System.out.println("김밥의 단가:" + price + "원");
		return price*cnt;
	}
	// ex) 단가가 2000원인 사과과 있고, 매개변수로 주문 수량을 입력했을 때, 총액을 리턴받아서 출력
	static int calcuApple(int cnt) {
		System.out.println("# 단가 2000 사과 예제 #");
		System.out.println("주문 수량: " + cnt + "개");
		int price = 2000;
		System.out.println("사과의 단가: " + price + "원");
		return price*cnt;
	}
	static int productTot(String name, int price, int cnt) {
		System.out.print(name+"\t");
		System.out.print(price+"\t");
		System.out.print(cnt+"\t");
		System.out.print(price*cnt+"\t");		
		return price*cnt;
	}
	// ex) 구구단의 시작 단수와 곱한 내용을 입력 받아, @@ X @@ = @@ 형식으로 출력하고, 그 결과값을
	//	  리턴하고, 외부에서는 guguTot이라는 변수로 누적하여, 최종 결과를 출력하게 하세요..
	//	  구구단 임의로 3개 정도 처리하세요
	
	static int gugudan(int first, int second) {
		System.out.println(first +" X "+second+" = " +(first * second));
		return first*second;
	}
	
	public static void main(String[] args) {
		// 구구단 입력 예제
		System.out.println("# 구구단 입력 예제 #");
		int guguTot = 0;
		guguTot += gugudan(3,5);
		guguTot += gugudan(8,5);
		guguTot += gugudan(6,3);
		System.out.println("결과 값의 합: " + guguTot);
		System.out.println();
		
		// 깁밥 단가 예제
		System.out.println("# 김밥 단가 예제 #");
		int totMoney = calcuTot(3); // 기능 메서드를 호출하여 메모리에 메서드의 결과값(7500)을 받아서 
									// totMoney에 할당한다
		System.out.println("총 비용:" + totMoney + "원");
		System.out.println();
		
		// 사과 단가 예제
		System.out.println("# 사과 단가 예제 #");
		int totMoney1 = calcuApple(5);
		System.out.println("총 액:" + totMoney1 + "원");
		
		int tot=0;
		System.out.println("# 물건 구매 내역 #");
		tot += productTot("사과", 3000, 2);
		tot += productTot("바나나", 4000, 3);
		tot += productTot("오렌지", 2000, 5);
		System.out.println("총 비용:" + tot + "원");
	}

}
