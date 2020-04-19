<%@ page import="org.iti.model.entity.User" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Shopping Cart</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

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
</head>

<body>
<!--    &lt;!&ndash; Page Preloder &ndash;&gt;-->
<!--    <div id="preloder">-->
<!--        <div class="loader"></div>-->
<!--    </div>-->

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
                <a href="#" class="profile-panel"><i class="fa fa-user"></i>
                    <% User user = (User) (request.getSession().getAttribute("currentuser"));%>
                    <%=user.getUsername() %>
                </a>
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


                <!--                <div class="col-lg-7 col-md-7">-->
                <!--                    <div class="advanced-search">-->
                <!--                        <form action="#" class="input-group">-->
                <!--                            <input type="text" placeholder="What do you need?">-->
                <!--                            <button type="button"><i class="ti-search"></i></button>-->
                <!--                        </form>-->
                <!--                    </div>-->
                <!--                </div>-->
                <div class="col-lg-3 text-right col-md-3">
                    <ul class="nav-right">
                        <li class="cart-icon"><a href="#">
                            <!--                            <i class="icon_bag_alt"></i>-->
                            <!--                            <span>3</span>-->
                        </a>
                            <div class="cart-hover">
                                <div class="select-items">
                                    <table>
                                        <tbody>
                                        <tr>
                                            <td class="si-pic"><img src="images/select-product-1.jpg" alt=""></td>
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
                                            <td class="si-pic"><img src="img/select-product-2.jpg" alt=""></td>
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
                        <!--                        <li class="cart-price">$150.00</li>-->
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
                    <li><a href="/ECommerce/cart">&nbsp;&nbsp;&nbsp;Shopping cart&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#">&nbsp;&nbsp;&nbsp;Contact&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#">&nbsp;&nbsp;&nbsp;About us&nbsp;&nbsp;&nbsp;</a></li>
                </ul>
            </nav>
            <!--            <div id="mobile-menu-wrap"></div>-->
        </div>
    </div>
</header>
<!-- Header End -->

<!-- Breadcrumb Section Begin -->
<!--<div class="breacrumb-section">-->
<!--    <div class="container">-->
<!--        <div class="row">-->
<!--            <div class="col-lg-12">-->
<!--                <div class="breadcrumb-text product-more">-->
<!--                    <a href="./home.jsp"><i class="fa fa-home"></i> Home</a>-->
<!--                    <a href="./shop.html">Shop</a>-->
<!--                    <span>Shopping Cart</span>-->
<!--                </div>-->
<!--            </div>-->
<!--        </div>-->
<!--    </div>-->
<!--</div>-->
<!-- Breadcrumb Section Begin -->

