<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "javaexp.a04_vo.BaseballPlayer"
    %>
    
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
	<%--
	ex) 프로야구 선수의 정보를 클래스로 만들어 객체를 생성해서 출력
	속성 : 선수명,분야(투수/타자), 소속팀, 성적
	 --%>
	 <%
	 BaseballPlayer bp = new BaseballPlayer("홍길동", "투수", "한화", 2);
	 BaseballPlayer bp1 = new BaseballPlayer("김길동", "투수", "삼성", 1);
	 %>
	 
	 <h2 align = "center">선수 정보</h2>
	 <table align= "center" width="50%" border="2">
	 	<col width="25%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
	 <thead>
	 	<tr><th>선수명</th><th>포지션</th><th>소속팀</th><th>성적</th></tr>
	 </thead>
	 <tbody>
	 	<tr>
	 		<td><%=bp.getName() %></td>
	 		<td><%=bp.getPos() %></td>
	 		<td><%=bp.getTeam() %></td>
	 		<td><%=bp.getScore() %></td>
	 	</tr>
	 	<tr>
	 		<td><%=bp1.getName() %></td>
	 		<td><%=bp1.getPos() %></td>
	 		<td><%=bp1.getTeam() %></td>
	 		<td><%=bp1.getScore() %></td>
	 	</tr>
	 </tbody>
	 </table>
</body>
</html>