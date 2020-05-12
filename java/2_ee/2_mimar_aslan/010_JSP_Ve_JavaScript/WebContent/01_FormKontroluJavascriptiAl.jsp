<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p align="left">
		<b>Kayıt Formundan Gelen</b>
	</p>

	<table border="1" id="table1">

		<tr>
			<td width="33%">Adı</td>
			<td><strong><%=request.getParameter("adi")%></strong></td>
		</tr>

		<tr>
			<td width="33%">Soyadı</td>
			<td><strong><%=request.getParameter("soyadi")%></strong></td>
		</tr>

		<tr>
			<td width="33%">Telefonu</td>
			<td><strong><%=request.getParameter("telefon")%></strong></td>
		</tr>

		<tr>
			<td width="33%">Cinsiyeti</td>
			<td><strong><%=request.getParameter("cinsiyet")%></strong></td>
		</tr>

		<tr>
			<td width="33%">Adres</td>
			<td><strong><%=request.getParameter("adres")%></strong></td>
		</tr>

		<tr>
			<td width="33%">Ülke</td>
			<td><strong><%=request.getParameter("ulke")%></strong></td>
		</tr>

		<tr>
			<td>Meslek</td>
			<td><strong><%=request.getParameter("meslek")%></strong></td>
		</tr>

		<tr>
			<td>Tecrübe Yılı</td>
			<td><strong><%=request.getParameter("tecrube")%></strong></td>
		</tr>

	</table>
</body>
</html>