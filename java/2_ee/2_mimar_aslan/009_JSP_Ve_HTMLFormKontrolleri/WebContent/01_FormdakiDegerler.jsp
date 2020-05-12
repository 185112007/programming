<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Kullanımı</title>
</head>
<body>

	<p align="left">
		<b>JSP Sayfamızda Form Kullanımı Örnek Form </b>
	</p>

	<form method="post" action="01_FormdakiDegerleriKontrolEt.jsp"
		name="bilgiFormu">
		<table width="345" border="2" cellpadding="0" cellspacing="1">
			<tr>
				<td width="98"><strong>Adı</strong></td>
				<td width="254"><input type="text" name="adi" size="40"></td>
			</tr>

			<tr>
				<td width="98"><strong>Soyadı</strong></td>
				<td width="254"><input type="text" name="soyadi" size="40"></td>
			</tr>

			<tr>
				<td width="98"><strong>Parola</strong></td>
				<td width="254"><input type="password" name="parola" size="40"></td>
			</tr>

			<tr>
				<td width="98"><strong>Cümle</strong></td>
				<td width="254"><textarea name="cumle" id="cumle" cols="30"
						rows="3"></textarea></td>
			</tr>
		</table>

		<p>
			<input type="submit" value="Değerleri Gönder" name="GonderDugmesi">
			<input type="reset" value="Formu Temizle" name="YenilemeDugmesi">
		</p>
	</form>

</body>
</html>