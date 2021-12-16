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
	# jsp의 MVC 개발 패턴
	1. Model, View, Controller의 약자로 프로그램의 개발패턴가운데 하나이다
	3. 각 영역별로 역할을 주어져서 해당 역할에 따라 소스를 처리
		1) Controller : 중재자 역할 - 요청값을 받아서, 모델데이터 처리에 필요한 정보를 넘겨주고,
			 최종 화면을 처리할 view를 호출..
		2) Model : 처리할 핵심 데이터 말한다. 보통 DB에서 가져온 데이터와 로직에 의해 최종으로
			 view단에 전달할 데이터를 말한다.
		3) View
			 controller/model을 통해서 최종적으로 화면에 나타날 코드를 말한다
			 주로 jsp나 html을 지칭한다. controller에 의해 호출이 되고, 
			 전달해온 model 데이터를 형식에 맞게 웹 화면에 출력한다. 
	4. 실제코드
		1) controller : servlet
		2) model : controller 안에서 선언
		3) view : a09_mvc_view.jsp
	--%>
	 <h2>view단!</h2>
	 <h2>controller에서 온 모델:${show}</h2>
</body>
</html>
