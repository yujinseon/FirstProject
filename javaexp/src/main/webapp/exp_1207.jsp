<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="javaexp.a04_vo.A02_Person"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
   function colorFun(obj) {
      if(obj.style.background=="red") {
         obj.style.background = "orange";
      } else if(obj.style.background == "orange") {
         obj.style.background = "yellow";
      } else if(obj.style.background == "yellow") {
         obj.style.background = "green";
      } else if(obj.style.background == "green") {
         obj.style.background = "blue";
      } else if(obj.style.background == "blue") {
         obj.style.background = "navy";
      } else if(obj.style.background == "navy"){
         obj.style.background = "purple"
      } else {
         obj.style.background = "red";
      }
      
   }
   function ex6(obj){
      switch (obj.style.background){
         case "red":
            obj.style.background = "orange";
         break;
         case "orange":
            obj.style.background = "yellow";
         break;
         case "yellow":
            obj.style.background = "green";
         break;
         case "green":
            obj.style.background = "blue";
         break;
         case "blue":
            obj.style.background = "indigo";
         break;
         case "indigo":d
            obj.style.background = "purple";
         break;
         default : 
             obj.style.background = "red";
          break;
      } 
   }

   
</script>

</head>
<body>
<%--
2021-12-07
[1단계:개념] 1. 웹프로그램에서 프런트단과 백앤드단을 나누는 기준은 무엇인가?
[1단계:개념] 2. 프런트단 html, css, javascript의 각각의 핵심 역할을 기술하세요
[1단계:개념] 3. 백앤드단 java와 database의 역할을 기술하세요.
[1단계:개념] 4. jsp 프로그램의 처리되는 과정을 기술하세요.
[2단계:확인] 5. javascript의 이벤트와 이벤트핸들러를 통해서, h1 클릭시마다 정렬이 연속적으로 변경되게 하세요.
[2단계:확인] 6. javascript의 이벤트와 이벤트핸들러를 통해서, h2 클릭시마다 배경 색상이 연속적으로 무지개색상으로 변경되게 하세요.
[1단계:개념] 7. jsp의 코드가 들어가는 부분과 출력이 처리되는 부분을 구분하여 처리하세요
[2단계:개념] 8. jsp에서 변수, 객체, 배열을 선언하여 화면에 출력하세요.

 --%>
<!-- [2단계:확인] 6. javascript의 이벤트와 이벤트핸들러를 통해서, h2 클릭시마다 배경 색상이 연속적으로 무지개색상으로 변경되게 하세요 -->
	<h2 onclick="colorFun(this)" align="center">무지개 배경색상 바꾸기</h2>
	<h2 onclick="ex6(this)" align="center">무지개 배경색상 바꾸기</h2>
	<h2 onclick="ex7(this)" align="center">무지개 배경색상 바꾸기</h2>
	
	
<!-- [2단계:개념] 8. jsp에서 변수, 객체, 배열을 선언하여 화면에 출력하세요. -->
	<% 
	String pname="햄버거";
	int price = 6900;
	int pcnt = 3;
	//2. 객체
	//	1)사용하게 될 객체 선언
	//	2) import 처리
	// 	3) 객체 생성
	A02_Person p01 = new A02_Person("홍길동",25,"서울 신림");
	
	
	String str[] = {"사과", "6900", "3"};
	%>
	<h2 align="center">물건명 : <%=pname %></h2>
	<h2 align="center">가격 : <%=price %></h2>
	<h2 align="center">갯수 : <%=pcnt %></h2>
	<h2 align="center">객체 이름 : <%=p01.getName() %></h2>

	<h2 align="center">가격 : <%=str[1] %></h2>
</body>
</html>