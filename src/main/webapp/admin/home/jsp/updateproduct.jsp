<%--
  Created by IntelliJ IDEA.
  User: Shimaa Shokry
  Date: 4/19/2020
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .inputTextCustom {
            width: 30%;
            /*display: block;*/
            border: none;
            border-bottom: 1px solid #999;
            padding: 6px 30px;
            font-family: Poppins;
            box-sizing: border-box;
            border-radius: 20px;
            font-size: 18px;
        }
        span{
            margin: 10px;
            margin-left: 20px ;
            font-size: 18px;
        }
        input{
            margin: 10px;
            margin-left: 20px ;
        }
    </style>
</head>
<body>
<%@include file="header.jsp" %>
<br>
<form method="post" action="updateAdminProduct">
    <div>
        <span>Product Id: </span>
        <input class="inputTextCustom" type="text" value="${selectedProduct.productId}">
        <span>Product Name: </span>
        <input class="inputTextCustom" type="text" value="${selectedProduct.productName}"><br>
        <span>Product Description: </span>
        <input class="inputTextCustom" type="text" value="${selectedProduct.description}">
        <span>Product Price: </span>
        <input class="inputTextCustom" type="text" value="${selectedProduct.price}"><br>
        <span>Product Stock: </span>
        <input class="inputTextCustom" type="text" value="${selectedProduct.stock}"><br>
        <span>Product Image: </span>
        <input class="inputTextCustom" type="text" value="${selectedProduct.image}">
        <span>Product Category: </span>
        <input class="inputTextCustom" type="text" value="${selectedProduct.category.categoryName}"><br>
        <input type="submit" class="updatebtn" value="Update">
        <a href="product.jsp" class="updatebtn">Back</a>
    </div>
</form>
</body>
</html>
