<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
<%
    var name = request.getAttribute("name").toString();
%>

Hello <%= name %>
</body>
</html>
