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

    <link rel="stylesheet" href="../../css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="../../css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="../../css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="../../css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="../../css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="../../css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="../../css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="../../css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="../../css/style.css" type="text/css">
</head>

<body>

<form class="needs-validation" novalidate style="margin-left: 300px; width: 600px;" action="/ECommerce/product" method="post">
<%--    oninput='up2.setCustomValidity(up2.value != up.value ? document.getElementById("validation").innerHTML = "pasword doesnot match" : "")' >--%>

    <div class="form-input">
        <label for="product">Product Name *</label>
        <input type="text" class="form-control" id="product" placeholder="" required pattern="[a-zA-Z]+"
                 />
        <div class="valid-feedback">
            Looks good!
        </div>
        <div class="invalid-feedback">
            Please enter a username.
        </div>
    </div>

    <div class="form-input">
        <label for="description">Description</label>
        <input type="text" class="form-control" id="Description" placeholder="" required/>
    </div>

    <div class="form-input">
        <label for="price">Price *</label>
        <input id="price" name="peice" type="number" min="0" class="input" required>
    </div>

    <div class="form-input">
        <label for="stock">Confirm Password *</label>
        <input id="stock" name="peice" type="number" min="0" class="input" required>
    </div>

    <div class="form-input">
        <label for="image">image</label>
        <input type="text" class="form-control" id="image" placeholder=""
              />
    </div>

    <button class="btn " type="submit" style="background-color: black; color: white; margin-top: 20px; ">add product
    </button>
</form>

</body>
</html>
