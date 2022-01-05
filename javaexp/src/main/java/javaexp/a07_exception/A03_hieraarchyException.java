package javaexp.a07_exception;

public class A03_hieraarchyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 예외의 계층적 처리
		 1. 예외는 다중으로 처리가 가능한데, 상속관계에서 가장 하단에
		 있는 예외를 먼저 처리하고, 뒤쪽 코드에서 상위에 있는 예외를 처리한다
		 2.
		 * */
		try{
			String name = null;
			//System.out.println(name.toString());
			int num01 = 25;
			//System.out.println(num01/0);
			System.out.println(Integer.parseInt("이십오"));
		 }catch(NullPointerException |ArithmeticException e){
			 System.out.println("# null 예외와 수학적 계산 예외(하위예외)");
			 System.out.println(e.getMessage());
		 }catch(Exception e){ //상속 관계 구조에서 최상위 예외를 가장 마지막에 처리한다.
			 System.out.println("#기타예외(최상위예외)");
			 System.out.println(e.getMessage());
		 	 
		 }finally{
		 	System.out.println("finally 처리");
	
		 }
	}
}
