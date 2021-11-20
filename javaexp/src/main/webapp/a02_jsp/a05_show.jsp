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
	// id=himan&pass=7777
	// 요청값으로 client로 부터 넘겨온 데이터를 페이지 호출과 함께
	// 아래 형식으로 server에서 데이터를 받게 된다.
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String result = "";
	if(id.equals("himan")&&pass.equals("7777")){
		result="인증 성공";
	}else{
		result="인증 실패";
	}
	
	// 다시 client에 아래와 같이 받은 데이터와 html코드와 함께 전송한다.
	// 브라우저 화면에서 입력한 내용을 볼 수 있다.
	%>
	<h2>입력한 아이디:<%=id %></h2>
	<h2>입력한 패스워드:<%=pass%></h2>
	<h2>결과:<%=result %></h2>
	<script>
		// java ==> javascript
		var result = "<%=result%>";
		if(result=="인증 실패"){
			alert("로그인 실패.");
			// a href 작용을 하는 javascript 코드..
			location.href="a04_webProgProcess.jsp";
		}
	</script>
</body>
</html>
<%--
a04_webProgProcess.jsp ==> a05_show.jsp
# 페이지 이동 데이터 처리..
1단계
<a href="a05_show.jsp">페이지 이동</a> : 페이지만 이동.
2단계
<a href="a05_show.jsp?id=himan&pass=7777">페이지 이동</a> : 페이지만 이동과 데이터를 전송
3단계
	화면을 만들어서 데이터 전송 form
		<form action="a05_show.jsp">
			<input name="id" value="himan"/>
			<input name="pass" value=7777/>
			<input name="submit" value="로그인"/>
		</form>
4단계
	전송하기전에 입력 데이터를 확인해서 전송
	1) 바로 넘어가게 하지 않으려면 type="button"
		<input type="button" value="로그인" />
	2) 이벤트 핸들러 함수 선언
		<input type="button" value="로그인" onclick="login()" />
	
		function login(){
		
		}
		--------------------
	3) 해당 요소객체의 데이터를 확인..
		// 화면에 있는 <input name="id" value="himan"/>를 객체화하여 처리..
		var idObj = document.querySelector("[name=id]");
		idObj.value : 입력한 값을 확인.
		var formObj = document.querySelector("form");
		formObj.submit(); // type="submit"를 클릭한 것과 동일한 효과
	
--%>