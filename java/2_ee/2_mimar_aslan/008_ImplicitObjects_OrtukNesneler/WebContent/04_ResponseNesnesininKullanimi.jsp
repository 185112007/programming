<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response Nesnesinin Kullanımına Örnek</title>
</head>
<body>

	<%
		Cookie karabiyeNesnesi = new Cookie("testKurabiyesi", "JSP Cookie");
		/* Cookie tipinde kurabiyeNesnesi oluşturduk
		*parametremiz olan testKurabiyesi'ne H:GAFUR degerini verdik.
		*kurabiyeNesnesi bu degerle diger bir sayfaya gonderilecek
		*/
		
		karabiyeNesnesi.setMaxAge(365 * 24 * 60 * 60);
		//kurabiye nesnemize ömrünü belirledik
		
		response.addCookie(karabiyeNesnesi);
		//yanıt icin kurabiyeyi response nesnesine ekledik
		
		response.sendRedirect("04_Kurabiyemiz.jsp");
		//Kurabiyemizi artık response nesnesi yardımıyla
		//04_Kurabiyemiz.jsp sayfamıza gonderyryoruz
	%>
	

</body>
</html>