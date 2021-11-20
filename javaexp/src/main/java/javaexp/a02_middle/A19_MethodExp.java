package javaexp.a02_middle;

public class A19_MethodExp {

	public static void main(String[] args) {
		Screen scr = new Screen("인셉션", 7000);
		int mPrice = scr.buy(2);
		System.out.println("총 금액: "+mPrice);
	}

}
// ex) Screen 필드 영화제목/입장료/입장 관객수
class Screen{
	//필드
	String title;
	int price;
	int cnt;
	
	//생성자
	Screen(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	//메서드
	int buy(int cnt) {
		this.cnt = cnt;
		System.out.println("# 영화구매 #");
		System.out.println("영화명:"+title);
		System.out.println("입장료:"+price+"원");
		System.out.println("입장 관객수:"+cnt+"명");
		return price * cnt;
	}
}