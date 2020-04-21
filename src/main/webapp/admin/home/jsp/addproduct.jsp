<%--
  Created by IntelliJ IDEA.
  User: SARA
  Date: 4/19/2020
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .body {
            font-family: Helvetica;
        }

        .inputTextCustom {
            width: 30%;
            border: none;
            border-bottom: 1px solid #999;
            padding: 6px 30px;
            font-family: Poppins;
            box-sizing: border-box;
            border-radius: 20px;
            font-size: 18px;
            font-family: Helvetica;
        }

        span {
            margin: 10px;
            margin-left: 20px;
            font-size: 18px;
            font-family: Helvetica;
        }

        input {
            margin: 10px;
            margin-left: 20px;
        }

        .updatebtn {
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 3px;
            text-decoration-line: none;
        }

        /* Darker background on mouse-over */
        .updatebtn:hover {
            background-color: #000000;
        }

        .backbtn {
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 3px;
            text-decoration-line: none;
        }

        .backbtn:hover {
            background-color: black;
        }
    </style>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<%@include file="header.jsp" %>
<br>
</div>
<div class="col-sm-8">
    <div class="product-information"><!--/product-information-->
        <form action="/ECommerce/addAdminProduct" method="post" enctype="multipart/form-data">
            <div>
                <label>Product Name</label>
                <input style="margin-left: 20px" class="inputTextCustom" type="text" name="ProductName" id="ProductName"
                       required/><br>

                <label>Product Price</label>
                <input class="inputTextCustom" type="number" name="ProductPrice" id="ProductPrice" required/><br>

                <label>Product Stock</label>
                <input class="inputTextCustom" type="number" name="ProductStock" id="ProductStock" required/><br>

                <label>Product Image</label>
                <input style="margin-left: 20px" class="inputTextCustom" type="text" name="ProductImage"
                       id="ProductImage" required/><br>

                <label>Product Category Id</label>
                <input class="inputTextCustom" type="number" name="ProductCategory" id="ProductCategory" required/><br>

                <label>Product Description</label>
                <textarea style="margin-left: 20px" class="inputTextCustom" name="ProductDescription"></textarea>
                <input class="updatebtn" type="submit" value="Add Product">

                <a href="/ECommerce/adminproduct" class="backbtn">Back</a>
            </div>
        </form>
    </div>
</div>
</div>

</body>
</html>