<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hata Sayfasi</title>
</head>
<body>
	
	<font face="arial" color="pink">
		Oluşan Hata:
	</font>
	
	<font face="arial" color="blue">
		<%= exception.toString() %>
	</font>
	
</body>
</html>