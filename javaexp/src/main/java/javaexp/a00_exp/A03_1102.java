package javaexp.a00_exp;

public class A03_1102 {
	
	//1번 메서드 시작
	static void Hello() {
		System.out.println("안녕하세요");
	}
	static void Hello1(String name) {
		System.out.println("환영합니다 " + name + "님");
	}
	//1번 메서드 종료
	
	
	//2번 메서드 시작
	static void callName(String name) {
		System.out.println("안녕하세요" + name + "님");
	}
	static void callAge(int age) {
		System.out.println("당신의 나이는 " + age + "입니다");
	}
	static void callWeight(double weight) {
		System.out.println("당신의 몸무게는 " + weight + "입니다");
	}
	//2번 메서드 종료
	
	//3번 메서드 시작
	static void memberReg(String id, String pass, String name, int point) {
		System.out.println("#회원 등록 정보#");
		System.out.print("ID: " + id + " Password: " + pass + " 이름: " + name 
				+ " 포인트 " + point);
		System.out.println();
	}
	//3번 메서드 종료
	
	//4,5번 메서드 시작
	static double student(String name, int kor, int eng, int math) {
		
		int sum = kor + eng + math;
		
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 평균 \t 총점");
		System.out.println(name + "\t" + kor + "\t" + eng +"\t" + math +"\t" + sum/3 +
				"\t" + sum);
		return sum/3.0;
	}
	//4,5번 메서드 종료
	
	//6번 메서드 시작
	static void gugudan(int num) { // 중첩 for문을 쓸 필요가 없었네...
			for(int j=1; j<=9; j++) {
				System.out.println(num + "X" + j + "= " + (num*j));
			}
		}
	//6번 메서드 종료
	
	
	// Main()...
	public static void main(String[] args) {
		//1번
		/*
		//1. 콘솔창에 출력만 하고자 할 때..
		 		void greeting(){
		 			System.out.println("안녕하세요!!");
		 		}
		//2. 매개변수를 통해서 객체에 데이터를 저장하고자 할 때
		//		ex) 사람의 귀는 음성 정보를 받아서 뇌에 전달한다
		//			객체도 외부의 데이터를 받아서 필드에 전달할 때, 주로 리턴값이 필요없다.
		//			void setName(String name){
		//				this.name = name;
		//			}
		  3. 기능 프로세스만 처리할 때, 리턴값이 없는 경우가 있다
		  		ex) 사람이 어떤 계획을 하거나 생각을 할 때는 외부에 입력도, 리턴도 하지 않지만
		  			추후에 행동에 영향을 미칠 판단을 하게 된다
		  			void setCalculator(){
		  				// 필드에 있는 데이터를 연산처리하여 필드에 데이터를 할당처리.
		  				sum = num01+num02;
		  			}
		  				외부 메인 메서드, 다른 객체
		  				()-객체	<-- 데이터
		  				 메서드	--> 결과값..(리턴값)
		*/
		
		//void는 리턴 값 없이 바로 호출하여 사용한다
		Hello();
		//매개변수를 받아 호출하여 사용한다
		Hello1("홍길동");
		
		//2번. 메서드의 매개변수에 따른 데이터를 처리를한다. 매개변수를 처리하는 3가지 유형을 기술하시오
		/*
		 1) 데이터가 외부에서 입력되는 형태를 말하고, 외부에서도 이에 맞게 입력하여야 한다
		 2) 메서드를 통해서 데이터의 이력이 없을 때.
		 	void call(){}
		 3) 데이터의 입력이 하나만 있을 때, 해당 타입에 따라서 호출이 가능하다
		 	void setName(String name){}		setName("홍길동");
		 	void setAge(int age){}			setAge(25);
		 4) 데이터가 여러개인 경우 해당 유형과 개수와 타입이 순서에 맞게 선언하여야 한다.
		 	void setPerson(String name, int age, String loc){}
		 		setPerson("홍길동", 25, "서울 강남");
		 */
		callName("");
		callAge(25);
		callWeight(60.8);
		
		//3번
		memberReg("wkdgnswn", "aa1234", "", 15);
		
		//4번
		student("김미미", 90,51,64);
		
		//5번
		double ret = 0; // double 형의 값이 0이면 ##.0 이고, 0.0으로 값을 주면 ##.0000000000이 나옴
		ret += student("이성계", 90, 75, 85);
		ret += student("김미미", 90 , 51 ,64);
		ret += student("김현식", 50, 79, 100);
		System.out.println("전체 총점: "+ret);
		System.out.println("전체 평균: "+(int)(ret/3)); // 전체 평균을 캐스팅하여 int형으로 처리
		
		//6번
		gugudan(2);
		
		//7번
		System.out.println("1~8 랜덤: " + (int)(Math.random()*8+1));
		System.out.println("5~10 랜덤: " + (int)(Math.random()*6+5)); //5,6,7,8,9,10 경우의 수 -> 6개
		System.out.println("0~100 랜덤: " + (int)(Math.random()*101)); // 0부터니까 경우의 수 -> 101개
		System.out.println("1~12 랜덤: " + (int)(Math.random()*12+1));
		
		//8번
		System.out.print("학생 1의 점수: " + (int)(Math.random()*101) + "점, "
				+ "학생 2의 점수: " + (int)(Math.random()*101) + "점, "
				+ "학생 3의 점수: " + (int)(Math.random()*101) + "점");
		System.out.println();
		
		//9번
		int friend1 = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
		int friend2 = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
		
		if(friend1 > friend2) {
			System.out.println("친구1이 이겼습니다");
		}else if(friend1 < friend2) {
			System.out.println("친구2가 이겼습니다");
		}else {
			System.out.println("비겼습니다");
		}
		
		//10번
		int sum3 = 0;
		int sum4 = 0;
		
		System.out.println("#예제 10#");
		for(int i=0; i<10; i++) {
			int friend3 = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
			int friend4 = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
			
			
			if(friend3 > friend4) {
				System.out.println("친구3이 이겼습니다");
				sum3+= 1;
			}else if(friend3 < friend4) {
				System.out.println("친구4가 이겼습니다");
				sum4+= 1;
			}else {
				System.out.println("비겼습니다");
			}
			
		}
		
		if(sum3>sum4) {
			System.out.println("최종 우승자는 친구3 입니다" );
		}else if(sum3<sum4) {
			System.out.println("최종 우승자는 친구4 입니다");
		}else {
			System.out.println("최종 우승자는 없습니다 비겼습니다");
		}
		
		
	}

}
