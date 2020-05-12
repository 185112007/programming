<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kontrol Ifadeleri</title>
</head>
<body>

<h3>Kontrol Ifadeleri</h3>


<% 
int sayi = 1453;
String mesaj = "";

%>

<h3>if</h3>
<%
if(sayi == 1453){
	out.println("İstanbul'un Fetih Tarihi " + sayi + "'tür.");
}
%>

<h3>if - else</h3>
<%
if(sayi == 1453){
	out.println("İstanbul'un Fetih Zamanı " + sayi + "'tür.");
}else{
	out.println("İstanbul'un Fetih Tarihi " + sayi + " değildir!");
}
%>

<h3>if - else if - else ...</h3>
<%
if(sayi == 1453){
	out.println("İstanbul'un Fetih Zamanı " + sayi + "'tür.");
}else if(sayi == 1299){
	out.println("Osmanlı'nın kuruluş zamanı " + sayi + "'dur.");
} else{
	out.println("Bu " + sayi + " tarihin Şanlı Osmanlı ile ilgisi yok!");
}
%>

<h3>switch - case</h3>
<%
switch(sayi){
case 1453:
	out.println("İstanbul'un Fetih Zamanı " + sayi + "'tür.");
	break;
case 1299:
	out.println("Osmanlı'nın kuruluş zamanı " + sayi + "'dur.");
	break;
default:
	out.println("Bu " + sayi + " tarihin Şanlı Osmanlı ile ilgisi yok!");
	break;
}
%>

<h3>switch - case with mesaj</h3>
<%
switch(sayi){
case 1453:
	mesaj = "İstanbul'un Fetih Tarihi " + sayi + "'tür.";
	break;
case 1299:
	mesaj = "Osmanlı'nın kuruluş tarihi " + sayi + "'dur.";
	break;
default:
	mesaj = "Bu " + sayi + " tarihin Şanlı Osmanlı ile ilgisi yok!";
	break;
}

out.println(mesaj);
%>

<h3>while</h3>
<%
int i = 3;
while(i > 0){
	out.print(i + "F.S.M");
	i--;
}
%>

<h3>do - while</h3>
<%
int a = -4;
do{
	out.print(a + "EN AZ 1 DEFA CALIŞIR.");
	a++;
}while(a < 0);
%>

<h3>for</h3>
<%
for(i = 3; i > 0; i-- ){
	out.print(i + "F.S.M___");
}
%>

<h3>for-each</h3>
<%
int sayiDizisi[] = {571, 622, 632, 1040, 1071, 1299, 1453};
for(int geciciDegisken : sayiDizisi){
	out.print(geciciDegisken + "  ");
}
%>

</body>
</html>