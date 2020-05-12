<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Nesnesi Ornek 2</title>
</head>
<body>

	<h3>
		<font face="arial" color="darkblue">
			Request Nesnesi Ornek 2 - 03_RequestNesnesineOrnek2.jsp
			<br>sayfasından requestHarici.jsp sayfasına
			<br>gonderilen bilgi: <br> 
		</font>
		
		<%
			request.setAttribute("aktarilanbilgi",
					"<br>Güzel Gören Güzel Düşünür, "
					+ "<br>Güzel Düşünen"
					+ "<br>Hayatından Lezzet Alır");
		%>
	</h3>
	
	<hr>
	
	<h3>
		<jsp:include page="03_RequestHariciSayfa.jsp"></jsp:include>
	</h3>

</body>
</html>