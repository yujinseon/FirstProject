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
int price = Integer.parseInt(request.getParameter("price"));
int cnt = Integer.parseInt(request.getParameter("cnt"));
int tot = price * cnt;

%>

<table border="1"> 
<tr><th>가격</th><td><%=price %></td></tr>
<tr><th>개수</th><td><%=cnt %></td></tr>
<tr><th>총계</th><td><%=tot%></td></tr>
</table>


</body>
</html>