<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaBeans Formunu Alan Form</title>
</head>
<body>

	<jsp:useBean id="jb" 
		         type="com.yazilimvideo._01_BizimSinifimiz" 
		         class="com.yazilimvideo._01_BizimSinifimiz"
		         scope="session">
	</jsp:useBean>
	<jsp:setProperty property="*" name="jb"/>
	
	<h3>JavaBeans Formunu Alan Form</h3>
	
	<a href="01_JavaBeansFormunuGoster.jsp">JavaBeans Formunu Göstermek için Tıklayınız</a>
</body>
</html>