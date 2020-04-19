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
            font-size: 20px;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2
        }

        th {
            background-color: #e7ab3c;
            color: white;
        }

        .deletebtn {
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 3px;
        }

        /* Darker background on mouse-over */
        .deletebtn:hover {
            background-color: red;
        }
        .updatebtn {
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 3px;
        }

        /* Darker background on mouse-over */
        .updatebtn:hover {
            background-color: #00cc00   ;
        }
    </style>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<%@include file="header.jsp" %>
<h1 style="text-align: center">Product Records</h1>
<table class="table">
    <thead>
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Product Description</th>
        <th>Product Price</th>
        <th>Product Stock</th>
        <th>Product Image</th>
        <th>Delete Option</th>
        <th>Edit Option</th>
    </tr>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${empty requestScope.listOfProduct}">
            <c:out value="List is empty"></c:out>
        </c:when>
        <c:otherwise>
            <c:forEach items="${requestScope.listOfProduct}" var="product">
                <tr>
                    <td><c:out value="${product.productId}"></c:out></td>
                    <td><c:out value="${product.productName}"></c:out></td>
                    <td><c:out value="${product.description}"></c:out></td>
                    <td><c:out value="${product.price}"></c:out></td>
                    <td><c:out value="${product.stock}"></c:out></td>
                    <td><c:out value="${product.image}"></c:out></td>
                    <td><a href="deleteProduct?id=${product.productId}" class="deletebtn"></a>
                    </td>
                    <td><a href="updateAdminProduct?id=${product.productId}" class="updatebtn">Edit</a>
                    </td>
                </tr>

            </c:forEach>
        </c:otherwise>
    </c:choose>
    </tbody>
</table>
</body>
</html>
