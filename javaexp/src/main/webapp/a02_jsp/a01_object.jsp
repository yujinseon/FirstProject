<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%-- 
# jsp
1. java코드와 html 코드를 혼합하여 최종 html 코드를 만들어서
	client(브라우저를 가지고 요청한 사용자)에 WAS를 통해서 전달 처리한다.
	
2. 단계별 처리 내용
	1) 변수로 데이터 출력
	2) 객체로 데이터 처리
	3) 동적 배열을 통한 데이터 처리
 --%>
 <%
 	String name="사과";
 	int price = 3000;
 	int cnt = 2;
 %>
 	<h2 align="center">물건정보</h2>
	<table align = "center" width="30%" border="1">
		<tr><th>물건명</th><td><%=name%></td></tr>
		<tr><th>가격</th><td><%=price%></td></tr>
		<tr><th>갯수</th><td><%=cnt%></td></tr>
	</table>
<body>

</body>
</html>