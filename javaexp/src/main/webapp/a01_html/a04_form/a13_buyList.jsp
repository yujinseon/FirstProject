<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
post 방식의 한글 효청값은 contentType을 설정하여야 정상적으로 처리된다
 --%>
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
	<h2>구매한 물건</h2>
	<h3>물건명:<%=request.getParameter("pname")%></h3>
	<h3>구매갯수:<%=request.getParameter("pcnt")%></h3>
</body>
</html>