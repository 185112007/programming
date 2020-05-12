<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Selam JavaBeans</title>
</head>

<!-- aşagıdaki body'de background resim gorunmezse bgcolor devreye girer -->
<body bgcolor="#ffffff" background="resimler/arka_zemin.png">

	<%@ page import="com.yazilimvideo._03_SelamlamaSinifi" %>
	<%@ page info="Selam JavaBeans" %>
	
	<jsp:useBean id="jb" scope="page" class="com.yazilimvideo._03_SelamlamaSinifi"></jsp:useBean>
	<jsp:setProperty property="*" name="jb"/>
	
	<%@ include file="03_SelamJavabeansEkSayfasi.jsp" %>
	
	<form action="03_SelamJavaBeans.jsp" method="post" name="selamJavabeansFormu">
		<table border="1">
			<tr>
				<td width="10">&nbsp;</td>
				<td width="550">
					<h3>Lütfen adınızı soyadınızı ve selamlama mesajınızı giriniz.</h3>
				</td>
			</tr>
			<tr>
				<td width="10">&nbsp;</td>
				<td width="550">
					<table>
						<tr>
							<td><strong>Ad :</strong></td>
							<td>
								<input type="text" name="isim" size="40"/>
							</td>
						</tr>
						<tr>
							<td><strong>Soyadı :</strong></td>
							<td>
								<input type="text" name="soyisim" size="40"/>
							</td>
						</tr>
						<tr>
							<td><strong>Mesaj :</strong></td>
							<td>
								<input type="text" name="mesaj" size="40"/>
							</td>
						</tr>
						<tr>
							<td><strong>&nbsp;</strong></td>
							<td><strong>&nbsp;</strong></td>
						</tr>
						<tr>
							<td></td>
							<td>
								<input type="reset" value="Temizle"/>
								<input type="submit" value="Tamam"/>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>

	<%@ include file="03_SelamJavabeansCevapSayfasi.jsp" %>
</body>
</html>