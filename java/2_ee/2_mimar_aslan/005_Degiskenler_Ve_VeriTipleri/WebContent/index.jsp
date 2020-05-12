<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Degiskenler ve Veri Tipleri</title>
</head>
<body>

<%
int sayi1 = 0, sayi2 = 571, sayi3 = 632;
byte kontrolSayisi = 14;
double a= 0, b, c = 12.99;
float d, e = 15.17f, g = (float)14.53;
char karakter = 'a';

System.out.println(sayi1 + sayi3 * sayi2);
%>

<%
out.println(sayi1 + sayi3 * sayi2);
%>
<br>
<hr>
<%
out.println(a);
%>

</body>
</html>