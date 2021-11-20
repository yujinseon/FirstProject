package javaexp.a02_middle.a01_access;

import javaexp.a02_middle.a02_access.Person;

public class A01_AccessModifier {

	public static void main(String[] args) {
		//1. 같은 패키지에 있는 클래스는 자유롭게 호출이 가능하다
		Product p01 = new Product();
		System.out.println("price는 같은 패키지에서 접근 가능:" + p01.price);
		
		//2. 다른 패키지에 있는 클래스는 접근 제어자가 public이어야 하고,
		//	 외부 패키지인 겨웅에는 import를 하여야 한다.
		Person ps = new Person();
		System.out.println("# 외부에 있는 패키지의 필드 접근 #");
//		System.out.println("name:"+ps.name); private 이기에 해당 클래스에서만 사용 가능
//		System.out.println("name:"+ps.age); default는 같은 패키지에서 호출 가능
		System.out.println("name:"+ps.loc); // loc는 public이기에 외부 패키지에서 접근 가능
		
		/* 
		 public class Person {
		// 다른 패키지에 있는 field
		private String name = "장훈주";
		int age = 25;
		public String loc="서울";
		
		}
		 */
		
	}

}
/*
 # 접근 제어자.
 1. 접근의 범위를 지정하여, 클래스, 생성자 메서드, 필드에 접근을 제어할 수 있는
 	키워드를 붙여서 처리하는 것을 말한다.
 2. 접근 제어자는 일반적으로 아래와 같다.
 	1) private : 외부 클래스에서 접근 못하게 처리..
 	2) X(default) : 
 */
