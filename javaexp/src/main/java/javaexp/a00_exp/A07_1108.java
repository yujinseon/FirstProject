package javaexp.a00_exp;

import java.util.ArrayList;

public class A07_1108 {

	public static void main(String[] args) {
		/*
		 1번 - java에서 필드값을 private로 설정하는 이유를 encapsulation 개념을 찾아보시고 기술하세요 
		 
		 encapsulation: 객체에 구성요소에 접근제한을 두어, 외부의 호출에 대하여 접근을 제한하는
		 				oop(객체지향프로그래밍)의 핵심 개념중 하나로 외부에서 바로 호출하여
		 				사용하지 못하게 하기 위해 private 접근 제한자를 사용한다
		 
		 강사님의 답:
		 필드값을 직접적인 접근을 하는 것을 방지함으로 데이터의 효과적인 보안 처리와 객체지향 프로그램의
		 encapsulation 개념에 합치되게 처리하기 위한 것이다.
		 encapsulation이란 특정 데이터를 접근하기 위한 방법을 마련하여, 해당 방법으로만 해당 데이터를 처리하기 위한
		 개념으로 vo 객체 같은 경우 읽기를 하는 메서드 getXXX()와 쓰기를 하는 메서드 setXXX()로만 데이터를 처리하게
		 한 것을 말한다.				
		 /*
		 
		 2번 - VO 객체의 구성에 있어서 접근제어자 형태를 기술하세요
		 필드 값은 private로 캡슐화를 하고
		 생성자와 getter 와 setter는 public 으로 선언하여 외부에서 호출 및 수정이 가능하게 한다
		 
		 강사님의 답:
		 - 하나의 파일로 하나의 클래스만 public 클래스를 사용할 수 있다
		 - 보통 파일명으로 지정한 클래스를 public 클래스로 사용한다
		 - 외부에서 선언할 때, 패키지가 달라도 선언이 가능하게 한다.
		 main()
		 Book bk;
		 
		 public Book(){}
		 - 선언된 클래스를 객체 생성을 통해서 처리할 때, 접근제어자에 의해 영향을 미친다
		 - 외부 패키지에서도 해당 객체를 생성하려면 접근 제어자가 public 이어야 한다
		 	bk = new Book();
		 	
		 private String title;
		 - 필드로 선언된 private는 직접적인 접근을 불가능 하게 선언한다
		 
		 //생성자를 통해서 초기화
		 public Book(String title) {
		  super();
		  this.title = title;
		 }
		 
		  - getXXX() / setXXX() 메서드를 통해서 읽기와 쓰기가 분리되어 처리하게 한다.
		  - public으로 처리되었기 때문에 외부에서 접근이 가능하다
		  
		  public String getTitle(){
		  	return title;
		  }
		  
		  public String setTitle(){
		  	this.title = title;
		  }
		  
		 
		 5번
		 클라이언트(사용자) : 컴퓨터에 요청하는 쪽
		 서버(제공자) : 응답하는 쪽
		 
		 강사님의 답:
		 웹에서 서버란 클라이언트에게 특정한 웹 화면과 웹 화면을 통해서 정보나 화면을 지원해주는 데몬을 말한다.
		 웹 서버라고 하는데, apache, IIS 등이 있다. 이 웹 서버에 DB나 java와 같은 프로그램을 컴파일 시켜서
		 처리해주는 것을 웹어플ㄹ케이션서버(WAS)라고 한ㄷ. tomcat, jeus, weblogic 등이 애표적인 was라고 
		 할 수 있다.
		 웹에서 클라이언트란 웹서버에 요청을 하여, 특정한 화면이나 정보를 전달받는 프로그램을 말한다.
		 HTML 형식으로 전달 받아, 랜더링하여 tag에 지정된 형태로 화면을 출력 처리하는 브라우저를 말한다.
		 브라우저의 종류로는 인터넷 익스플로러, 사파리, 오페라, 크롬등이 있다.
		 두 개의 웹서버와 클라이언트는 네트웍이라는 환경하에 상호간에 요청과 반응을 하면서 사용자가 필요로 하는 정보나
		 화면을 서비스를 전달받는 처리를 한다.
		 
		 6번
		 HTML: 정적 마크업 언어로 큰 의미로는 웹 표준 기술을 말하고 작은 의미로는 웹 문서의 문법을 의미한다
		 CSS: HTML 문서를 표현하는 방법을 기술하는 언어로 주로 웹을 꾸며주는 역할을 한다
		 자바스크립트: 웹 페이지를 동적으로 움직이게 해줄수 있는 언어이며 사용자 반응 등을 처리하며, 로봇 개발에도 사용된다
		 
		 강사님의 답:
		 html은 기본적으로 웹 화면을 구성하는 태그 언어를 말한다
		 테이블형식 리스처리, 타이틀, 메뉴 목록 처리, 화면 구성 처리 등을 지원하는 태그들로 구성하고 있다
		 css는 html에 지원한 기본 태그에서 확장된 모양과 생상 크기를 지원하는 언어이다.
		 효과적으로 웹 화면을 구성할 수 있도록 지원한다.
		 javascript는 html과 css에 동적인 기능 처리를 할 수 있게 프로그램적으로 지원하는 것을 말한다.
		 html과 css에서 지원한 태그나 코드들을 DOM(document object model)이라는 개념으로 객체화하여
		 객체지향적으로 프로그래밍화 하여 지원하는 것을 말한다.
		 
		 #javascript ==> jquery ==> ajax ==> node? ==> vue
		 */
		
		//3번
		A07_Computer com = new A07_Computer("삼성", "인텔I7", 16, 500);
		com.setHdd(1);
		System.out.println("컴퓨터의 제조사: " + com.getCom());
		System.out.println("컴퓨터의 CPU: " + com.getCpu());
		System.out.println("컴퓨터의 RAM: " + com.getRam() + "GB");
		System.out.println("컴퓨터의 HDD: " + com.getHdd() + "TB");
		
		//4번
		// 배열은 정적 데이터이어서 구조자체가 초기에 크기가 정해지면 변경하지 못한다 
		// 하지만 ArrayList는 동적 배열을 지원하여 크기가 동적으로 변한다
		ArrayList schedule = new ArrayList();
		
		//List 추가
		schedule.add("공부하기");
		schedule.add("책 읽기");
		schedule.add("게임하기");
		schedule.add("운동하기");
		schedule.add("산책하기");
		
		//List 수정
		schedule.set(2, "코딩하기");
		//List 삭제
		schedule.remove(3);
		
		//List 출력
		for(int i=0; i<schedule.size(); i++) {
			System.out.println(i+1+"번째 일정: "+schedule.get(i));
		}
		
		// 8번
		String shape[] = {"♥", "♠", "♣", "◈"};
		String numbers[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		// Card 객체의 배열 52개 만들기
		Card_A07[] cards = new Card_A07[52];
		Card_A07[] p01 = new Card_A07[7];
		int cidx=0;
		
		for(int idx=0; idx<shape.length; idx++) {
		//System.out.println(shape[idx]);
		//숫자를 반복해서 처리할 데이터
		for(int jdx=0;jdx<numbers.length;jdx++) {
			System.out.print(cidx+")"+numbers[jdx]+ shape[idx] +",");
			// 배열 객체에 52의 객체가 할당이 된다
			cards[cidx] = new Card_A07(numbers[jdx], shape[idx]);
			cidx++;
		}
		System.out.println();
}
		for(int i=0; i<7; i++) {
			var ranIdx = (int)(Math.random()*52);
			p01[i] = cards[ranIdx];
			p01[i].show();
		}
}
}
// 8번
class Card_A07{
	String form;
	String cNum;
	
	Card_A07(String form, String cNum){
		this.form = form;
		this.cNum = cNum;
	}
	
	void show() {
		System.out.println("친구 1: 카드 모양:" + form + " 카드 번호: " + cNum);
		System.out.println("친구 2: 카드 모양:" + form + " 카드 번호: " + cNum);
		System.out.println("친구 3: 카드 모양:" + form + " 카드 번호: " + cNum);
		System.out.println("친구 4: 카드 모양:" + form + " 카드 번호: " + cNum);
		System.out.println();
	}
}



