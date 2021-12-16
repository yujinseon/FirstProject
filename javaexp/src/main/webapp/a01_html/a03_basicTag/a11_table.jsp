<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Product"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<style>
		table,th,td{border-collapse:collapse; border:1px solid black;
		text-align:center;}
		th{background:yellow;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/*
	# VO 객체를 활용하여 ArrayList에 담고, 해당 내용을 반복문을 통해서 출력 처리하기
	1. VO객체 만들기 물건명,가격,갯수
	2. jsp : import하기.. VO 및 ArrayList
	3. ArrayList<Product> 선언 및 객체 담기..
		list.add(new Product("오렌지",3000,5))
	4. for(int i=0; i<list.size();i++){
		Product prod = list.get(i);
		prod.getName();
		prod.getPrice();
		prod.getCnt();
	}
	*/
	//사용하게 될 ArrayList 선언.. ArrayList<객체>
 	ArrayList<Product> plist = new ArrayList<Product>();
	plist.add(new Product("술",3000,5)); //객체가 하나씩 추가 처리
	plist.add(new Product("사과",3000,5)); //객체가 하나씩 추가 처리
	plist.add(new Product("딸기",3000,2)); //객체가 하나씩 추가 처리
	//plist.get(0) plist.get(1) plist.get(2)
%>
	<table align="center" width="50%">
		<tr><th>번호</th><th>물건명</th><th>가격</th><th>갯수</th>
		<%for(int i=0;i<plist.size();i++){
			Product prod = plist.get(i);
		
		%>
			<tr><th><%=i+1 %></th>
			<td><%=prod.getName()%></td>
			<td><%=prod.getPrice()%></td>
			<td><%=prod.getCnt()%></td></tr>
		<%} %>
	</table>
	
	
</body>
</html>