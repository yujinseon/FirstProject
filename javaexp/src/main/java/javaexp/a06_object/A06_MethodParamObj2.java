package javaexp.a06_object;

import java.util.ArrayList;

public class A06_MethodParamObj2 {
	//구매 매서드 선언
	//구매할 물건정보(물건명, 가격, 갯수) 출력
	public static void buyProduct(Product p) {
		System.out.println("구매 정보");
		System.out.println("물건명: "+p.getName());
		System.out.println("가격: "+p.getPay());
		System.out.println("갯수: "+p.getCnt());
		System.out.println("총 비용: "+(p.getPay()*p.getCnt()));
	}
	//DB에검색할 내용을 매개변수로 넘기고
	//검색해서 나온 list형 데이터를 ArrayList<VO>객체를 통해서 처리한다.
	public ArrayList<Product> getList(Product sch){
		ArrayList<Product> list = new ArrayList<Product>();
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//물건객체 생성 및 데이터 할당..
		//메서드를 통해 객체 전달..
		Product p = new Product("사과",3000,3);
		buyProduct(p);
		buyProduct(new Product("오렌지",2000,2));
	}

}
//물건 객체 선언
class Product{

	private String name;
	private int pay;
	private int cnt;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int pay, int cnt) {
		super();
		this.name = name;
		this.pay = pay;
		this.cnt = cnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	

}