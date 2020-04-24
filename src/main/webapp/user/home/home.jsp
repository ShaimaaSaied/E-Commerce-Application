<%@ page import="org.iti.model.entity.User" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>
    <style>
        .autocomplete {
            /*the container must be positioned relative:*/
            position: relative;
            display: inline-block;
        }


        .autocomplete-items {
            position: absolute;
            border: 1px solid #d4d4d4;
            border-bottom: none;
            border-top: none;
            z-index: 99;
            /*position the autocomplete items to be the same width as the container:*/
            top: 100%;
            left: 0;
            right: 0;
        }

        .autocomplete-items div {
            padding: 10px;
            cursor: pointer;
            background-color: #fff;
            border-bottom: 1px solid #d4d4d4;
        }

        .autocomplete-items div:hover {
            /*when hovering an item:*/
            background-color: #e9e9e9;
        }

        .autocomplete-active {
            /*when navigating through the items using the arrow keys:*/
            background-color: DodgerBlue !important;
            color: #ffffff;
        }
    </style>
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!--    src/main/webapp/css/style.css-->
    <!-- Css Styles -->

    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">


    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
<!-- Page Preloder -->
<!--<div id="preloder">-->
<!--    <div class="loader"></div>-->
<!--</div>-->

<!-- Header Section Begin -->
<header class="header-section">
    <div class="header-top">
        <div class="container">
            <!-- email and phone part -->
            <div class="ht-left">
                <div class="mail-service">
                    <i class=" fa fa-envelope"></i>
                    online-shope@iti.org
                </div>
                <div class="phone-service">
                    <i class=" fa fa-phone"></i>
                    +2 010 2496 2534
                </div>
            </div>
            <!-- profile part  -->
            <div class="ht-right">
                <div>
                    <a href="/ECommerce/profile" class="profile-panel"><i class="fa fa-user"></i>
                        <% User user = (User) (request.getSession().getAttribute("currentuser"));%>
                        <%=user.getUsername() %>
                    </a>
                    <a href="/ECommerce/adminlogout" style="margin: 15px; color: #e7ab3c "><i
                            class="fa fa-fw fa-sign-out "></i> Sign Out</a>
                </div>

                <div class="lan-selector">
                    <div class="ddOutOfVision" id="countries_msddHolder"
                         style="height: 0px; overflow: hidden; position: absolute;">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="inner-header">
            <div class="row">

                <div class="col-lg-7 col-md-7">
                    <div class="advanced-search" style="width: fit-content">
                        <form autocomplete="off" class="input-group">
                            <div class="autocomplete">
                                <input type="text" placeholder="What do you need?" id="search" name="search"
                                       style="width: 400px; color: gray">
                            </div>
                            <a style="padding: 10px; background-color: #e7ab3c; margin-left: 50px; color: white; text-decoration-line: none; cursor: pointer"
                               onclick="this.href='/ECommerce/searchByName?search='+document.getElementById('search').value"><i
                                    class="ti-search" id="searchBtn"></i></a>
                            <%--                            <input type="submit"><i class="ti-search" id="searchBtn"></i>Search</input>--%>
                        </form>
                    </div>
                </div>
                <div class="col-lg-3 text-right col-md-3">
                    <ul class="nav-right">
                        <li class="cart-icon"><a href="#">
                            <i class="icon_bag_alt"></i>
                            <span>3</span>
                        </a>
                            <div class="cart-hover">
                                <div class="select-items">
                                    <table>
                                        <tbody>
                                        <tr>
                                            <td class="si-pic"><!--<img src="img/select-product-1.jpg" alt="">--></td>
                                            <td class="si-text">
                                                <div class="product-selected">
                                                    <p>$60.00 x 1</p>
                                                    <h6>Kabino Bedside Table</h6>
                                                </div>
                                            </td>
                                            <td class="si-close">
                                                <i class="ti-close"></i>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="si-pic"><!--<img src="img/select-product-2.jpg" alt="">--></td>
                                            <td class="si-text">
                                                <div class="product-selected">
                                                    <p>$60.00 x 1</p>
                                                    <h6>Kabino Bedside Table</h6>
                                                </div>
                                            </td>
                                            <td class="si-close">
                                                <i class="ti-close"></i>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="select-total">
                                    <span>total:</span>
                                    <h5>$120.00</h5>
                                </div>
                                <div class="select-button">
                                    <a href="#" class="primary-btn view-card">VIEW CARD</a>
                                    <a href="#" class="primary-btn checkout-btn">CHECK OUT</a>
                                </div>
                            </div>
                        </li>
                        <li class="cart-price">$150.00</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="nav-item">
        <div class="container">
            <nav class="nav-menu mobile-menu">
                <ul>
                    <li><a href="/ECommerce/home">&nbsp;&nbsp;&nbsp;Home&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="/ECommerce/profile">&nbsp;&nbsp;&nbsp;Profile&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="/ECommerce/GetCartProducts">&nbsp;&nbsp;&nbsp;Shopping cart&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#">&nbsp;&nbsp;&nbsp;Contact&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#">&nbsp;&nbsp;&nbsp;About us&nbsp;&nbsp;&nbsp;</a></li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<!-- Header End -->

