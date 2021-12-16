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
	# 요청값의 처리
	1. client에서 호출하는 처리는 두가지가 있다
		1) 페이지 호출 : ex) 경로/페이지명
		2) 해당 페이지에 전달한 요청값
			ex)경로/페이지명?요청키=요청값
			요청을 한다는말로 query string이라고 한다.
	2. 요청값을 전달하는 것을 client인 브라우저에서 가능하지만
		url 주소 입력으로 호출	도메인주소/경로/페이지명?요청키=요청값
		form형식을 통해서 위와 값은 주소 형식을 만들어 전달한다
			<form action="페이지명">
				<input name="요청키" value="입력한값">
				<input type="submit">
	3. 요청값을 받아서 처리하는 것은 backend에서 java를 통해서 가능하다
		jsp에서 내장된 객체인 request를 통해서 요청키/요청값을 처리한다
		String 변수 = request.getParameter("요청키");
		요청키에 의해 받은 요청값을 변수에 할당한다.
		
	4. 이러한 요청값을 통해서 조건이나 반복을 처리할뿐 아니라,
		ex)
		if(id.equals("himan")&&pass.equals("7777")){
		  //특정 페이지 이동처리
		  response.sendRedirect("로그인페이지")
		}else{
		  // 로그인 화면 호출 처리
		}
	5. DB서버에 요청값을 전달하여 원하는 결과값을 다시 데이터로 리스트할 수 있다.
		1)DAO를 만들고
		2)요청값의 내용 dao객체 특정 기능 메서드에 전달
			import ="DAO객체"
			
		3)전달된 리턴값을 화면에서 처리
			Dao dao = new Dao()
			Member m = dao.getMember(new Member(id,pass));
			m이 null인경우에는 DB에 데이터가 없는 경우이고,
			m이 객체가 있는 경우에는 DB에서 기타 다른 데이터도 Member에 입력되어 처리한 경우이다
	--%>
	<%
	//1. url주소를 통해서 요청값을 받는 처리..
	// 		http://localhost:7080/javaexp/a05_comp/a03_request.jsp
	//2. url 주소에 요청key와 요청값을 입력하기
	//		http://localhost:7080/javaexp/a05_comp/a03_request.jsp?id=himan
	//		페이지명?key=value
	//		요청키/값을 받는 코드 처리
		String id = request.getParameter("id");
	%> 
	<h2 align="center">요청값 받기</h2>
	<h2 align="center">받은 요청값 : <%=id %></h2>
</body>
</html>