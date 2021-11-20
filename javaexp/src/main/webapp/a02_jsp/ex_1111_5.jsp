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
int a1 = 3;
int a2 = 5;
int a3 = 2;

int sum = a1+a2+a3;
%>

<table border = "1">
<thead>
	<tr>
		<th>과일명</th>
		<th>계</th>
	</tr>
</thead>
<tbody>
	<tr>
		<td>사과</td>
		<td><%=a1 %></td>
	</tr>
	<tr>
		<td>키위</td>
		<td><%=a2 %></td>
	</tr>
	<tr>
		<td>파인애플</td>
		<td><%=a3 %></td>
	</tr>
	<tr>
		<td>총계</td>
		<td><%=sum %></td>
	</tr>
</tbody>
</table>

<!-- 8번문제 -->

<%

int b1 = ((int)(Math.random())*100 + 0); 
int b2 = ((int)(Math.random())*100 + 0); 
int b3 = ((int)(Math.random())*100 + 0); 
int b4 = 0;

int[] arr = {b1,b2,b3};

for(int i=0; i<arr.length; i++){
	for(int j=0; j<arr.length; j++){
		if(arr[i]>arr[j]){
			b4 = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = b4;
			
			for(int k=0; k<arr.length; k++){
				
			}
		}
	}
}
	
%>
</body>
</html>