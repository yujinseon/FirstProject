package javaexp.a00_exp;

public class A02_1101 {
	
	//8번의 메소드 선언
	static int getNumber() {
		return 15;
	}
	
	static int[] getArray() {
		// 배열이 리턴되므로 데이터 유형 선언
		return new int[] {2000,3000,4000};
	}
	
	static double getChangeType() {
		
		double num01 = 25; // double 형이 정수형 보다 더 크기 때문에 정수형 할당 가능
		
		return 35;
	}
	
	static int getChangeType2() {
		int num02 = (int)42.24; // casting(큰 데이터를 작은 데이터 유형에 할당할 때는 casting)
		
		return (int)45.24;
	}
	
	static int getInt2() {
		// 해당 변수명을 선언하여 데이터를 리턴하는 경우가 많다
		int num01 = 25;
		num01+=3;
		return num01;
	}
	
	// 리턴 값이 없는 경우
	// 1. 입력 값을 통해서 저장
	// 2. 프로세스 처리
	// 3. 화면 출력 처리
	// ==> 리턴유형 void를 쓴다. 마지막 라인에 return을 삭제..
	static void show() {
		System.out.println("출력하는 처리(리턴값 불 필요)");
	}
	static void show2(int num01) {
		int sum = 30;
		sum += num01;
		System.out.println("메서드에 입력된 값:"+num01);
		System.out.println("총합계:"+sum);
		System.out.println();
	}
	// 리턴 유형이 없는 메서드
	static void Hello() {
		System.out.println("안녕하세요 이것은 리턴유형이 없는 메서드 입니다");
	}
	// 매개변수로 받은 문자열 출력 @@@님 안녕하세요
	static void Hello2(String person) {
		System.out.println(person + "님 안녕하세요");
	}
	
	public static void main(String[] args) {
		show();
		show2(25); // 정의해 놓았기 떄문에 중복해서 호출 사용 가능
		
		//ex) 리턴 유형이 없는 메서드1 인사말
		Hello();
		//ex) 매개변수로 받은 문자열 출력 @@@님 안녕하세요
		Hello2("홍길동");
		
		//1번
		/*
		Scanner sc = new Scanner(System.in);
		int nowPrice = 100000;
		System.out.println("현재 잔액: " + nowPrice);
		System.out.print("날짜를 입력하시오: ");
		String date = sc.nextLine();
		System.out.print("수입 지출 구분(수입/지출)");
		String divide = sc.nextLine();
		System.out.print("내용 입력하시오: ");
		String content = sc.nextLine();
		System.out.print("금액을 입력하시오: ");
		int price = sc.nextInt();
		System.out.println("날짜: " + date);
		System.out.println("수입 지출 구분: " + divide);
		System.out.println("내용: " + content);
		System.out.println("금액: " + price);
		System.out.println("처리 후 잔액: " + (nowPrice - price) + "원");
		*/
		// ctrl + / : 줄단위 주석 생성
		
		
		//2번
		// () : 메서드나 생성자의 매개변수를 선언/호출 시 사용
		//	ex) Person(String name){}
		//		new Person("홍길동");
		// {} : 중괄호, 클래스명/생성자/메서드에 범위를 지정하고, 조건/반복문에서 주로 활용된다
		// 	ex) int[] arry = {1000,2000,3000}; // 자바에서만 데이터 선언 할당 시 중괄호를 이용
	    // [] : 대괄호, 주로 배열에서 호출할 때 사용된다
		// 	ex) arry[10]=500;
		
		//3 번
		/*
		 에러 내용: Error Duplicate local variable member
		 해결 방법: 중복되는 변수명을 중복 되지 않게 수정해준다.
		 */
		
		//4번
//	 	  1) 변수 선언 후 값 목록 대입
			int[] intArray;
			intArray = new int[] {10,20,30};
// 		  2) 변수 선언과 동시에 값 목록 대입
			int[] prices = {3000,4000,5000};
		
		//5번
			String[] singerName = {"박효신", "김범수", "이수"};
			String[] songTitle = {"그 날", "오직 너만", "사계"};
			
			// 0~2 까지 출력이 되어야 하기 떄문에 증감식에서 i<=가 아닌 i<
			// i<= 하면 3이 될때까지 반복되기에 오류 발생함
			for(int i=0; i<singerName.length; i++) {
				System.out.println("가수 이름: " + singerName[i] + "\t" + "제목: " 
				+ songTitle[i] );
			}
			
			// foreach로 가수 이름 출력
			for(String nm : singerName) {
				System.out.println(nm);
			}
			
			
			//6번
			//복합 대입 연산자
			// a+=b ==> a= a+b
			int a = 3;
			int b = 3;
			int c =3, d=3;
			c = c+d;
			System.out.println("a+=b ->" + (a+=b));
			System.out.println("a = a+b ->" + c);
			
			/* 강사님의 풀이
			int no = 1;
			no++; // 1씩 증가
			no += 3; // 3씩 증가 : 증감하고 대입을 하는 연산자
			System.out.println("현재 no의 데이터:" + no);
			*/
			
			//7번
			//선언한 배열의 index 값보다 큰 값의 index를 선언하면 에러가 발생하게 된다
			
			//8번
			System.out.println(getNumber());
			
			//9번
			Mom mom = new Mom();
			System.out.println("엄마는 " + mom.cookSkill);
			Son son = new Son();
			System.out.println("아들은 " + son.cookSkill);
			System.out.println("아들은 " + son.runningSkill);
	}

}

class Mom {
	String cookSkill = "요리를 잘한다";
}
class Son extends Mom {
	String runningSkill = "달리기를 잘한다";
}
