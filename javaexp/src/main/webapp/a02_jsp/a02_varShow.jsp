<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
th{text-align: center;}
td{text-align: center;}
</style>
</head>
<body>
	<%--ex) 이름, 나이, 사는곳을 변수로 선언한여 테이블에 출력하세요. --%>
	<%
	String name = "유진선";
	int age = 25;
	String loc = "수원";
	%>
	
	<h2 align="center">회원 정보</h2>
	<table align = "center"  width = "50%" border = "3">
		<col width="30%"> <!-- col : 컬럼의 비율을 지정 -->
		<col width="70%">
		
	<thead>
	<tr><th>이름</th><th>나이</th><th>사는곳</th></tr>
	</thead>
	<tbody>
	<tr><td><%=name %></td><td><%=age %></td><td><%=loc %></td></tr>
	</tbody>
	
	</table>
</body>
</html>