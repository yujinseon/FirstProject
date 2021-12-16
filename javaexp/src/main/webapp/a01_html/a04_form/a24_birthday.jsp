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
	<h3>바뀐 생일 및 시간 안내</h3>
	<h3>생일 : ${param.YYYYMMDD}</h3>
	<h3>생일파티시간 : ${param.hhmi}</h3>
	<h3>장소: ${param.partyloc}</h3>
</body>
</html>