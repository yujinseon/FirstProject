package javaexp.a00_exp;

public class a13_1116 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				System.out.println("5의 배수 출력: " + i);
			}else if(i%2==0) {
				num2 += i;
			}
			
		}
		System.out.println("2의 배수 합산 출력: " + num2);
		
		
	}

}
