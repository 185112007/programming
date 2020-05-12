<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temel Etiketlerin Kullanımı</title>
</head>
<body>

<h1>Temel Etiketlerin Kullanımı</h1>
<font face=verdana color=darkblue>METOD ÖNCESİ</font>
<br>

<!-- declaration tag -->
<%!
public String yaziYazanMetod(int donguKacDefaDonecek){
	String cumle = "";
	
	for(int i = 1; i < donguKacDefaDonecek; i++){
		cumle = cumle + "<font size=" + i + " face=arial color=blue>" + 
			"Güzel gören güzel düşünür.<br>"+
			"Güzel düşünen hayatından lezzet alır.</font><br>";
	}
	
	return cumle;
}
%>

<br>

<!-- expression tag -->
<%= yaziYazanMetod(6)%>
<br>
<font face=verdana color=red>METOD SONRASI</font>

</body>
</html>