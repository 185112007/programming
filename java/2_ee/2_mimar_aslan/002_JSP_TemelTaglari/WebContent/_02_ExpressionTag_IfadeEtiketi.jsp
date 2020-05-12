<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Tags - İfade Etiketleri</title>
</head>
<body>
	<h1>Expression Tag</h1>

	<!-- 
		basindaki = ve sonundaki ; bulunmamasina ifade tagi denir	
	-->


	<hr>
	<!-- skriptlettir -->
	<% out.print("Zaman :"); %>

	<!-- basindaki = ve sonundaki ; bulunmamasina ifade tagi denir -->
	<%= new java.util.Date() %>
</body>
</html>