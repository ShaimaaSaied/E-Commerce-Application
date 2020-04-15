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
            font-weight: 700px;
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
    <script src="script.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <!-- Css Styles -->
    <link rel="stylesheet" href="../../../css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="../../../css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="../../../css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="../../../css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="../../../css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="../../../css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="../../../css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="../../../css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="../../../css/style.css" type="text/css">
</head>

<body>

<head>
    <br><br>
    <div class="nav-item">
        <div class="container">
            <nav class="nav-menu mobile-menu">
                <ul>
                    <li><a href="home.html">&nbsp;&nbsp;&nbsp;Home&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="./profile.html">&nbsp;&nbsp;&nbsp;Profile&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="./shopping-cart">&nbsp;&nbsp;&nbsp;Shopping cart&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="./contact.html">&nbsp;&nbsp;&nbsp;Contact&nbsp;&nbsp;&nbsp;</a></li>
                    <li><a href="./contact.html">&nbsp;&nbsp;&nbsp;About us&nbsp;&nbsp;&nbsp;</a></li>
                </ul>
            </nav>
            <!--            <div id="mobile-menu-wrap"></div>-->
        </div>
    </div>
</head>
<img src="https://www.pexels.com/photo/woman-holding-two-white-and-beige-shopping-paper-bags-in-building-974911/"
     alt="">


<form class="needs-validation" novalidate style="margin-left: 300px; width: 600px;"
      oninput='up2.setCustomValidity(up2.value != up.value ? document.getElementById("validation").innerHTML = "pasword doesnot match" : "")' >

    <div class="form-input">
        <label for="validationCustom01">User Name *</label>
        <input type="text" class="form-control" id="validationCustom01" placeholder="" required pattern="[a-zA-Z]+"/>

        <div class="valid-feedback">
            Looks good!
        </div>
        <div class="invalid-feedback">
            Please enter a username.
        </div>
    </div>

    <div class="form-input">
        <label for="validationCustom02">Email *</label>
        <input type="text" class="form-control" id="validationCustom02" placeholder="" required
               pattern="^[\w-]+(\.[\w-]+)@([a-z0-9-]+(\.[a-z0-9-]+)?\.[a-z]{2,6}|(\d{1,3}\.){3}\d{1,3})(:\d{4})?$"/>
        <div class="valid-feedback">
            Looks good!
        </div>
        <div class="invalid-feedback">
            Please enter valid email
        </div>
    </div>
    <div class="form-input">
        <label for="validationCustompassword">Password *</label>
        <input type="password" class="form-control" id="validationCustompassword" placeholder="" required
              name="up" pattern="^[a-zA-Z!@#$%-^&?_0-9]{8,40}$"/>
        <div class="valid-feedback">
            Looks good!
        </div>
        <div class="invalid-feedback">
            Please enter at least 8 character
        </div>
    </div>
    <div class="form-input">
        <label for="validationCustomConfirmpassword">Confirm Password *</label>
        <input type="password"  class="form-control" id="validationCustomConfirmpassword"
               placeholder="" required name="up2"
        <%--               pattern="^[a-zA-Z!@#$%-^&?_0-9]{8,40}$"/>--%>/>
<%--        <div class="valid-feedback">--%>

<%--        </div>--%>
        <div class="invalid-feedback" id="validation">

        </div>
    </div>
    <div class="form-input">
        <label for="validationjop">jop</label>
        <input type="text" class="form-control" id="validationjop" placeholder="">
    </div>
    <div class="form-input">
        <label for="validationCustominterists">interists</label>
        <input type="text" class="form-control" id="validationCustominterists" placeholder="
"/>

    </div>

    <button class="btn " type="submit" style="background-color: black; color: white; margin-top: 20px; ">Edit Profile
    </button>
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
