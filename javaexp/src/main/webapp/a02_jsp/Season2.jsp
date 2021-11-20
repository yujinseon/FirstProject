<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Season"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td{text-align: center;}
</style>
</head>
<body>
<%
	// api : 많이 활용하는 객체는 java 쪽에서 만들어 제공한다. 이것을 사용할 때.
	// 		 지정된 패키지와 클래스를 선언해주면 된다
	//동적 배열 중에 객체가 들어가 동적 배열 처리..
	//ArrayList<객체유형>
	ArrayList<Season> slist = new ArrayList<Season>();
	// slist.add(new 객체());
	slist.add(new Season("봄","꽃샘추위/따뜻함","3월~5월"));
	slist.add(new Season("여름","무더위","6월~8월"));
	slist.add(new Season("가을","서늘함","9월~10월"));
	slist.add(new Season("겨울","눈/추위","11월~2월"));
	// [ new Season(), new Season(), new Season(), new Season(),]
	// slist.get(0) : 첫번째 season() 객체를 지칭
	// slist.get(0).getSeason() : 해당 객체에 소속된 메서드를 호출
%>
		<h2 align="center">계절과 날씨</h2>
		<table align="center" border="1" width="90%">
			<tr><th>계절</th><th>날씨</th><th>기간</th></tr>
			<tr>
				<td><%=slist.get(0).getSeason() %></td>
				<td><%=slist.get(0).getWeather() %></td>
				<td><%=slist.get(0).getTerm() %></td>
			</tr>
			<tr>
				<td><%=slist.get(1).getSeason() %></td>
				<td><%=slist.get(1).getWeather() %></td>
				<td><%=slist.get(1).getTerm() %></td>
			</tr>
			<tr>
				<td><%=slist.get(2).getSeason() %></td>
				<td><%=slist.get(2).getWeather() %></td>
				<td><%=slist.get(2).getTerm() %></td>
			</tr>
			<tr>
				<td><%=slist.get(3).getSeason() %></td>
				<td><%=slist.get(3).getWeather() %></td>
				<td><%=slist.get(3).getTerm() %></td>
			</tr>
		</table>

</body>
</html>