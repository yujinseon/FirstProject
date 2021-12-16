<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<%--
	# jsp의 반복문과 테이블 처리
	1. col단위 반복문 수행으로 테이블 출력 처리
		jsp
		<%
		for(초기값;반복조건;증감연산){
		%>
		처리한 태그(반복출력할내용)
		<%}%>
	2. 배열값 
		for(단위 데이터:배열){
			단위데이터..
		}
	 --%>
	<table border="1">
		<tr>
			<%
			for (int i = 1; i <= 5; i++) {
			%>
			<td><%=i%> 번 열</td>
			<%
			}
			%>
		</tr>
	</table>
	<%
	String fruits[] = { "사과", "바나나", "딸기" };
	%>
	<table border="1">
		<tr>
			<%
			for (String fruit : fruits) {
			%>
			<td><%=fruit%></td>
			<%
			}
			%>
		</tr>
	</table>
	<%--
	 ex) 5~10까지 열단위로 출력하고, 정수형 배열 1000,2000,3000을 열단위 출력하세요
	  --%>
	<table border="1">
		<tr>
			<%
			for (int i = 5; i <= 10; i++) {
			%>
			<td><%=i%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	int[] prices = { 1000, 2000, 3000 };
	/*
	배열의 반복문 index 처리
	for(int d=0;i<prices.length;d++){
		i : 0부터 시작해서 .length보다 1작을때까지 반복수행
		prices[idx] : 배열의 값을 가져올 수 있다
	}
	*/
	%>
	<table border="1">
		<tr>
			<%
			for (int price : prices) {
			%>
			<td><%=price%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	String product[] = { "컴퓨터", "냉장고", "세탁기" };
	%>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>전자제품</th>
		</tr>
		<%
		for (int i = 0; i < product.length; i++) {
		%>
		<tr>
			<td><%=(i + 1)%></td>
			<td><%=product[i]%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%--
	 ex) 도서명을 배열로 3개 선언하고, 번호와 함께 출력하세요
	  --%>
	<%
	String[] books = { "아프니깐", "청춘", "이다" };
	int [] pays={2800,3000,3200};
	%>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>책이름</th>
			<th>가격</th>
		</tr>
		<%
		for (int i = 0; i < books.length; i++) {
		%>
		<tr>
			<td><%=(i + 1)%></td>
			<td><%=books[i]%></td>
			<td><%=pays[i]%></td>
		</tr>
		<%}%>
	</table>
	<%--
	 table 중앙정렬, 타이틀 부분을 배경 노랑색, 1 line으로 만들어
	 마트에서 구매할 물건명 가격 갯수로 3개 물품을 출력
	 --%>

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
	
	String[] prod = { "소주", "맥주", "양주" };
	int [] price={3000,5000,10000};
	int [] cnt={3,5,10};
	%>
	<table border="1" align="center">
		<tr>
			<th>번호</th>
			<th>믈건명</th>
			<th>가격</th>
			<th>갯수</th>
		</tr>
		<%
		for (int i = 0; i < prod.length; i++) {
		%>
		<tr>
			<td><%=(i + 1)%></td>
			<td><%=prod[i]%></td>
			<td><%=price[i]%></td>
			<td><%=cnt[i]%></td>
		</tr>
		<%}%>
	</table>
	
	<%--
		1) 배열 데이터
		String[] prod = { "소주", "맥주", "양주" };
		int [] price={3000,5000,10000};
		int [] cnt={3,5,10};
		index로 단위데이터를 가져온다
			prod[0] ,price[0], cnt[0]
		2) 객체 list 데이터
		Arraylist<Prod> plist = new Arraylist<Prod>();
		plist.add( new Prod("오렌지",2000,5);
		~~
		
		plist.get(0) ==> Prod("오렌지",2000,5)
		
		
		
		
		
		class Prod{
			private String prod
			반복 --
			
			//생성자로 데이터 할당
			product(String prod ~~~
				this.prod = prod ~~
				
			//기능 메서드 get/set 통해 메서드를 통해서만 데이터 접근가능
			
	
	 --%>
</body>
</html>