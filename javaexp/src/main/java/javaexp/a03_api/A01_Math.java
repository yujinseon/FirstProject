package javaexp.a03_api;

public class A01_Math {

	public static void main(String[] args) {
		/*
		 # Math api 클래스.
		 1. 수학적인 데이터를 처리해주는 api내부 클래스이다.
		 2. 메서드가 static으로 지원하여, 객체를 생성하지 않고도 바로 사용할 수 있게 하였다.
		 */
		
		// 소수점 이하의 값을 내림 처리..
		System.out.println("Math.floor():"+Math.floor(25.75)); 
		// 소수점 이하의 값을 올림 처리..
		System.out.println("Math.ceil():"+Math.ceil(25.263));
		// 반올림하여 정수값을 만든다
		System.out.println("Math.round():"+Math.round(25.62));
		System.out.println("Math.round():"+Math.round(25.22));
		// Math.floor()/Math.ceil()은 리턴값이 실수이기에 정수값으로 처리하기 위해서는 casting이 필요
		System.out.println("Math.floor():"+(int)Math.floor(25.75));
		/*
		 3. Math.random() : 0.0 <= Math.random() < 1.0 사이에 임의의 수를 리턴해준다
		 	1) 1~10까지 임의의 수가 나오게 처리..
		 		1 <= (int)Math.random()*10+1 < 11
		 			 (int)(Math.random()*경우의 수 + 시작번호)
		 	2) 1~6 주사위가 나오게 처리하려면
		 		(int)(Math.random()*6 + 1);
		 */
		System.out.println("Math.random():" + Math.random());
		System.out.println("Math.random():" + Math.random()*10);
		System.out.println("Math.random():" + (int)(Math.random()*10+1));
		System.out.println("Math.random()*6+1:"+(int)(Math.random()*6+1));
		
		System.out.println("# 우승 팀 주사위 굴리기 #");
		int team1 = (int)(Math.random()*6+1);
		int team2 = (int)(Math.random()*6+1);
		System.out.println("팀1이 나온 주사위:" + team1);
		System.out.println("팀2 나온 주사위:" + team2);
		if(team1>team2) {
			System.out.println("팀1 우승");
		}else if(team1<team2) {
			System.out.println("팀2 우승");
		}else if(team1==team2) {
			System.out.println("무승부");
		}
		
		// ex1) 1,2 둘중에 하나의 값이 나오게 하세요
			System.out.println("#예제 1번#");
			System.out.println("1,2 둘중에 하나의 값: " + (int)(Math.random()*2+1) + "\n");
			
		// ex2) 1~5 사이의 임의의 값이 나오게 하세요
			System.out.println("#예제 2번#");
			System.out.println("1~5 사이의 값: " + (int)(Math.random()*5+1) + "\n");	
			
		// ex3) 조건문을 이용해서 0,1,2 나온 임의의 값으로 가위/바위/보가 출력되게 하세요
			System.out.println("#예제 3번#");
			int a = (int)(Math.random()*3); // 경우의 수가 3개기에 *3
			System.out.println("0:가위 1:바위 2:보 , a의 값: "+a);
			
			if(a == 0) {
				System.out.println("가위가 나왔습니다");
			}else if(a == 1) {
				System.out.println("바위가 나왔습니다");
			}else {
				System.out.println("보가 나왔습니다");
			}
	}

}
