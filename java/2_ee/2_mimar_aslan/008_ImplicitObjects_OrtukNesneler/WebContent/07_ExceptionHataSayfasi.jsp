<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception Hata Sayfası</title>
</head>
<body>
	<h3>
		<font face="arial" color="red">
			Oluşan Hata:
		</font>
		
		<font face="arial" color="green">
			<%= exception.toString() %>
		</font>
	</h3>
</body>
</html>