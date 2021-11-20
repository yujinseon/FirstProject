<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
<script>
var num="";

for(var i=1; i<=50; i++){
	num = String(i);
	
	if(num.includes("3")||num.includes("6")||num.includes("9")) {
		if(num=="33"|| num=="36"||num=="39") {
			console.log("짝짝");
		}
		console.log("짝");
				
	}else{
		console.log(num);
	}
	
}
</script>
</html>