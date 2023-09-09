<%@ page import="me.aungmyatmoe.servlet.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="layout/header.jsp" %>
<%
    var name = request.getAttribute("name").toString();
%>

Hello <%= name %>

<%
    var users = (ArrayList<User>) session.getAttribute("users");
%>

<% for (var user : users) { %>
<p><%= user.getId() %> - <%= user.getName() %>
</p>
<% } %>

<hr>


<%= session.getAttribute("name") %>


<%@ include file="layout/footer.jsp" %>