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
	<%--
	# jsp 요청값
	String 단일요청 = request.gatParameter("요청키");
	String 다중요청[] = request.gatParameterValues("요청키");
	
	# el을 통한 요청값 받기
	${param.요청키}
	${paramValues.요청키[0]}
	${paramValues.요청키[2]}
	 --%>
	<h3>${paramValues.hobby[0]}</h3>
	<h3>${paramValues.hobby[1]}</h3>
	<h3>${paramValues.hobby[2]}</h3>
</body>
</html>