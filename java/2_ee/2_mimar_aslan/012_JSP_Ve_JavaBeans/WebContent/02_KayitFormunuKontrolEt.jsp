<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.yazilimvideo._02_GirilenDegerleriKontrolEdenSinif"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kayıt Formunu Kontrol Et</title>
</head>

<jsp:useBean id="jb"
	class="com.yazilimvideo._02_Kullanici" />

<jsp:setProperty name="jb" property="kullaniciadimiz" />
<jsp:setProperty name="jb" property="parolamiz" />

<body>

	<h4>Kayıt Formunu Kontrol Et</h4>

	<%
		_02_GirilenDegerleriKontrolEdenSinif denetlemeNesnesi = new _02_GirilenDegerleriKontrolEdenSinif();

		denetlemeNesnesi.hatalariKontrolEdenMethod(request, jb);

		String hatalar = (String) request.getAttribute("hatalar");

		if (hatalar != null && hatalar.trim().length() > 0) {
	%>
	<jsp:forward page="02_KayitFormu.jsp"></jsp:forward>
	<%
		}
	%>

	<h3>
		<font face=verdana color=green>Girilen degerler gecerlidir.</font>
	</h3>

	<table border="1">

		<tr>
			<td width="30%">Adı</td>
			<td width="70%"><strong><%=jb.getKullaniciadimiz()%></strong></td>
		</tr>

		<tr>
			<td>Parola</td>
			<td><strong><%=jb.getParolamiz()%></strong></td>
		</tr>
	</table>

	<h3>
		<font face=verdana color=darkblue>Beans(Fasulyeler)ini Alan
			Form</font>
	</h3>
	<a href="02_KayitFormu.jsp">Kayıt Formuna Dönmek için Tıklayınız.</a>

</body>
</html>