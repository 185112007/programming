<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session(Oturum) Nesnesini Oluşturan JSP Sayfası</title>
</head>
<body>

	<%
		String kullaniciAdiDegiskeni = request.getParameter("kullaniciadi");
		session.setAttribute("oturumdakiKullaniciAdi", kullaniciAdiDegiskeni);
	%>
	
	Session(oturum) nesnesi hazır.<br>
	<a href="05_SessinNesnesiniGoster.jsp">Diğer JSP sayfasında görmek için tıklayınız.</a>

</body>
</html>