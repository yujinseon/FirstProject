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
String name = request.getParameter("name");
String cnt = request.getParameter("cnt");
%>

물건명:<%=name %> <br>
개수:<%=cnt %>
</body>
</html>