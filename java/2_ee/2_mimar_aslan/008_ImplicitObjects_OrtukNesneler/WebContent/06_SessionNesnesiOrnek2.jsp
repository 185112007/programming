<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	Session(Oturum) id degerimiz: <%= session.getId() %>
	
	<%
		if(session.getAttribute("ziyaretsayimiz") != null){
			int sayac = Integer.parseInt((String)session.getAttribute("ziyaretsayimiz"));
			sayac++;
			out.println("Bu Session(oturum) is ile JSP sayfamızı " + sayac + " defa ziyaret ettiniz.");
			session.setAttribute("ziyaretsayimiz", String.valueOf(sayac));
		}else{
			session.setAttribute("ziyaretsayimiz", "1");
			out.println("Bu JSP sayfamıza ilk ziyaretiniz.");
		}
	%>
		
</body>
</html>