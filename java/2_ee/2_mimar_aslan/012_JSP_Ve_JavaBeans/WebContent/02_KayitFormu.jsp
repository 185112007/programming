<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kayıt Formu</title>
</head>
<body>

	<h3>Kayıt Formu</h3>
	<form action="02_KayitFormunuKontrolEt.jsp">
		<table border="1">
		
			<%
				String hatalar = (String)request.getAttribute("hatalar");
				if(hatalar != null && hatalar.trim().length() > 0){
					out.println("<tr>" 
							   +" 	<td colspan='2'>"
							   +"      <h3><font face='verdana' color='red'>" + hatalar
							   +		   "</font>"
							   +	  "</h3>"
							   +   "</td>"
							   +"</tr>");
				}
			%>
			
			<tr>
				<td width="33%">Kullnıcı Adı</td>
				<td><input type="text" 
						   name="kullaniciadimiz" 
						   id="username"
						   size="20"
						   value="<%=request.getParameter("kullaniciadimiz") != null ? request.getParameter("kullaniciadimiz") : "" %>">
				</td>
			</tr>
			<tr>
				<td width="33%">Parola</td>
				<td>
					<input type="password" 
						name="parolamiz" 
						id="psw" 
						value="<%=request.getParameter("parolamiz")!= null ? request.getParameter("parolamiz"):""%>">
				</td>
			</tr>
		</table>
		<p>
			<input type="submit" value="Gönder" name="GonderDugmesi">
			<input type="reset" value="Temizle" name="TemizleDugmesi">
		</p>
	</form>

</body>
</html>