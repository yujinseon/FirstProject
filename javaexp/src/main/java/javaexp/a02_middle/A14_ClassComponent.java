package javaexp.a02_middle;

public class A14_ClassComponent {

	public static void main(String[] args) {
		// 하나의 클래스를 바탕으로 여러개의 객체 생성
		Person03 p01 = new Person03(); // 객체 생성
		Person03 p02 = new Person03();
		Person03 p03 = new Person03();
		// new Person03()을 통해서 heap영역에 메모리가 할당.
		// p01, p02, p03에는 그 heap영역의 메모리 주소를 stack영역에 참조명으로 할당된다
		System.out.println(p01);
		System.out.println(p02);
		System.out.println(p03);
		// javaexp.a02_middle.Person03@42f30e0a
		// 42f30e0a : 힙 영역의 주소로, 16진수로 저장된다.
		// p01.name : p01위치에 있는 객체에 가서 name이라는 데이터를 호출하여 저장하거나 호출할 수 있다.
		p01.name = "홍길동";
		p01.age = 25;
		p02.name = "신길동";
		p02.age = 27;
		p03.name = "김길동";
		p03.age = 30;
		System.out.println("p01의 name:" + p01.name);
		System.out.println("p01의 age:" + p01.age);
		System.out.println("p02의 name:" + p02.name);
		System.out.println("p02의 age:" + p02.age);
		System.out.println("p03의 name:" + p03.name);
		System.out.println("p03의 age:" + p03.age);
		Person03 p04 = new Person03("장훈주",25); // 이름은 같지만 매개변수가 다른 생성자를 통해 객체 생성
		System.out.println(p04);
		Person03 p05 = new Person03("장로운", 1);
		// p05.name 형식으로 현재 할당되어 있는 초기값이 설정된 데이터를 확인할 수 있다.
		System.out.println("p05의 name:" + p05.name);
		System.out.println("p05의 age:" + p05.age);
	}
}
/* 클래스를 통한 객체의 구성요소들의 조합 사용 
1. 클래스란 객체를 생성하기 위한 기본 코드 이다.
   비유적으로 말하는 객체를 위한 설계도 역할을 한다.
   
2. 클래스를 선언하면 .class까지 만들어지고, 객체를 사용하려면 main()을 통해서
   생성자를 호출하여 객체를 생서앟여야 한다
   
3. 클래스는 내부적으로 기본 생성자가 선언되어 있다.
	- 클래스명과 동일한 생성자가 default로 지원되고 있음

4. 하나의 클래스(도면)를 바탕으로 여러개의 객체가 생성될 수 있다.

5. 객체가 생성되면 새로운 heap영역에 이 객체가 사용하는 메모리가 할당되고,
   그 heap영역의 메모리의 주소값을 참조변수에 할당하여 stack 영역에 저장된다.
   stack/heap영역
   참조변수 : 어떤 위치(heap영역에 객체가 있는 주소값)를 참조하는 변수
   			참조변수안에 객체의 주소값이 할당되어 있음.

6. 클래스명 바로 밑에 변수를 데이터유형과 변수명으로 선언하며, 각 객체가 사용할 수 있는
	변수가 선언된 것이다.
  
7. 클래스는 기본적인 생성자를 포함한다
	이것을 default 생성자라고 한다
	생성자는 클래스명과 동일하며, 개발자가 정의하여 생성자를 선언할 수 있다
	코드에 의해 선언된 생성자가 있는 순간, 기존의 default 생성자는 사라진다.
	
8. 생성자는 여러 생성자를 매개변수가 다르면 선언이 가능하다.

9. 매개변수가 있는 생성자는 일반적으로 필드값을 초기화 시킬 때, 주로 사용된다.
	ex) 우리나라의 경우 사람이 태어나면 이름을 정하고, 나이 1살을 정하듯이
		객체가 생성하여 객체가 가이고 있을 속성(필드)를 초기화하여 사용하는 데, 활용한다.
	1) 필드 값을 초기화할 때, 매개변수명과 필드명이 같은 경우에 구분하기 위해서...
		필드명은 this.필드명 = 매개변수명; 형식으로 매개변수로 넘겨온 데이터를
		필드명에 할당한다.
		
10. 기능 메서드는 주로 객체의 프로세스 처리, 입력값처리, 리턴값 처리등의 기능을 수행한다
	ex) 눈으로 사물을 보면 시각 정보가 입력이 되어 기억을 할 수 있게 한다
		클래스도 외부에서 입력되는 데이터를 필드에 저장할 수 있다.
	ex) 입으로 여러명의 친구들과 이야기를 할 수 있다. 기억된 정보를 음성으로 메시지로 바꾸어 외부에 전달한다
		객체로 메서드를 통해서 필드의 데이터를 프로세스를 처리하여 외부에 리턴하여 전달할 수 있다.
	ex) 상황에 적절한 해결방법을 마련하고, 생각과 기억을 조합하여 효과적으로 대응 전략을 만들고,
		최적의 방법을 마련할 수 있다
		객체도 메서드를 통하여 조건문과 반복문을 활용하여 프로세스를 만들고, 그 결과를 저장하여,
		추후에 다른 기능 메서드를 통해서 처리할 때, 활용할 수 있다
*/
class Person03{
	String name; // 필드 : 객체마다 다르게 사용할 데이터 변수
	int age;
	String imgInfo; // 객체 저장할 시각정보..
	String msg; // 호출하는 곳에 전달할 음성 정보
	String planWithFriend;	
	
	void seeWrithEye(String imgInfo) {
		this.imgInfo = imgInfo;
	}
	
	String greatView() {
		return "내가 본 최고의 풍경:"+imgInfo;
	}
	
	/*
	 p04.setWithEye("아름다운 가을산 풍경"); */
	String speakWithMouth() {
		return msg;
	}
	/*
	 System.out.pritln("이야기할 내용:" + p04.speakWithMouth()); 
	 */
	
	void thinkGoodPlan() {
//		필드 내의 저장되어 있는 정보를 조합해서
//		if 조건
//		for 활용하여
//		최적의 데이터 만들어 저장한다.
		if(imgInfo.equals("좋은 풍경")) {
			//	감정 정보 = "아주 좋음";
		}
		
		planWithFriend="정보";
	}
	
	
	// Person03(){} : defalut 생성자
	
	Person03(){	//  main()메서드에서 new Person03() 이라고 호출하는 순간 해당 중괄호 블럭에 있는 내용이
				// 수행되어 진다.
		System.out.println("기본 생성자!!");
	}
	// new Person03("홍길동"); 형식으로 객체 생성시, 선택적으로 생성자를 호출할 수 있다
	Person03(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("매개변수가 두개인 생성자 선언..");
	}
}
