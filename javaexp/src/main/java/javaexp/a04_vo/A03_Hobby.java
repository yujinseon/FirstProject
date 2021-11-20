package javaexp.a04_vo;

public class A03_Hobby {
	private String name;
	private int price;
	private String time;
	
	// 생성자 생성 source - Generate Constructors from superClass
	public A03_Hobby() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 필드 생성 source - Generate Constructor using Fields
	public A03_Hobby(String name, int price, String time) {
		super();
		this.name = name;
		this.price = price;
		this.time = time;
	}
	
	// get()메서드와 set()메서드 생성 source - Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
}
