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
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<%@include file="header.jsp" %>
</div>
<div class="col-sm-8">
    <div class="product-information"><!--/product-information-->
        <form action="/ECommerce/addAdminProduct" method="post" enctype="multipart/form-data">
            <h2>Product</h2>
            <label>Product Name</label>
            <input type="text" placeholder="Product Name" name="ProductName" id="ProductName" required/><br>
            <label>Product Price</label>
            <input type="number" placeholder="Product Price" name="ProductPrice" id="ProductPrice" required/><br>
            <label>Product Stock</label>
            <input type="number" placeholder="Product Stock" name="ProductStock" id="ProductStock" required/><br>
            <label>Product Image</label>
            <input type="text" placeholder="Product Image" name="ProductImage" id="ProductImage" required/><br>
            <label>Product Category Id</label>
            <input type="number" placeholder="Product Category Id" name="ProductCategory" id="ProductCategory" required/><br>
            <label>Product Description</label>
            <textarea placeholder="Product Description" name="ProductDescription"></textarea>
            <input type="submit" value="Add Product">
            <a href="product.jsp">Back</a>
        </form>
    </div>
</div>
</div>

</body>
</html>