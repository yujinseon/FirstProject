<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import="javaexp.a08_db.A03_DatabaseDao"
import="javaexp.a04_vo.Dept"
import="java.util.ArrayList"   
    %>
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
	<%
	A03_DatabaseDao dao = new A03_DatabaseDao();
	%>
	<table align="center" border>
		<tr><th>부서번호</th><th>부서명</th><th>부서위치</th></tr>
		<%for(Dept d:dao.deptList("A")){%>
		<tr><td><%=d.getDeptno()%></td>
			<td><%=d.getDname() %></td>
			<td><%=d.getLoc() %></td></tr>
		<%} %>
	</table>
</body>
</html>