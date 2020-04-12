<%@ page import="org.iti.model.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 3/17/2020
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" class="org.iti.model.entity.User" scope="request"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
    System.out.println(user + "inside_processRegistration.jsp");
    request.setAttribute("user", user);
    request.getRequestDispatcher("register").forward(request, response);
%>

</body>
</html>