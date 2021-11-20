package javaexp.a04_vo;

public class A04_Screen {
	private String title;
	private int price;
	private int cnt;
	public A04_Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A04_Screen(String title, int price, int cnt) {
		super();
		this.title = title;
		this.price = price;
		this.cnt = cnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
