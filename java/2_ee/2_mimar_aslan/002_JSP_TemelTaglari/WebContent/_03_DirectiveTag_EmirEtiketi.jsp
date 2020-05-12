<!-- 1 page-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.applet.*, java.awt.*"%>
<%@ page import="com.mycompany.DenemeSinfi" %>
<%@ page session="true" %> <!-- ikide bir sisteme girip cikmamasi icin oturum verilir -->
<%@ page buffer="8kb" autoFlush="true"%>
<%@ page isThreadSafe="true" %> <!-- servisi multitred olarak calismasini saglar -->
<%@ page info="Bil.Mühendisi Gafur Hayytbayev" %>
<%@ page errorPage="hata404.jsp" isErrorPage="true"%> <!-- hata meydana geldiginde yonlendirilir -->

<!-- 2 include-->
<%@ include file="_01_DeclarationTag_BildiriTagi.jsp" %>

<!-- 3 taglib-->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Directive Tag - Emir Etiketi</title>
	</head>
	<body>
		<h1>Directive Tag</h1>
		
		<!-- 3 farklı tarzda gorunuyor -->
		<!-- sayfanın kullanacagi bilgileri ekliyor -->
		<!-- en yukarıda bulunan page bir emir directividir -->
		
		<hr>
		<% out.print("Zaman: "); %>
		<%= new Date() %>
		
		<hr>
		<% 
		String ortamNesnesi = request.getParameter("kullaniciAdi");
		out.print("Oturum Nesnesi: " + ortamNesnesi);
		%>
		<%= new Date() %>
		
	</body>
</html>