<!-- Product Shop Section Begin -->
<section class="product-shop spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1 produts-sidebar-filter">
                <div class="filter-widget">
                    <h4 class="fw-title">Categories</h4>
                    <ul class="filter-catagories">
                        <li><a onclick="this.href='/ECommerce/searchByCategory?category=blouse'">Blouses</a></li>
                        <li><a onclick="this.href='/ECommerce/searchByCategory?category=skirts'">Skirts</a></li>
                        <li><a onclick="this.href='/ECommerce/searchByCategory?category=pantalon'">Pants</a></li>
                        <li><a onclick="this.href='/ECommerce/searchByCategory?category=shose'">Shoes</a></li>
                    </ul>
                </div>
                <hr>
                <div class="filter-widget">
                    <form method="post" action="searchByPrice">
                        <h4 class="fw-title">Price</h4>
                        <div class="filter-range-wrap">
                            <div class="range-slider">
                                <div class="price-input">
                                    <input type="number" id="min" name="min" value="0" min="0">
                                    <input type="number" id="max" name="max" value="0" min="0">
                                </div>
                            </div>
                            <!--<div class="price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"
                                 data-min="33" data-max="98">
                                <div class="ui-slider-range ui-corner-all ui-widget-header"></div>
                                <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default"></span>
                                <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default"></span>
                                </div>-->
                        </div>
                        <input type="submit" value="Filter" class="filter-btn"/>
                    </form>
                </div>

            </div>
            <div class="col-lg-9 order-1 order-lg-2">
                <div class="product-list">
                    <div id="products" class="row">

                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
</section>
<!-- Product Shop Section End -->

<!-- Partner Logo Section Begin -->
<div class="partner-logo">
    <div class="container">
    </div>
</div>
<!-- Partner Logo Section End -->

<!-- Footer Section Begin -->
<footer class="footer-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="footer-left">
                    <ul>
                        <li>Address: Desert road - Smart village - iti
                            <i style="color: red" class="fa fa-heart-o" aria-hidden="true"></i>
                        </li>
                        <li>Phone: +2 010 2496 2534</li>
                        <li>Email: online-shope@iti.org</li>
                    </ul>
                    <div class="footer-social">
                        <a><i class="fa fa-facebook"></i></a>
                        <a><i class="fa fa-instagram"></i></a>
                        <a><i class="fa fa-twitter"></i></a>
                        <a><i class="fa fa-pinterest"></i></a>
                    </div>
                </div>
            </div>
            <div class="col-lg-2 offset-lg-1">
                <div class="footer-widget">
                    <h5>About us</h5>
                    <ul>
                        <li style="color: white">Mariam</li>
                        <li style="color: white">Sara</li>
                        <li style="color: white">Shaimaa Shokry</li>
                        <li style="color: white">shaimaa Saied</li>
                        <li style="color: white">Radwa</li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-2">
                <div class="footer-widget">
                    <h5>My Account</h5>
                    <ul>
                        <li><a href="/ECommerce/profile">My Account</a></li>
                        <li><a href="/ECommerce/GetCartProducts">Shopping Cart</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>


    <div class="copyright-reserved">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="copyright-text">pro
                        Copyright &copy;<script>
                            document.write(new Date().getFullYear());

                        </script>
                        All rights reserved | This Application is made with
                        <i class="fa fa-heart-o" aria-hidden="true">

                        </i> by <a href="https://colorlib.com" target="_blank">ITI-java-developers</a>
                    </div>
                    <div class="payment-pic">
                        <!--<img src="img/payment-method.png" alt="">-->
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%--    _______________________--%>

</footer>
<!-- Footer Section End -->


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

<script src=http://code.jquery.com/jquery-latest.min.js></script>


<script src="user/home/home.js"></script>
<script src="user/home/viewSuggestions.js"></script>
<%--<script src="user/home/search.js"></script>--%>

</body>

</html>