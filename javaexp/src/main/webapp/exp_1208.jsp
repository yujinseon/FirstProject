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
<table border="1" style="border-collapse:collapse;">
   <tr>
      <th>번호</th><th>문제</th><th>정답</th>
   </tr>
<%
   String[] gu = {"X", "+", "-", "/"};
   for(int i=0; i<10; i++) {
      int num1 = (int)(Math.random()*9+1);
      int num2 = (int)(Math.random()*9+1);
      int bun = (int)(Math.random()*4);
%>
   <tr>
      <td>
         <%=i+1%>
      </td>
      <td>
         <input type="text" name="num1" size="2" value=<%=num1%>>
         <input type="text" name="gu" size="2" value=<%=gu[bun]%>>
         <input type="text" name="num2" size="2" value=<%=num2%>>
      </td>
      <td>
         <input type="text" name="result" size="2">
      </td>
   </tr>
<%
   }
%>
   <tr>
      <td colspan="3">
         <input type="submit" value="점수확인">
      </td>
   </tr>
</table>
</form>
   
<%
   int cnt = 0;
   String[] num1S = request.getParameterValues("num1");
   String[] num2S = request.getParameterValues("num2");
   String[] resultS = request.getParameterValues("result");
   String[] guS = request.getParameterValues("gu");
   if(num1S!=null && num2S!=null && resultS!=null && guS!=null) {
      for(int i=0; i<10; i++) {
         int num1I = Integer.parseInt(num1S[i]);
         int num2I = Integer.parseInt(num2S[i]);
         int resultI = Integer.parseInt(resultS[i]);
         String guS1 = guS[i];
         if(guS1.equals("X")) {
            if((num1I*num2I)==resultI) {
               cnt+=10;
            }
         }else if(guS1.equals("+")) {
            if((num1I+num2I)==resultI) {
               cnt+=10;
            }
         }else if(guS1.equals("-")) {
            if((num1I-num2I)==resultI) {
               cnt+=10;
            }
         }else if(guS1.equals("/")) {
            if((num1I/num2I)==resultI) {
               cnt+=10;
            }
         }
      }
%>
   <h3>점수확인 : <%=cnt %></h3>
<%
   }
%>
	
</body>
</html>