<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Season"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Season s1 = new Season("봄", "맑음","3~5");
Season s2 = new Season("여름","비","6~8");
Season s3 = new Season("가을","구름","9~11");
Season s4 = new Season("겨울", "눈","12~2");
%>

<table align="center" border="1">
<thead>
<tr><th>계절명</th><th>날씨</th><th>기간</th></tr>
</thead>
<tbody>
<tr>
<td><%=s1.getSeason()%></td>
<td><%=s1.getWeather()%></td>
<td><%=s1.getTerm()%></td>
</tr>
<tr>
<td><%=s2.getSeason()%></td>
<td><%=s2.getWeather()%></td>
<td><%=s2.getTerm()%></td>
</tr>
<tr>
<td><%=s3.getSeason()%></td>
<td><%=s3.getWeather()%></td>
<td><%=s3.getTerm()%></td>
</tr>
<tr>
<td><%=s4.getSeason()%></td>
<td><%=s4.getWeather()%></td>
<td><%=s4.getTerm()%></td>
</tr>
</tbody>
</table>

</body>
</html>