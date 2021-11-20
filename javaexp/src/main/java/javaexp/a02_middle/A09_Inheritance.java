package javaexp.a02_middle;

public class A09_Inheritance {

	public static void main(String[] args) {
		Vehichle v1 = new Vehichle();
		System.out.println("차 속도: " + v1.speed);
		Bus01 b1 = new Bus01();
		System.out.println("버스 속도: " + b1.speed);
		System.out.println("버스 승객: " + b1.passengerCnt);
		Truck t1 = new Truck();
		System.out.println("트럭 속도: " + t1.speed);
		System.out.println("트럭 무게: " + t1.weight);
	}

}

class Vehichle{
	int speed = 80;
}
class Bus01 extends Vehichle{
	String passengerCnt = "13명";
}
class Truck extends Vehichle{
	String weight = "500kg";
}
