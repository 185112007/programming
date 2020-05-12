<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kurabiyemiz</title>
</head>
<body>

	<%
		Cookie[] kurabiyeler = request.getCookies();
		//Cookie tipinde kurabiyeler dizi degiskenini tanımladık
		//04_ResponseNesnesininKullanimi.jsp sayfasından gelen kurabiye alındı
		
		for(int i=0; i<kurabiyeler.length; i++){
			if(kurabiyeler[i].getName().equalsIgnoreCase("testKurabiyesi")){
				out.println("Gelen Cookie(Kurabiye) Degerimiz:"
						+ kurabiyeler[i].getValue());
			}
		}
		//gelen kurabiyeler for döngüsüne sokularak yazdırılır
	%>

</body>
</html>