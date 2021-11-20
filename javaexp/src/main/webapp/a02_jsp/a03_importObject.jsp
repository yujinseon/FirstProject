<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="javaexp.a04_vo.Team"
    %>
    <%-- 복사된 내용을 ""사이에 붙여준다. 주의! 공백이 들어가면 안된다. --%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
td{text-align: center;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	# java의 객체 활용과 데이터 처리
	1. 필요로 하는 클래스를 jsp에서 Object로 활용할 수 있다.
	2. 처리 방법
		1) 속성값 파악 및 데이터 유형 확인
		2) VO 객체 java 소스의 위치에서 특정한 package를 만들어 생성
		3) 해당 위치의 클래스 파일의 패키지명과 클래스명을 복사
		4) jsp 상단의 page 지시자(<% page)의 속성에 속성을 import="패키지명.클래스"으로 선언
		5) <% %> 코드 사이에 객체를 생성 및 생성자를 통해서 데이터 할당.
		6) 테이블 구조를 만들고 해당 구조안에 참조변수.getXXX() 메서드를 통해서 필드값을 간접적으로 호출
		7) 에러 내용/코드 확인 및 실행
	 # 예제
	 1. 팀명 승 무 패 처리하는 객체..
	 2. z01_vo 패키지 하위에 class Team 클래스로 String tname, int vic, int equa, int def
	 	로 필드 설정 및 기본 VO객체 생성
	 --%>
	<%
	Team t1 = new Team("두산",71,8,65);
	%>
	<h2 align="center">팀 성적</h2>
	<table align = "center" border="2">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<thead>
			<tr><th>팀명</th><th>승</th><th>무</th><th>패</th></tr>
		</thead>
		<tbody>
			<tr>
				<td><%=t1.getTname()%></td>
				<td><%=t1.getVic()%></td>
				<td><%=t1.getEqu()%></td>
				<td><%=t1.getDef()%></td>
			</tr>
		</tbody>
	</table>
</body>
</html>