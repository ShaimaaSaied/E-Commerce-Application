<!DOCTYPE html>
<html lang="zxx">

<head>
    <title>Title</title>
    <style>

        .backbtn {
            background-color: #e7ab3c;
            border: none;
            color: white;
            padding: 12px 16px;
            font-size: 15px;
            cursor: pointer;
            border-radius: 3px;
        }

        /* Darker background on mouse-over */
        .backbtn:hover {
            background-color: black;
        }

        button:hover {
            background-color: #e7ab3c;
            padding-top: 10px;
        }

        label {
            font-weight: 700;
            font-size: 16px;
            margin-bottom: 7px;
            margin-top: 7px;
            color: #e7ab3c;
        }


    </style>
    <script src=http://code.jquery.com/jquery-latest.min.js></script>

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

<head>
    <br><br>
    <div class="nav-item">
        <div class="container">
            <nav class="nav-menu mobile-menu">
                <ul>
                    <li><a href="#" disabled="true">&nbsp;&nbsp;&nbsp;Home&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#" disabled="true">&nbsp;&nbsp;&nbsp;Profile&nbsp;&nbsp;&nbsp;</a>
                    </li>
                    <li><a href="#" disabled="true">&nbsp;&nbsp;&nbsp;Shopping cart&nbsp;&nbsp;&nbsp;</a>
                    </li>
                    <li><a href="#" disabled="true">&nbsp;&nbsp;&nbsp;Contact&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#" disabled="true">&nbsp;&nbsp;&nbsp;About us&nbsp;&nbsp;&nbsp;</a></li>
                </ul>
            </nav>
            <!--            <div id="mobile-menu-wrap"></div>-->
        </div>
    </div>
</head>
<img src="https://www.pexels.com/photo/woman-holding-two-white-and-beige-shopping-paper-bags-in-building-974911/"
     alt="">

<form class="needs-validation" novalidate style="margin-left: 300px; width: 600px;" action="/ECommerce/profile"
      method="post"
      oninput='up2.setCustomValidity(up2.value != up.value ? document.getElementById("validation").innerHTML = "pasword doesnot match" : "")'>

    <div class="form-input">
        <label for="validationCustomName">User Name *</label>
        <input name="validationCustomName" type="text" class="form-control" id="validationCustomName" disabled="true"
               value="${sessionScope.selectedUser.username}"/>
    </div>
    <br>
    <div class="form-input">
        <label for="validationCustomEmail">Email *</label>
        <input name="validationCustomEmail" type="text" class="form-control" id="validationCustomEmail" disabled="true"
               value="${sessionScope.selectedUser.email}"/>
    </div>
    <br>
    <div class="form-input">
        <label for="validationCustompassword">Password *</label>
        <input name="validationCustompassword" type="password" class="form-control" id="validationCustompassword"
               disabled="true" value="${sessionScope.selectedUser.password}"/>
    </div>
    <br>
    <div class="form-input">
        <label for="validationCustomConfirmpassword">Confirm Password *</label>
        <input name="validationCustomConfirmpassword" type="password" class="form-control"
               id="validationCustomConfirmpassword"
               disabled="true" value="${sessionScope.selectedUser.password}"/>
    </div>
    <br>
    <div class="form-input">
        <label for="validationjop">jop</label>
        <input name="validationjop" type="text" class="form-control" id="validationjop" disabled="true"
               value="${sessionScope.selectedUser.jop}"/>
    </div>
    <br>
    <div class="form-input">
        <label for="validationCustomAddress">address</label>
        <input name="validationCustomAddress" type="text" class="form-control" id="validationCustomAddress"
               disabled="true"
               value="${sessionScope.selectedUser.address}"/>
    </div>
    <br>
    <a href="/ECommerce/adminUsers" class="backbtn">Back</a>

</form>
</body>
</html>
