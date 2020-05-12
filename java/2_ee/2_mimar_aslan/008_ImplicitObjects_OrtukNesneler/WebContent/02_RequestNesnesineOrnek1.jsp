<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request Nesnesi Kullanımına Örnek JSP Sayfamız 1</title>
</head>
<body>

	<font size="5" color="darkblue">Request(İstek) Bilgileri</font>
	<hr>
	
	<table border="1">
		<tr>
			<td width="33%"><b>Request(İstek) Method:</b></td>
			<td width="67%"><%= request.getMethod() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Request(İstek) URI:</b></td>
			<td width="67%"><%= request.getRequestURI() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Request(İstek) Protocol:</b></td>
			<td width="67%"><%= request.getProtocol() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Path Info(Yol Bilgisi):</b></td>
			<td width="67%"><%= request.getPathInfo() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Path Translated(Yol Cevirisi):</b></td>
			<td width="67%"><%= request.getPathTranslated() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Query String(Sorgu Katarı):</b></td>
			<td width="67%"><%= request.getQueryString() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Content Length(İçerik Uzunluğu):</b></td>
			<td width="67%"><%= request.getContentLength() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Content Type(İçerik Tipi):</b></td>
			<td width="67%"><%= request.getContentType() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Server Name(Sunucu Adı):</b></td>
			<td width="67%"><%= request.getServerName() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Server Port(Sunucu Limanı):</b></td>
			<td width="67%"><%= request.getServerPort() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Remote User(Uzak Kullanıcı):</b></td>
			<td width="67%"><%= request.getRemoteUser() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Remote address(Uzak Adres):</b></td>
			<td width="67%"><%= request.getRemoteAddr() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Remote host(Uzak Sahip):</b></td>
			<td width="67%"><%= request.getRemoteHost() %></td>
		</tr>
		
		<tr>
			<td width="33%"><b>Authorization scheme(Yetkilendirme Tasarısı):</b></td>
			<td width="67%"><%= request.getAuthType() %></td>
		</tr>
	</table>

</body>
</html>