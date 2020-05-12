<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Declaration Tags - Bildiri Etiketleri</title>
	</head>
	<body>
		<h1>Declaration Tag</h1>
		
		<!-- 
			unlem ! - bir bildiri etiketidir 
			degiskenler ve metotlar tanımlanır
		-->
		<%! 
			public int fetihTarihi = 1453;
			public String hunkarPadisah = "FATİH SULTAN MEHMET HAN HAZRETLERİ";
		%>
		
		<% out.println(fetihTarihi); %>
		<hr>
		<% out.println(hunkarPadisah); %>
	</body>
</html>