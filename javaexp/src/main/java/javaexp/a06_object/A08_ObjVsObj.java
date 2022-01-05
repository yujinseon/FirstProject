package javaexp.a06_object;

public class A08_ObjVsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SPhone sp = new SPhone("갤럭시S21");
		SPerson ss = new SPerson("홍길동",sp);
		ss.showInfo();
	}

}
class SPerson{
	private String name;
	private SPhone sp;
	public SPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SPerson(String name, SPhone sp) {
		super();
		this.name = name;
		this.sp = sp;
	}
	public void showInfo() {
		
		System.out.println(name);
		if(sp!=null) { //setProd를 통해서 객체가 할당 되었을때
		
			System.out.println("핸드폰명:"+sp.getName());
		}else { //객체가 할당되지 않았을 때
			System.out.println("할당되지 않았습니다");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SPhone getSp() {
		return sp;
	}
	public void setSp(SPhone sp) {
		this.sp = sp;
	}
	
}

class SPhone{
	private String name;

	public SPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SPhone(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}