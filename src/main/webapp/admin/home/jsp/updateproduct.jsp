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
        .updatebtn {
            background-color: #ffc107;
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

        .backbtn{
            background-color: #ffc107;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 3px;
        }
        .backbtn:hover{
            background-color: gray;
        }
    </style>
</head>
<body>
<%@include file="header.jsp" %>
<br>
<form method="post" action="/ECommerce/updateAdminProduct" enctype="multipart/form-data">
    <div>
        <input id="id" name="id" style="margin-left: 20px" class="inputTextCustom" type="hidden" value="${selectedProduct.productId}">
        <span>Product Name: </span>
        <input id="pname" name="pname" class="inputTextCustom" type="text" value="${selectedProduct.productName}">
        <span>Product Description: </span>
        <input id="pdescription" class="inputTextCustom" type="text" value="${selectedProduct.description}"><br>
        <span>Product Price: </span>
        <input id="pprice" name="price" style="margin-left: 20px" class="inputTextCustom" type="number" value="${selectedProduct.price}">
        <span>Product Stock No: </span>
        <input id="pstock" name="stock" class="inputTextCustom" type="number" value="${selectedProduct.stock}"><br>
        <span>Product Image: </span>
        <input id="pimage" class="inputTextCustom" type="text" value="${selectedProduct.image}">
        <span>Product Category Id: </span>
        <input id="pcategory" style="margin-left: 20px" class="inputTextCustom" type="number" value="${selectedProduct.category.categoryId}"><br>
        <input type="submit" class="updatebtn" value="Update">
        <a href="/ECommerce/adminproduct" class="backbtn">Back</a>
    </div>
</form>
</body>
</html>
