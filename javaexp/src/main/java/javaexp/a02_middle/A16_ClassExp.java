package javaexp.a02_middle;

public class A16_ClassExp {

	public static void main(String[] args) {
		Car car = new Car("포르쉐",50,2);
		car.speedUp();
		car.speedUp();
		car.loadPerson(1);
		car.loadPerson(2);
		car.speedDown();
		car.speedDown();
		car.breakCar();
	}

}
// ex) Car 클래스를 선언하고, 1. 필드로 차량 종류, 현재속도, 탑승자인원으로 선언하고,
//		2. 생성자로 초기화 처리
//		3. 속도올리는 메서드를 선언하고, 현재속도를 호출시 마다 10씩 더 올리게 구현하고, 출력만 처리/
//		4. 매개변수를 통해서 탑승 인원을 입력 받아서 누적 할당 처리..
// ex) speedDown() 메서드를 통해서 한번에 5씩 속도가 감소되고 현재 속도를 출력..
//	   breakCar()를 통해서 속도를 0으로 만들어 차량 이름과 현재 속도를 출력
class Car{
	String carKind;
	int speed;
	int pass;
	
	
	Car(String carKind, int speed, int pass) {
		this.carKind = carKind;
		this.speed = speed;
		this.pass = pass;
	}

	void speedUp() {
		speed += 10;
		System.out.println("차 종류:" + carKind+ " / " + "현재 속도: " + speed);
	}
	
	void loadPerson(int cnt) {
		pass += cnt;
		System.out.println("방금 탑승한 인원: " + cnt);
		System.out.println("총 탑승 인원:" + pass);
	}
	
	void currentSpeed() {
		System.out.println(carKind+"의 현재 속도: " + speed + "km/h");
	}
	
	void speedDown() {
		speed -= 5;
		System.out.println("# 속도를 감소합니다 #");
		currentSpeed();
	}
	
	void breakCar() {
		speed = 0;
		System.out.println("# 차량을 멈춥니다 #");
		currentSpeed();
	}
	
}