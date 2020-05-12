<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="jb" type="com.yazilimvideo._01_BizimSinifimiz"
	class="com.yazilimvideo._01_BizimSinifimiz" scope="session">
</jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaBeans Formunu Goster</title>
</head>
<body>
	<h2>JavaBeans ve Form İşlemi Sonucu</h2>
	
	<table border="1" id="sonuctablosu">
		<tr>
			<td width="33">Adı</td>
			<td><strong><%= jb.getAdi()%></strong></td>
		</tr>
		<tr>
			<td width="33">Soyadı</td>
			<td><strong><%= jb.getSoyadi()%></strong></td>
		</tr>
		<tr>
			<td width="33">Telefonu</td>
			<td><strong><%= jb.getTelefon()%></strong></td>
		</tr>
		<tr>
			<td width="33">Cinsiyeti</td>
			<td><strong><%= jb.getCinsiyet()%></strong></td>
		</tr>
		<tr>
			<td width="33">Adres</td>
			<td><strong><%= jb.getAdres()%></strong></td>
		</tr>
		<tr>
			<td width="33">Ülke</td>
			<td><strong><%= jb.getUlke()%></strong></td>
		</tr>
		<tr>
			<td width="33">Meslek</td>
			<td><strong><%= jb.getMeslek()%></strong></td>
		</tr>
		<tr>
			<td width="33">Tecrübe</td>
			<td><strong><%= jb.getTecrube()%></strong></td>
		</tr>
		<tr>
			<td width="33">Yaşı</td>
			<td><strong><%= jb.getYasi()%></strong></td>
		</tr>
	</table>
</body>
</html>