<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	# el
	1. jsp에 java코드를 보다 간편하게 처리하기 위해서 지원하는 expression language를 말한다
	2. session, 요청값등 효과적으로 데이터를 처리하게 해준다
	3. 형식 
		1) 요청값 : ${param.요청키}
		http://localhost:7080/javaexp/a05_comp/a08_el_jstl.jsp?name=홍길동
		2) 데이터처리 : ${session데이터}	
			session.setAttribute("키","값");
	 --%>
	 <%
	 //세션이라는 jsp에 지원하는 임시 저장공간
	 session.setAttribute("pname","사과");
	 %>
	 <h2>요청값: ${param.name}</h2>
	 <h2>세션값: ${pname}</h2>
</body>
</html>