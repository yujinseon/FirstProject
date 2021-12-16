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
	# 요청한 값이 숫자형일 때 처리,
		1. 기본적으로 모든 요청값은 문자열형이다
		2. 그래서 숫자 데이터를 요청값으로 받아서 처리해야할 경우에는 형변환이 필요하다
		3. 숫자형 문자열을 숫자로 변환할 때 필요한 기능 메서드
			Integer.parseInt("숫자형문자열") ==> 숫자
			ex) int num05 = integer.parseInt("25");
			num05에 25라는 정수가 할당될 수 있다.
		5. 요청값을 받아서 숫자형태로 반환
			?age-25
			String ageS = request.getParameter("age");
			if(ageS!=null){//요청값을 입력했을때만 처리..
				int age =Integer.parseInt(ageS);
			}
	 --%>
	<form>
		구매할 물건: <input type="text" name="pname" placeholder="입력해주세요"/><br>
		가격: <input type="text" name="price" placeholder="입력해주세요"/><br>
		갯수: <input type="text" name="cnt" placeholder="입력해주세요"/><br>
		<input type="submit" value="구매"/>
	</form>
	<%
		String pname=request.getParameter("pname");
		String priceS=request.getParameter("price");
		String cntS=request.getParameter("cnt");
		int price=0;
		int cnt=0;
		if(priceS!=null){
			price= Integer.parseInt(priceS);
		}
		if(cntS!=null){
			cnt= Integer.parseInt(cntS);
		}
		if(pname!=null){

	%>
	
	<h2 align="center">구매할 물건:<%=pname %></h2>
	<h2 align="center">가격:<%=price %></h2>
	<h2 align="center">갯수:<%=cnt %></h2>
	<h2 align="center">총계:<%=(price*cnt) %></h2>
	<%	
		}
	%>
</body>
</html>