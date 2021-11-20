package javaexp.a00_exp;

public class A12_1115 {

	public static void main(String[] args) {
		String [] arr = new String[50];
		String num = "";
		
		for(int i=0; i<=50; i++){
			num = String.valueOf(i);
			
			if(num.contains("3")||num.contains("6")||num.contains("9")) {
				System.out.println("짝");
					if(num.equals("33")|| num.equals("36")||num.equals("39")) {
						System.out.println("짝짝");
					}
			}else {
				System.out.println(num);
			}
	}

}
}
