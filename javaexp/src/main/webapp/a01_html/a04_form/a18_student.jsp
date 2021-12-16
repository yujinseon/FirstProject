<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>학생등록정보</h3>
	<h3>학생명:${param.name}</h3>
	<h3>학생:${param.grade}</h3>
	<h3>성별:${param.gender}</h3>
</body>
</html>