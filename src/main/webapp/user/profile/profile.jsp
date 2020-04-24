<!DOCTYPE html>
<html lang="zxx">

<head>
    <title>Title</title>
    <style>


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

        .form-group {
        / margin-left: 300 px;
        / / width: 600 px;
        / border: 1 px solid #ebebeb;
            padding: 5px 5px;
            border-radius: 10px;
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
                    <li><a href="/ECommerce/home">&nbsp;&nbsp;&nbsp;Home&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="/ECommerce/profile">&nbsp;&nbsp;&nbsp;Profile&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="GetCartProducts">&nbsp;&nbsp;&nbsp;Shopping cart&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#">&nbsp;&nbsp;&nbsp;Contact&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="#">&nbsp;&nbsp;&nbsp;About us&nbsp;&nbsp;&nbsp;</a></li>
                </ul>
            </nav>
            <!--            <div id="mobile-menu-wrap"></div>-->
        </div>
    </div>
</head>
<img src="https://www.pexels.com/photo/woman-holding-two-white-and-beige-shopping-paper-bags-in-building-974911/"
     alt="">




<form class="needs-validation" novalidate style="margin-left: 300px; width: 600px;" action="/ECommerce/profile" method="post"
      oninput='up2.setCustomValidity(up2.value != up.value ? document.getElementById("validation").innerHTML = "pasword doesnot match" : "")' >

    <div class="form-input">
        <label for="validationCustomName">User Name *</label>
        <input name="validationCustomName" type="text" class="form-control" id="validationCustomName" placeholder="" required pattern="[a-zA-Z]+"
        value="${sessionScope.currentuser.username}"  />


        <div class="valid-feedback">
            Looks good!
        </div>
        <div class="invalid-feedback">
            Please enter a username.
        </div>
    </div>

    <div class="form-input">
        <label for="validationCustomEmail">Email *</label>
        <input name="validationCustomEmail" type="text" class="form-control" id="validationCustomEmail" placeholder="" required
               pattern="^[\w-]+(\.[\w-]+)@([a-z0-9-]+(\.[a-z0-9-]+)?\.[a-z]{2,6}|(\d{1,3}\.){3}\d{1,3})(:\d{4})?$"
               value="${sessionScope.currentuser.email}"/>
        <div class="valid-feedback">
            Looks good!
        </div>
        <div class="invalid-feedback">
            Please enter valid email
        </div>
    </div>

    <div class="form-input">
        <label for="validationCustompassword">Password *</label>
        <input name="validationCustompassword" type="password" class="form-control" id="validationCustompassword" placeholder="" required
              name="up" pattern="^[a-zA-Z!@#$%-^&?_0-9]{8,40}$"
               value="${sessionScope.currentuser.password}"/>
        <div class="valid-feedback">
            Looks good!
        </div>
        <div class="invalid-feedback">
            Please enter at least 8 character
        </div>
    </div>
    <div class="form-input">
        <label for="validationCustomConfirmpassword">Confirm Password *</label>
        <input name="validationCustomConfirmpassword" type="password"  class="form-control" id="validationCustomConfirmpassword"
               placeholder="" required name="up2"
               value="${sessionScope.currentuser.password}"/>
        <div class="invalid-feedback" id="validation">

        </div>
    </div>
    <div class="form-input">
        <label for="validationCredit">Credit Limit</label>
        <input name="validationCredit" type="number" class="form-control" id="validationCredit" placeholder=""
               value="${sessionScope.currentuser.creditLimit}"/>
    </div>
    <div class="form-input">
        <label for="validationCustomAddress">address</label>
        <input name="validationCustomAddress" type="text" class="form-control" id="validationCustomAddress" placeholder=""
               value="${sessionScope.currentuser.address}"/>

    </div>

    <button class="btn " type="submit" style="background-color: black; color: white; margin-top: 20px; ">Edit Profile
    </button>
    <c:if test="${!empty requestScope.message}">
        <p style=" color: white; float: right;  display: inline-block; background-color: #e7ab3c">${requestScope.message}</p>
    </c:if>
</form>

<script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (function () {
        'use strict';
        window.addEventListener('load', function () {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function (form) {
                form.addEventListener('submit', function (event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();


    // function validatePassword() {
    //     var password = document.getElementById("validationCustompassword"),
    //         confirm_password = document.getElementById("validationCustomConfirmpassword");
    //     console.log(password);
    //     console.log(confirm_password);
    //     if (password.value != confirm_password.value) {
    //         document.getElementById("validation").innerHTML = "pasword doesnot match";
    //     } else {
    //         document.getElementById("validation").innerHTML = "";
    //     }
    // }


</script>
</body>
</html>
