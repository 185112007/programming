<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Operatorler</title>
</head>
<body>

<% double sayi1 = 1453, sayi2 = 1299, sonuc = 0; %>

Toplama = <% out.print(sonuc = sayi1 + sayi2); %> <br>

Çıkarma = <% out.print(sonuc = sayi1 - sayi2); %> <br>

Çarpma = <% out.print(sonuc = sayi1 * sayi2); %> <br>

Bölme = <% out.print(sonuc = sayi1 / sayi2); %> <br>

Mod Alma = <% out.print(sonuc = sayi1 % sayi2); %> <br>

</body>
</html>