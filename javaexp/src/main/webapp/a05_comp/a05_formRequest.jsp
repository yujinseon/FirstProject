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
	# form 요소를 통한 요청값 처리
	1. url로 처리되는 형식을 form으로 처리하면, 화면 형식에 데이터를 입력하고,
	요청값을 서버에 전달할 수 있다.
	2. 기본 형식 
		<form action="전달할페이지">
			<input name="요청키" value="요청값"/>
			<select name="요청키"
				<option>선택한 요청값
				<option>선택한 요청값
				<option>선택한 요청값
			<textarea name="요청키">입력한 요청값
			<input type="submit"> ==> 이버튼을 클릭시.. action에 선언한
				페이지로 각 요소에 요청키에 해당하는 내용을 입력한 요청값으로 서버에 전달된다
				
	 --%>
	<form><!-- action을 선언하지 않으면 현재 페이지에 요청값이 전달된다 -->
		등록할 아이디:<input type="text" name="id" value="himan"/><br>
		<input type="submit" value="등록"/>
	</form>
	<%	
		String str[] = {"+","-","x","/"};
		String id = request.getParameter("id");
	%>
	<h2 align="center">등록할 아이디:<%=id %><%=str[1] %></h2>
</body>
</html>