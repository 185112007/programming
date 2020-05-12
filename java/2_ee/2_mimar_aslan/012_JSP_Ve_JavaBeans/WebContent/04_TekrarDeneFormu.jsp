<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>İş başvurusu için kayıt formu</title>
</head>
<body>
	<jsp:useBean id="kahveCekirdegi"
		class="com.yazilimvideo._04_ElemanSinifi" scope="request" />


	<form action="04_DegerlendirmeFormu.jsp" method="post">
		<table border="1">

			<tr>
				<th bgcolor="CCCCFF" colspan=2><font size=5>İş başvurusu
					için kayıt formu</font> <br> <font size=2 color="red"><sup>*</sup>
					Yıldızlı alanlar boş geçilmez.</font>
				</th>
			</tr>
			<tr bgcolor="CCFF66">
				<td valign=top><b>Adı<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="text" name="adi"
					value="<%=kahveCekirdegi.getAdi()%>" size=30 maxlength=30 /> <br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("adi")%></font>
				</td>
				<td valign=top><b>Soyadı<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="text" name="soyadi"
					value="<%=kahveCekirdegi.getSoyadi()%>" size=30 maxlength=30 /> <br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("soyadi")%></font>
				</td>
			</tr>

			<tr bgcolor="CCFF66">
				<td valign=top><b>E-Mail<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="text" name="email"
					value="<%=kahveCekirdegi.getEmail()%>" size=30 maxlength=100 /> <br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("email")%></font>
				</td>
				<td valign=top><b>Posta Kodu<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="text" name="postakodu"
					value="<%=kahveCekirdegi.getPostakodu()%>" size=30 maxlength=10 />
					<br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("postakodu")%></font>
				</td>
			</tr>

			<tr bgcolor="CCFF66">
				<td valign=top><b>Kullanıcı Adı<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="text" name="kullaniciadi" size=30
					maxlength=30 value="<%=kahveCekirdegi.getKullaniciadi()%>" /> <br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("kullaniciadi")%></font>
				</td>
				<td valign=top><b>Cinsiyetiniz</b> <br> <input
					type="radio" name="cinsiyet" value="Erkek"
					<%=kahveCekirdegi.secilenCinsiyet("Erkek")%>>Erkek <input
					type="radio" name="cinsiyet" value="Bayan"
					<%=kahveCekirdegi.secilenCinsiyet("Bayan")%>> Bayan</td>
			</tr>

			<tr bgcolor="CCFF66">
				<td valign=top><b>Parola<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="password" name="parola1" size=30
					maxlength=30 value="<%=kahveCekirdegi.getParola1()%>" /> <br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("parola1")%></font>
				</td>
				<td valign=top><b>Tekrar Parola<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="password" name="parola2" size=30
					maxlength=30 value="<%=kahveCekirdegi.getParola2()%>" /> <br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("parola2")%></font>
				</td>
			</tr>

			<tr bgcolor="CCFF66">
				<td valign=top colspan=2><b>Adres<font size=2 color="red"><sup>*</sup></font></b>
					<br> <input type="text" name="adres" size=65 maxlength=65
					value="<%=kahveCekirdegi.getAdres()%>" /> <br>
				<font size=2 color=red><%=kahveCekirdegi.getHataMesajlari("adres")%></font>
				</td>
			</tr>

			<tr bgcolor="CCFF66">
				<td valign=top colspan=2><b>Tecrübeli olduğunuz alanlar?</b> <br>
					<input type="checkbox" name="tecrubealani" value="Java"
					<%=kahveCekirdegi.secilenTecrubeler("Java")%>> <font size=2
					color="red"><strong>Java</strong></font> <input type="checkbox"
					name="tecrubealani" value="JSP"
					<%=kahveCekirdegi.secilenTecrubeler("JSP")%>> <font size=2
					color="red"><strong>JSP</strong></font> <input type="checkbox"
					name="tecrubealani" value="NetBeans IDE"
					<%=kahveCekirdegi.secilenTecrubeler("NetBeans IDE")%>> <font
					size=2 color="red"><strong>NetBeans IDE</strong></font> <br> <input
					type="checkbox" name="tecrubealani" value="Struts"
					<%=kahveCekirdegi.secilenTecrubeler("Struts")%>>Struts <input
					type="checkbox" name="tecrubealani" value="Spring"
					<%=kahveCekirdegi.secilenTecrubeler("Spring")%>>Spring <input
					type="checkbox" name="tecrubealani" value="JavaServer Faces"
					<%=kahveCekirdegi.secilenTecrubeler("JavaServer Faces")%>>JavaServer
					Faces <br> <input type="checkbox" name="tecrubealani"
					value="Hibernate"
					<%=kahveCekirdegi.secilenTecrubeler("Hibernate")%>>Hibernate

					<input type="checkbox" name="tecrubealani" value="Servlets"
					<%=kahveCekirdegi.secilenTecrubeler("Servlets")%>>Servlets

					<input type="checkbox" name="tecrubealani" value="Eclipse IDE"
					<%=kahveCekirdegi.secilenTecrubeler("Eclipse IDE")%>>Eclipse
					IDE
					<hr> <input type="checkbox" name="tecrubealani" value="MySql"
					<%=kahveCekirdegi.secilenTecrubeler("MySql")%>> <font
					size=2 color="red"><strong>MySql</strong></font> <input
					type="checkbox" name="tecrubealani" value="Oracle"
					<%=kahveCekirdegi.secilenTecrubeler("Oracle")%>>Oracle <input
					type="checkbox" name="tecrubealani" value="SqlSever"
					<%=kahveCekirdegi.secilenTecrubeler("SqlSever")%>>SqlServer
				</td>
			</tr>

			<tr bgcolor="CCCCFF">
				<td align=right colspan=2>
					<input type="reset" value="Temizle"> 
					<input type="submit" value="Gönder">
				</td>
			</tr>

		</table>

	</form>


</body>
</html>