package javaexp.a02_middle;

import java.util.ArrayList;

public class A25_ArrayList {

	public static void main(String[] args) {
		/*
		 # 동적 배열을 처리하는 선형 ArrayList Collections
		 1. 배열은 정적 데이터이어서 구조자체가 초기에 크기가 정해지면 변경하지 못한다.
		 2. 자바에서는 Collection 하위에 선형구조로 동적배열을 List 인터페이스를
		 	상속받은 ArrayList 객체를 통해 동적배열을 지원하고 있다.
		 3. 객체 생성
		 	  ArrayList list = new ArrayList();
		 4. 지원메서드
		 	  .add("추가데이터"); : 마지막에 데이터를 할당 처리..
		 	  .set(index, "변경할데이터");
		 	  .get(index); 해당 데이터를 가져옴
		 	  .size() : ArrayList에 할당된 데이터의 건수를 가져온다.
		 5. 할당할 데이터 유형을 기본적으로 Object 형태의 객체가 지원하고 있다.
		 	  ArrayList<데이터유형객체>
		 	  1) 1단계 : 
		 	  		ArrayList<Object> : 자바의 상속 구조상 최상위 객체
		 	  		ArrayList<String> : Object는 기본적으로 String을 지원한다
		 	  2) 2단계 :
		 	  		여러가지 데이터 유형 처리
		 	  		- 문자열형 데이터 : ArrayList<String>
		 	  		- 정수형 데이터 : ArrayList<Integer>
		 	  		- 실수형 데이터 : ArrayList<Double>
		 	  3) 3단계 :
		 	  		사용자 정의 객체 유형 처리
		 	  		ArrayList<Person>
		 	  		ArrayList<Card>
		 	  		cf) 데이터베이스의 테이블의 데이터는 위와 같은 형식으로 처리하여,
		 	  			화면에 로딩한다.
		 */
		ArrayList list = new ArrayList();
		// import 처리 방법
		//	방법 1) 에러를 클릭하여, 적당한 처리 형태를 선택한다
		//	방법 2) ctrl+shift+o 단축키를 통해서 import 한다.
		// 추가 처리
		list.add("사과");
		list.add("복숭아");
		list.add("블루베리");
		list.add("바나나");
		list.add("딸기");
		// 현재 크기 확인
		System.out.println("크기"+list.size());
		// 데이터의 변경
		list.set(2, "오렌지"); // list.set(변경할 위치, 변경할 데이터);
		list.set(3, "망고");
		// 각 데이터를 index별로 확인..
		System.out.println("1번쨰 데이터: " + list.get(0));
		System.out.println("2번쨰 데이터: " + list.get(1));
		System.out.println("3번쨰 데이터: " + list.get(2));
		System.out.println("4번쨰 데이터: " + list.get(3));
		System.out.println("5번쨰 데이터: " + list.get(4));
		
		// ex) 좋아하는 음식 3가지 설정 할당, 출력
		ArrayList food = new ArrayList();
		food.add("삼겹살");
		food.add("피자");
		food.add("치킨");
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		
		
	}

}
