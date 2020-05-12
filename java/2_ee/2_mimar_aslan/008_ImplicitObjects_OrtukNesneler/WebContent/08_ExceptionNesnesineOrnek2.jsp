<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="08_ExceptionHataSayfasi.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exception Nesnesinin Kullanımına Ornek 2</title>
</head>
<body>

	<%
		int sayi1=1453, sayi2=0, sonuc;
		sonuc = sayi1/sayi2;
		
		out.println(sonuc);
	%>

</body>
</html>