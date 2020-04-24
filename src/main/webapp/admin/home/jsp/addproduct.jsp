
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .inputTextCustom {
            width: 30%;
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
            background-color: #000000   ;
        }

        .backbtn{
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 3px;
        }
        .backbtn:hover{
            background-color: black;
        }
    </style>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<%@include file="header.jsp" %>
<br>
<div class="col-sm-8">
    <div class="product-information"><!--/product-information-->
        <form action="/ECommerce/addAdminProduct" method="post" enctype="multipart/form-data">
            <div>
                <span>Product Name       </span>
                <input class="inputTextCustom" type="text" name="ProductName" id="ProductName" required/>

                <span>Product Price      </span>
                <input class="inputTextCustom" type="number"  name="ProductPrice" id="ProductPrice" required/><br>

                <span>Product Stock      </span>
                <input    class="inputTextCustom" type="number" name="ProductStock" id="ProductStock" required/>

                <span>Product Image      </span>
                <input class="inputTextCustom" type="text"  name="ProductImage" id="ProductImage" required/><br>

                <span>Product Category Id</span>
                <input class="inputTextCustom" type="number"  name="ProductCategory" id="ProductCategory" required/>

                <span>Product Description</span>
                <textarea class="inputTextCustom"  name="ProductDescription"></textarea>
                <br>
                <br>
                <input class="updatebtn" type="submit" value="Add Product">

                <a href="/ECommerce/adminproduct" class="backbtn">Back</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>