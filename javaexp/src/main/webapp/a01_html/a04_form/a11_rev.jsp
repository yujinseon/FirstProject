<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>전송되어온 데이터</h2>
	<h3>아이디:<%=request.getParameter("id")%></h3>
	<h3>비밀번호:<%=request.getParameter("pass")%></h3>
</body>
</html>