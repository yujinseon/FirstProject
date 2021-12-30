package javaexp.a06_object.vo;

public class Product {
	private String pname;
	
	public Product(String pname) {
		this.pname = pname;
	}
	public void buy() {
		System.out.println("물건 "+pname+" 구매");
	}
}
