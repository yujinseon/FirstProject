package javaexp.a02_middle;

public class A24_Exp {

	public static void main(String[] args) {
		Car01 car = new Car01("포르쉐", 120, 3000);
		car.setDriver(new Driver("장훈주",25,"김포"));
		
		car.driving();
		car.speedUp();
		car.speedUp();
		car.speedDown();
		car.loadPerson(2);
	}

}
// ex) Car vs Driver 
// 1. 클래스 선언
// 2. 클래스 안에 필드 만들기
// 		Car: 차종, Driver
//		Driver: 기사 이름, show() 기사의 이름 출력
// 3. 생성자를 통해서 초기값 설정.
// 4. Car의 setDriver()를 기사(Driver)를 설정
// 5. Car의 driving() @@ 차를 타다, 기사는 @@이다.
// 6. main() 처리..
// 7. Driver(나이, 사는곳), Car(배기량, 속도)의 여러가지 속성을 설정하고, 할당 처리
//		추가 메서드 (속도 올리기, 속도 내리기, 승객 탑승)
class Car01{
	String cName;
	Driver dr;
	int speed;
	int cc;
	int pass;
	
	Car01(String cName, int speed, int cc){
		this.cName = cName;
		this.speed = speed;
		this.cc = cc;
	}
	
	void setDriver(Driver dr){ // new Driver("장훈주");
		this.dr = dr;
	}
	
	void driving() {
		System.out.println(cName + " 차를 타다");
		System.out.println(cName + " 차의 배기량: " + cc + "CC");
		System.out.println(cName + " 차의 속도: " + speed + "h/km");
		if(dr!=null) {
			dr.show();
		}else {
			System.out.println("기사가 없습니다");
		}
	}
	
	void speedUp() {
		System.out.println("# 속도 증가 #");
		speed += 10;
		System.out.println("속도가 " + speed + " 증가합니다");
		System.out.println("현재 속도: " + speed + "h/km"+ "\n");
	}
	
	void speedDown() {
		System.out.println("# 속도 감소 #");
		speed -= 10;
		System.out.println("속도가 " + speed + " 감소합니다");
		System.out.println("현재 속도: " + speed + "h/km" + "\n");
	}
	
	void loadPerson(int cnt) {
		System.out.println("# 승객 탑승 #");
		pass += cnt;
		System.out.println("승객이 " +cnt+ "명 승차하였습니다");
		System.out.println("현재 탑승 승객: " + pass + "명");
		
	}
}

class Driver{
	String dName;
	int age;
	String loc;
	
	Driver(String dName, int age, String loc){
		this.dName = dName;
		this.age = age;
		this.loc = loc;
	}
	
	void show() {
		System.out.println("기사의 이름은 " + dName + " 나이는 " + age+ "살이다"+ "\n");
	}
}