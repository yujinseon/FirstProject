<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//http://localhost:7080/javaexp/a05_comp/a04_request.jsp?name=진선&age=26
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>
<h2 align="center">요청값 받기</h2>
<h2 align="center">이름: <%=name %></h2>
<h2 align="center">나이 : <%=age %></h2>
</body>
</html>