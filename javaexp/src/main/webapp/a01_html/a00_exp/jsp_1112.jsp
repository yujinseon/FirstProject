<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a00_exp.A11_1112"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<A11_1112> a1 = new ArrayList<A11_1112>();
	a1.add(new A11_1112("인텔I7", "32GB", "1TB"));
	%>
	<table align = "center" width = "50%" border = "1">
	<tr><th>cpu</th><th>ram</th><th>hdd</th></tr>
	<tr>
	<td><%=a1.get(0).getCpu() %></td>
	<td><%=a1.get(0).getRam() %></td>
	<td><%=a1.get(0).getHdd() %></td>
	</tr>
	</table>
	
</body>
</html>