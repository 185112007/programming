<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Sayfasından out(cıkış) Nesnesinin Kullanımı</title>
</head>
<body>

	<h1>out (çıkış) Nesnesinin Kullanımı</h1>
	<br>
	
	<%
		for(int i = 1; i < 10; i++){
			for(int j = 1; j <= i; j++){
				out.print("  " + j);
				System.out.print("  " + j);
			}
			out.print("<hr>");
			System.out.println();
		}
	%>

</body>
</html>