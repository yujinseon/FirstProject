package javaexp.a00_exp;

public class A08_1109 {
	/*
	 # 태그의 구성요소
	 1) 화면 전체 구성요소
	 	<!DOCTYPE html> : html 태그의 태그와 속성을 선언한 dtd 파일을 지정. html5 통일.
	 	<html>: html의 최상위 구성요소
	 		<head> : body를 위한 처리의 기본적인 정보를 설정할 내용을 기술한다
	 		</head>
	 		<body> : 실제 화면에 나타날 내용을 구성한다.
	 			<h1 align = "center">안녕하세요</h1>
	 			</body>
	 		</html>
	 		
	 
	 # html에서 사용하는 주석 처리 방법을 기술하세요.
	 	html 태그 주석
	 	<!-- 주석 -->
	 	css 주석
	 	<style>
	 		/* 주석 처리 */
	
	/*
	  </style>
	  <script>
	   // 자바스크립트 주석
	    /* 다중 라인 주석 */
	 /*
	  </script>
	  	<%--
	  		jsp 주석.
	  	--%>
	  */
	
	public static void main(String[] args) {
		int a = (int)(Math.random() * 100 + 0);
		int b = (int)(Math.random()* 100 + 0);
		int c = (int)(Math.random()* 100 + 0);
		
		System.out.println("a의 값:" + a + " b의 값:" + b + " c의 값:" + c );
		/*
		if(a>b && a>c) {
			System.out.println("a가 가장 큽니다: " + a);
		}else if(b>a && b>c){
			System.out.println("b가 가장 큽니다: " + b);
		}else if(c>a && c>b) {
			System.out.println("c가 가장 큽니다: " + c);
		}else {
			System.out.println("같습니다");
		}
		*/
		int max = a;
		if(max<b) {
			max = b;
		}
		if(max<c) {
			max = c;
		}
		System.out.println("셋중에 최고 값: " + max);
	}

}
