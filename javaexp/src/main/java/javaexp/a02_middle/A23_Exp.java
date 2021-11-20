package javaexp.a02_middle;

public class A23_Exp {

	public static void main(String[] args) {
		Com01 com = new Com01("삼성");
		com.setMouse(new Mouse("검정색")); // 바로 할당
		com.showInfo();
		
		//Mouse mouse = new Mouse("검은색");
		//com.setMouse(mouse);
		//com.showInfo();
		
	}

}
//ex) Com01 클래스와 				Mouse 클래스를 선언하고, 1:1 관계로 설정하여,
//		속성: 제조사				속성: 색상
//		메서드1:setMouse			메서드1:show() 마우스의 색깔은 @@@
//		메서드2:showInfo()

class Com01{
	String com;
	Mouse m1;
	Com01(String com){
		this.com = com;
	}
	
	void setMouse(Mouse m1) {
		this.m1 = m1;
		System.out.println("마우스 장착!!");
	}
	
	void showInfo() {
		System.out.println("컴퓨터의 제조사: " + com);
		if(m1 != null) {
			m1.show();
		}else {
			System.out.println("마우스가 장착되지 않았습니다");
		}
		
	}
}

class Mouse{
	String color;
	
	Mouse(String color){
		this.color = color;
	}
	
	void show() {
		System.out.println("마우스의 색상은 " + color + "입니다");
	}
}