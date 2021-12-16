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
	int grade =(int)(Math.random()*8+2); // 2~9까지 임의의 수 발생
	int cnt=(int)(Math.random()*9+1); // 1~9까지
	
	%>
	<form>
			<input type="text" name="num01" size="2" value="<%=grade %>"/>
			X <input type="text" name="num02" size="2" value="<%=cnt %>"/>
			= <input type="text" name="result" size="2" /><br>
			<input type="submit" value="결과확인"/>
	</form>
	<%
		String num01S= request.getParameter("num01");
		String num02S= request.getParameter("num02");
		String resultS= request.getParameter("result");
		int num01 = 0;
		int num02 = 0;
		if(num01S!=null &&num02S!=null){
			num01= Integer.parseInt(num01S);
			num02= Integer.parseInt(num02S);
			int result= Integer.parseInt(resultS);
	%>
	<h2 align="center"><%=num01 %> X <%=num02 %>=<%=(num01*num02) %></h2>
	<h2 align="center">입력한 결과: <%=result %></h2>
	<h2 align="center">정답여부: <%=(num01*num02)==result?"정답":"오답"%></h2>
	
	<%
		}
	%>
</body>
</html>