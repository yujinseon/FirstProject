package javaexp.a04_vo;

public class A02_Person {
	// 필드값을 private로 설정하여 외부의 직접적인 접근을 막는다
	private String name;
	private int age;
	private String loc;
	// 매개변수가 없는 생성자 자동 생성
	public A02_Person() {
		// super(): 상위 클래스의 생성자를 호출
		super();
		
	}
	
	// 필드값을 초기화하는 생성자 자동 호출
	public A02_Person(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	
	// 필드의 저장메서드 setXXX(). 호출메서드를 getXXX()
	// 읽기와 쓰기를 메서드로 분리시켜 객체의 필드를 보호한다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	

}
