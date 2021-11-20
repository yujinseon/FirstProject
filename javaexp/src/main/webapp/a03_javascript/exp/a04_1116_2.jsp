<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>
function chColor(obj){
console.log("클릭한 h3의 색상:"+obj.innerText); // 클릭한 객체가 가지고 있는 문자열 정보를
																							// 가져올 수 있다.
obj.style.background=obj.innerText; // 그 문자열 색상 정보를 배경 색상으로 할당하여 처리한다
}
</script>
  <h3 onclick="chColor(this)">red</h3>
	<h3 onclick="chColor(this)">orange</h3>
	<h3 onclick="chColor(this)">yellow</h3>
	<h3 onclick="chColor(this)">green</h3>
	<h3 onclick="chColor(this)">blue</h3>
	<h3 onclick="chColor(this)">navy</h3>
	<h3 onclick="chColor(this)">purple</h3>
</body>
</html>