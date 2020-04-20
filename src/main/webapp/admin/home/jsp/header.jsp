<%--
  Created by IntelliJ IDEA.
  User: Shimaa Shokry
  Date: 4/19/2020
  Time: 9:57 AM
  To change this template use  File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: Helvetica;
            background: #f8f8f8;
        }

        .header {
            overflow: hidden;
            background-color: #e6e6e6;
        }

        .header a {
            float: left;
            color: black;
            text-align: center;
            padding: 12px;
            text-decoration: none;
            font-size: 18px;
            line-height: 25px;
            border-radius: 4px;
            margin-right: 20px;
            margin-top: 20px;
            margin-bottom: 20px;
        }

        .header a:hover {
            background-color: #ddd;
            color: black;
        }

        .header a.active {
            background-color: #ffc107;
            color: white;
        }

        .header-right {
            float: right;
        }


        @media screen and (max-width: 500px) {
            .header a {
                float: none;
                display: block;
                text-align: left;
            }

            .header-right {
                float: none;
            }

            .logo{
                border-radius: 45%;
                margin-left:  30px;
                padding: 0;
                float: left;
                height: 100px;
            }
        }
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="header">
    <div class="header-right">
        <a href="/ECommerce/adminhome" class="active"><i class="fa fa-fw fa-home"></i> Home</a>
<%--        <a href="#services"><i class="fa fa-fw fa-cog"></i> Add Admin</a>--%>
        <a href="/ECommerce/adminUsers"><i class="fa fa-fw fa-user"></i> View Clients</a>
        <a href="/ECommerce/adminproduct"><i class="fa fa-fw fa-product-hunt"></i> Add Product</a>
        <a href="#contact"><i class="fa fa-fw fa-sign-out "></i> Sign Out</a>
    </div>
</div>
</body>
</html>