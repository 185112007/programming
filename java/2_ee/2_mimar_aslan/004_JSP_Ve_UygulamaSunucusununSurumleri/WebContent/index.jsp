<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Versiyonlar - Sürümler</title>
</head>
<body>

<!-- expression tag used here -->
Sunucu versiyonu: <%=application.getServerInfo() %>
<br>
Servlet versiyonu: <%=application.getMajorVersion() %>.<%= application.getMinorVersion() %>
<br>
JSP versiyonu: <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %>

</body>
</html>