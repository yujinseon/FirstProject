package javaexp.a04_vo;

public class A01_ValueObject {

	public static void main(String[] args) {
		/*
		 # VO (Value object)
		 1. java에서 객체의 속성값이 있는 객체를 입력과 호출을 할 수 있게 처리하는 것을 말한다.
		 	 주로 객체의 필드값을 read할 때, 사용되는 개념이나, 혼용해서 입력/수정/삭제/호출 등
		 	 여러가지 개념으로 활용될 때가 많다.
		 	 cf) DTO (data transfer object)
		 2. 기본적인 접근 제어 구조
		 	1) 필드는 private로 설정
		 		직접적인 외부 호출을 방지한다.
		 		
		 	2) 생성자와 메서드는 public으로 설정한다
		 		생성자를 통해서 필드값을 초기화 처리.
		 		getXXX() : 호출하는 메서드를 통해서 필드값을 호출
		 		setXXX() : 저장하는 메서드를 통해서 필드값을 저장
		 	
		 	3) 읽기와 쓰기가 분리된 메서드를 통해서 필드값을 변경하여, 데이터를
		 		접근 제어를 통해 효과적인 처리를 한다
		 		
		 */
		A02_Person p01 = new A02_Person("홍길동",25,"김포 풍무"); // 객체 생성
		p01.setAge(29); // 매개변수의 저장된 데이터를 변경
		System.out.println("이름: " + p01.getName());
		System.out.println("나이: " + p01.getAge());
		System.out.println("사는 곳: " + p01.getLoc());
		
		// ex) 1번
		System.out.println();
		
		//클래스 객체 생성
		A03_Hobby h01 = new A03_Hobby("게임", 0, "18:00");
		
		//get 메서드로 값을 가져오기
		System.out.println("취미명: " + h01.getName());
		System.out.println("비용: " + h01.getPrice());
		System.out.println("주로 하는 시간: " + h01.getTime());
		
		System.out.println();
		A04_Screen s1 = new A04_Screen("인셉션" , 7000, 2);
		System.out.println("제목: " + s1.getTitle());
		System.out.println("관람료: " + s1.getPrice());
		System.out.println("관객: " + s1.getCnt());
	}

}
