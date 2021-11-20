package javaexp.a00_exp;

import java.util.*;

public class A06_1105 {

	public static void main(String[] args) {
		/*
		 1번 문제 - java를 컴파일과 실행과정을 Person.java를 기준으로 기술하세요
		 1. Person.java를 작성한다
		 2. 자바 컴파일러가 자바 소스 파일을 컴파일 한다
		 3. 컴파일된 바이트 코드를 JVM에게 전달
		 4. 실행된다
		 
		 강사님 풀이:
		 (코드==>기계어)로 변경 ex) javac Person.java ==> Person.class
		 실행과정(main()메서드가 있는 클래스에서 호출할 때) java Person ==> memory에 로딩과 내부적인 코딩 내용이 수행 
		 */
		
		/*
		 2번 문제 - 기본 출력 형태를 기술하고, 특수문자를 통한 기능 처리를 기술하세요
		System.out.println("출력할 문자열-줄 바꿈포함");
		System.out.println("문자열" + "문자열"); // 문자열을 이어 주어 출력
		System.out.print(); // 줄 바꿈 없이 출력
		System.out.print("문자열 \n"); // 개행 특수문자
		System.out.print("문자열 \n"); // 간격을 띄워주는 탭 특수문자
		-> 특수문자는 역 슬래쉬는 활용한다
		 */
		
		//3번
		String name = "홍길동";
		int kor = 70;
		int eng = 80;
		int math = 90;
		int sum = kor + eng + math;
		int avg = sum /3;
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
		
		/*
		//4번
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name1 = scan.nextLine();
		System.out.println("국어 점수를 입력해주세요");
		int kor1 = scan.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		int eng1 = scan.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		int math1 = scan.nextInt();
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		int sum1 = kor1 + eng1 + math1;
		int avg1 = sum1 /3;
		
		System.out.println(name1+"\t"+kor1+"\t"+eng1+"\t"+math1+"\t"+sum1+"\t"+avg1);
		*/
		
		//6번
		byte b = 1;
		short s = 1;
		char c = 'A';
		int i = 1;
		long l = 1L;
		float f = 0.1f;
		double d = 0.1;
		String str = "문자열";
		
		System.out.println(str);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		//7번
		// 캐스팅: 다른 타입의 피 연산자끼리 연산을 수행할 경우, 같은 타입으로 변경해 주는것
		double do1 =  12.5;
		System.out.println("int형으로 캐스팅" + (int)do1); // 강제 형변환; double형이 int 형 보다 크기 떄문
		int in1 = 13;
		double do2 = 0.0;
		do2 = in1;
		System.out.println("double형으로 캐스팅" + in1); // 자동 형변환;
		
		//8번
		// 비교 연산자는 두개의 값을 비교하여 True False의 결과를 도출하는 것이고
		// 논리 연산자는 주로 관계 연산자와 사용되며 사이의 두 항의 값 혹은 반대되는 비교등 여러가지 옵션이 있다
		int score = 97;
		if(score >= 80) {
			System.out.println("B학점");
		}
		
		// 9번
		/*
		 1. 최우선 연산자: (),[] 등등
		 2. 단항 연산자: ++, --, ~, ! 등등
		 3. 산술 연산자
		 4. 비교 연산자
		 5. 논리 연산자
		 6. 대입 연산자
		 */
		
		//10번
		for(int i1=15; i1<=50; i1++) {
			System.out.println(i1);
			if(i1%3==0) {
				System.out.println("@");
			}
		}
		
		//11번
		/*
		 break문은 반복문 실행 도중 만나게 되면 그 즉시 조건문 블록과 그 밖의 반복문을 자체를 탈출하고
		 continue문은 해당 반복을 스킵하고 다음 반복문 실행절차를 수행한다
		 */
		
		//12번
		String[] empName = {"홍길동", "김길동", "남길동"};
		int[] empNum = {1,2,3};
		String[] pos = {"사원","대리","과장"};
		for(int i2=0; i2<empName.length; i2++) {
			System.out.println(empName[i2] + empNum[i2] + pos[i2]);
		}
		
		//13번
		String shape[] = {"♥", "♠", "♣", "◈"};
		String numbers[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		// Card 객체의 배열 52개 만들기
		Card[] cards = new Card[52];
		int cidx=0;
		
		for(int idx=0; idx<shape.length; idx++) {
		//System.out.println(shape[idx]);
		//숫자를 반복해서 처리할 데이터
		for(int jdx=0;jdx<numbers.length;jdx++) {
			System.out.print(cidx+")"+numbers[jdx]+ shape[idx] +",");
			// 배열 객체에 52의 객체가 할당이 된다
			cards[cidx] = new Card(numbers[jdx], shape[idx]);
			cidx++;
		}
		System.out.println();
	}
	System.out.println("#할당된 배열의 객체 확인#");
	for(int idx=0;idx<cards.length;idx++) {
		cards[idx].show();
	}
		
		/*
		Card card = new Card("스페이스",8);
		card.show();
		*/
		
		//14번
		House h1 = new House("푸르지오");
		h1.setName(new Person("장훈주"));
		
		h1.show();
	}

}

//5번
class Exam{
	int num;
	
	Exam(int num){
		this.num = num;
	}
	
	void Hello() {
		if(num>=10) {
			System.out.println("10 초과 입니다");
		}else {
			for(int i=0; i<=num; i++) {
				System.out.println(num);
			}
		}
			
	}
}

//13번
class Card{
	String form;
	String cNum;
	
	Card(String form, String cNum){
		this.form = form;
		this.cNum = cNum;
	}
	
	void show() {
		System.out.println("카드 모양: " + form + "카드 번호: " + cNum);
	}
}

//14번
class House{
	String brand;
	Person per;
	
	House(String brand){
		this.brand = brand;
	}
	
	void setName(Person per) {
		this.per = per;
		
	}
	
	void show() {
		System.out.println("이 아파트의 브랜드는" + brand + "입니다");
		if(per != null) {
			per.showInfo();
		}else {
			System.out.println("사는 사람이 없습니다");
		}
	}
}

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("이 집에 사는 사람은 " + name + "입니다");
	}
}