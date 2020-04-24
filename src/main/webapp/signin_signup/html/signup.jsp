<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <link rel="stylesheet" href="signin_signup/css/SigninSignUp.css">

</head>

<body>
<div class="login-wrap">
    <div class="login-html">

        <input id="tab-1" type="radio" name="tab" class="sign-in" >
        <label for="tab-1" class="tab">Sign In</label>
        <input id="tab-2" type="radio" name="tab" class="sign-up" checked>
        <label for="tab-2" class="tab">Sign Up</label>

        <div class="login-form">

            <form class="signIn-form" id="signIn-form" method="post" action="/ECommerce/login">
                <div class="sign-in-htm">

                    <div class="group ">
                        <label for="email_login" class="label">Email</label>
                        <input id="email_login" name="email" type="text" class="input" required
                               placeholder="xxx@gmail.com"
                               pattern="^[\w-]+(\.[\w-]+)@([a-z0-9-]+(\.[a-z0-9-]+)?\.[a-z]{2,6}|(\d{1,3}\.){3}\d{1,3})(:\d{4})?$">
                    </div>

                    <div class="group">
                        <label for="password_login" class="label">Password</label>
                        <input id="password_login" name="password" type="password" class="input" data-type="password"
                               required pattern="^[a-zA-Z!@#$%-^&?_0-9]{8,40}$">
                    </div>

                    <div class="group">
                        <input type="submit" class="button" value="Sign In">
                    </div>
                    <div class="hr"></div>
                    <c:if test="${!empty requestScope.message}">
                        <p>
                            <c:out value="${requestScope.message}"></c:out>
                        </p>
                    </c:if>

                </div>
            </form>

            <form action="/ECommerce/register" method="post">
                <div class="sign-up-htm">
                    <div class="group">
                        <label for="user" class="label">Username</label>
                        <input id="user" type="text" name="username" class="input" required
                               pattern="[a-zA-Z]+">
                        <div id="validateUser"></div>
                    </div>
                    <div class="group">
                        <label for="password" class="label">Password</label>
                        <input id="password" name="password" type="password" class="input" data-type="password"
                               required placeholder="at least 8 characters" pattern="^[a-zA-Z!@#$%-^&?_0-9]{8,40}$">
                    </div>
                    <div class="group">
                        <label for="confirm_password" class="label">Confirm Password</label>
                        <input id="confirm_password" type="password" class="input" data-type="password" required
                               placeholder="at least 8 characters" pattern="^[a-zA-Z!@#$%-^&?_0-9]{8,40}$">
                    </div>
                    <div class="group">
                        <label for="email" class="label">Email Address</label>
                        <input id="email" name="email" type="text" class="input" required placeholder="xx.xx@gmail.com"
                               pattern="^[\w-]+(\.[\w-]+)@([a-z0-9-]+(\.[a-z0-9-]+)?\.[a-z]{2,6}|(\d{1,3}\.){3}\d{1,3})(:\d{4})?$">
                    </div>

                    <div class="group">
                        <label for="creditLimit" class="label">Credit Limit </label>
                        <input id="creditLimit" name="creditLimit" type="number" min="0" class="input" required>
                    </div>

                    <div class="group">
                        <input type="submit" class="button" value="Sign Up">
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-1"><c:if test="${!empty requestScope.message}">
                            <p>
                                <c:out value="${requestScope.message} !"></c:out>
                            </p>
                        </c:if></label>
                    </div>
                </div>
            </form>


        </div>
    </div>
</div>
<script src=http://code.jquery.com/jquery-latest.min.js></script>
<script>
    var password = document.getElementById("password"),
        confirm_password = document.getElementById("confirm_password");

    function validatePassword() {
        if (password.value != confirm_password.value) {
            confirm_password.setCustomValidity("Passwords Don't Match");
        } else {
            confirm_password.setCustomValidity('');
        }
    }

    password.onchange = validatePassword;
    confirm_password.onkeyup = validatePassword;

    $(document).ready(function () {
        $("#user").blur(function () {
            var name = $("#user").val();
            console.log(name);
            $.post("/ECommerce/register",
                {"user": name}
                , ajaxCallBack);
        });
    });

    function ajaxCallBack(responseTxt, statusTxt, xhr) {
        if (statusTxt == "success") {
            console.log(responseTxt.data);
            console.log("******");
            if (responseTxt.data) {
                document.getElementById("validateUser").innerHTML = "User is exist"
            }
        }
    }
</script>

</body>

</html>