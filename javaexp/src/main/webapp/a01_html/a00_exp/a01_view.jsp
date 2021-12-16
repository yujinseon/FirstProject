<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
   국어 : <input type="text" name="kor" size="2"/><br>
   영어 : <input type="text" name="eng" size="2"/><br>
   수학 : <input type="text" name="math" size="2"/><br>
   <input type="submit" value="점수확인"/>
</form>
   <h3>국어점수 : ${kor}</h3>
   <h3>영어점수 : ${eng}</h3>
   <h3>수학점수 : ${math}</h3>
   <h3>합계 : ${tot}</h3>
   <h3>평균 : ${avg}</h3>
</body>
</html>