<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex_1115_2.jsp">
	물건명: <input type=text name="name"/><br>
	개수: <input type=text name="cnt"/><br>
	<input type=button value="등록" onclick="login()"/><br>
	</form>
</body>
<script>
function login() {
	var nameObj = document.querySelector("[name=name]");
	var cntObj = document.querySelector("[name=cnt]");
	
	if(nameObj.value == ""){
		alert('물건명을 입력하세요');
		return;
	}
	
	if(cntObj.value == ""){
		alert('개수를 입력하세요');
		return;
	}
	
	var frmObj = document.querySelector("form")
	frmObj.submit();
}

</script>
</html>