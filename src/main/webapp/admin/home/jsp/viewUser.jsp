<%--
  Created by IntelliJ IDEA.
  User: Shimaa Shokry
  Date: 4/19/2020
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            border: 1px solid #777;
            width: 100%;
        }

        td {
            text-align: left;
            padding-left: 12px;
            padding-right: 12px;
            padding-top: 16px;
            padding-bottom: 16px;
            font-size: 15px;
            font-weight: 500;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2
        }

        th {
            text-align: left;
            padding: 7px;
            background-color: #e7ab3c;
            color: white;
            font-size: 17px;
        }

        .rolebtn {
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 15px;
            cursor: pointer;
            border-radius: 3px;
        }

        /* Darker background on mouse-over */
        .rolebtn:hover {
            background-color: black;
        }
        .viewbtn {
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 15px;
            cursor: pointer;
            border-radius: 3px;
        }

        /* Darker background on mouse-over */
        .viewbtn:hover {
            background-color: black;
        }
        a{
            margin: 10px;
            text-decoration-line: none;
        }

    </style>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<%@include file="header.jsp" %>

<h1 style="text-align: center">Users Records</h1>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>User Email</th>
        <th>User Password</th>
        <th>User Jop</th>
        <th>Credit Limit</th>
        <th>User Address</th>
        <th>Role</th>
        <th>Admin Role</th>
        <th>View Profile</th>
    </tr>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${empty requestScope.allUsersAdmin}">
            <c:out value="List is empty"></c:out>
        </c:when>
        <c:otherwise>
            <c:forEach items="${requestScope.allUsersAdmin}" var="user">
                <tr>
                    <td><c:out value="${user.userId}"></c:out></td>
                    <td><c:out value="${user.username}"></c:out></td>
                    <td><c:out value="${user.email}"></c:out></td>
                    <td><c:out value="${user.password}"></c:out></td>
                    <td><c:out value="${user.jop}"></c:out></td>
                    <td><c:out value="${user.creditLimit}"></c:out></td>
                    <td><c:out value="${user.address}"></c:out></td>
                    <td><c:out value="${user.role}"></c:out> </td>
                    <td><a href="adminRole?id=${user.userId}" class="rolebtn">Set Role</a></td>
                    <td><a href="adminUserProfile?id=${user.userId}" class="viewbtn">View Profile</a></td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
    </tbody>
</table>
</body>
</html>
