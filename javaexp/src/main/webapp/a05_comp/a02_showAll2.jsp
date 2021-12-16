<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type ="text/css">
	h2{background-color:pink;
		color:blue;	}
</style>
<script>
	function call(obj){
		obj.align="center";
	}
	function call02(obj){
		alert("호출"+obj);
		obj.align="center";//객체.속성=속성값 
		obj.style.background="yellow";//객체의 style 속성을 변경
		//내용도 변경가능 : 속성
		obj.innerText = "글자변경";
	}
</script>
</head>
<body>
	<h2 onclick="call(this)">클릭하겠습니다(js)</h2>
	<h2 onclick="call02(this)">클릭하겠습니다(js)</h2>
	<h2 align="center">반갑습니다</h2>
	<% 
	String pname="햄버거";
	int pcnt = 3;
	%>
	<h2 align="center">물건명 : <%=pname %></h2>
	<h2 align="center">갯수 : <%=pcnt %></h2>
</body>
</html>