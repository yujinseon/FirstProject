package javaexp.a01_start;

import java.util.*;
public class A09_InputExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 과일을 입력하세요?");
		String fruit = sc.nextLine();
		System.out.println("입력된 과일명 : " + fruit);
		System.out.println("과일의 가격을 입력하세요?");
		int price = sc.nextInt();
		System.out.println("과일의 가격: " + price);
		System.out.println("과일의 개수를 입력하세요?");
		int cnt = sc.nextInt();
		System.out.println("과일의 개수: " + cnt);
		System.out.println("총 비용: " + price * cnt);
		
	}

}
