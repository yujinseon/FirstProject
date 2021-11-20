package javaexp.a00_exp;
import java.util.*;
public class A11_1112_2 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*9 + 1);
		int b = (int)(Math.random()*9 + 1);
		
		Scanner sc = new Scanner(System.in);
		int c = a*b;
		
		System.out.println(a+"X"+b+"의 정답을 입력해주세요:");
		int result = sc.nextInt();
		
		if(a*b==result) {
			System.out.println("정답입니다");
		}else {
			System.out.println("오답입니다");
		}
	}

}