<!-- Shopping Cart Section Begin -->
<section class="shopping-cart spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="cart-table">
                    <table>
                        <thead>
                        <tr>
                            <th>Image</th>
                            <th class="p-name">Product Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            <th><i class="ti-close"></i></th>
                        </tr>
                        </thead>
                        <tbody id="tableProductCart">
                        <%--                        <tr>--%>
                        <%--                            <td class="cart-pic first-row"><img src="images/cart-page/product-1.jpg" alt=""></td>--%>
                        <%--                            <td class="cart-title first-row">--%>
                        <%--                                <h5>Pure Pineapple</h5>--%>
                        <%--                            </td>--%>
                        <%--                            <td class="p-price first-row">$60.00</td>--%>
                        <%--                            <td class="qua-col first-row">--%>
                        <%--                                <div class="quantity">--%>
                        <%--                                    <div class="pro-qty">--%>
                        <%--                                        <input type="text" value="1">--%>
                        <%--                                    </div>--%>
                        <%--                                </div>--%>
                        <%--                            </td>--%>
                        <%--                            <td class="total-price first-row">$60.00</td>--%>
                        <%--                            <td class="close-td first-row"><i class="ti-close"></i></td>--%>
                        <%--                        </tr>--%>
                        <%--                        <tr>--%>
                        <%--                            <td class="cart-pic"><img src="images/cart-page/product-2.jpg" alt=""></td>--%>
                        <%--                            <td class="cart-title">--%>
                        <%--                                <h5>American lobster</h5>--%>
                        <%--                            </td>--%>
                        <%--                            <td class="p-price">$60.00</td>--%>
                        <%--                            <td class="qua-col">--%>
                        <%--                                <div class="quantity">--%>
                        <%--                                    <div class="pro-qty">--%>
                        <%--                                        <input type="text" value="1">--%>
                        <%--                                    </div>--%>
                        <%--                                </div>--%>
                        <%--                            </td>--%>
                        <%--                            <td class="total-price">$60.00</td>--%>
                        <%--                            <td class="close-td"><i class="ti-close"></i></td>--%>
                        <%--                        </tr>--%>
                        <%--                        <tr>--%>
                        <%--                            <td class="cart-pic"><img src="images/cart-page/product-3.jpg" alt=""></td>--%>
                        <%--                            <td class="cart-title">--%>
                        <%--                                <h5>Guangzhou sweater</h5>--%>
                        <%--                            </td>--%>
                        <%--                            <td class="p-price">$60.00</td>--%>
                        <%--                            <td class="qua-col">--%>
                        <%--                                <div class="quantity">--%>
                        <%--                                    <div class="pro-qty">--%>
                        <%--                                        <input type="text" value="1">--%>
                        <%--                                    </div>--%>
                        <%--                                </div>--%>
                        <%--                            </td>--%>
                        <%--                            <td class="total-price">$60.00</td>--%>
                        <%--                            <td class="close-td"><i class="ti-close"></i></td>--%>
                        <%--                        </tr>--%>
                        </tbody>
                    </table>
                </div>
                <div class="row">
                    <!--                    <div class="col-lg-4">-->
                    <!--                    <div class="col-lg-4">-->
                    <!--                        <div class="cart-buttons">-->
                    <!--                            <a href="#" class="primary-btn continue-shop">Continue shopping</a>-->
                    <!--                            <a href="#" class="primary-btn up-cart">Update cart</a>-->
                    <!--                        </div>-->
                    <!--                        <div class="discount-coupon">-->
                    <!--                            <h6>Discount Codes</h6>-->
                    <!--                            <form action="#" class="coupon-form">-->
                    <!--                                <input type="text" placeholder="Enter your codes">-->
                    <!--                                <button type="submit" class="site-btn coupon-btn">Apply</button>-->
                    <!--                            </form>-->
                    <!--                        </div>-->
                    <!--                    </div>-->
                    <div class="col-lg-4 offset-lg-4">
                        <div class="proceed-checkout">
                            <ul>
                                <li class="subtotal">Subtotal <span>$240.00</span></li>
                                <li class="cart-total">Total <span>$240.00</span></li>
                            </ul>
                            <a href="#" class="proceed-btn">PROCEED TO CHECK OUT</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Shopping Cart Section End -->

<!-- Partner Logo Section Begin -->
<div class="partner-logo">
    <div class="container">
    </div>
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
                    <h5>Information</h5>
                    <ul>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Complaint</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-2">
                <div class="footer-widget">
                    <h5>My Account</h5>
                    <ul>
                        <li><a href="#">My Account</a></li>
                        <li><a href="#">Shopping Cart</a></li>
                    </ul>
                </div>
            </div>
            <!--
                        <div class="col-lg-4">
                            <div class="newslatter-item">
                                <h5>Get Latest Updates </h5>
                                <p>Get E-mail updates about our latest shop and special offers.</p>
                                <form action="#" class="subscribe-form">
                                    <input type="text" placeholder="Enter Your Mail">
                                    <button type="button">Subscribe</button>
                                </form>
                            </div>
                        </div>
            -->
        </div>
    </div>
    <div class="copyright-reserved">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="copyright-text">
                        Copyright &copy;<script>document.write(new Date().getFullYear());</script>
                        All rights reserved | This Application is made with
                        <i class="fa fa-heart-o" aria-hidden="true">

                        </i> by <a href="https://colorlib.com" target="_blank">ITI-java-developers</a>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </div>
                    <div class="payment-pic">
                        <img src="images/payment-method.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<!-- Footer Section End -->

<!-- Js Plugins -->
<%--<script src="js/jquery-3.3.1.min.js"></script>--%>
<%--<script src="js/bootstrap.min.js"></script>--%>
<%--<script src="js/jquery-ui.min.js"></script>--%>
<%--<script src="js/jquery.countdown.min.js"></script>--%>
<%--<script src="js/jquery.nice-select.min.js"></script>--%>
<%--<script src="js/jquery.zoom.min.js"></script>--%>
<%--<script src="js/jquery.dd.min.js"></script>--%>
<%--<script src="js/jquery.slicknav.js"></script>--%>
<%--<script src="js/owl.carousel.min.js"></script>--%>
<%--<script src="js/main.js"></script>--%>

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
<script src="user/cart/cart.js"></script>


</body>

</html>