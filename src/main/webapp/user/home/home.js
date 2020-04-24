var request = null;

function getAllProducts() {
    if (window.XMLHttpRequest)
        request = new XMLHttpRequest();
    else if (window.ActiveXObject)
        request = new ActiveXObject(Microsoft.XMLHTTP);

    request.onreadystatechange = handleRequest;
    request.open("GET", "getAllProducts", true);
    request.send(null);
}

var jsonList;

function handleRequest() {
    if (request.readyState == 4 && request.status == 200) {
        console.log(jsonList);
        jsonList = JSON.parse(request.responseText);
        console.log(jsonList);
        viewProducts();
    }
}

function viewProducts() {
    console.log("in viewProducts");
    $("#products").empty();
    $.each(jsonList, function (index, product) {
        $("#products").append("<div class='col-lg-4 col-sm-6'>\n" +
            "                            <div class='product-item'>\n" +
            "                                <div class='pi-pic' >\n" +
            "                                   <div  id='productid'+product[4]>" + product[4] + "</div>" +
            "                                    <img src=" + product[3] + " alt='picture'>\n" +
            "                                    <ul>\n" +
            "                                        <li class='w-icon active'>" +
            "                                           <form  action='AddProductToCart?id=" + product[4] + "' method='post'>" +
            "                                               <input  type='submit' value='Add to cart' id='addToCartBtn?id=" + product[4] + "' class='btn btn-warning'> " +
            "                                                 </input></form></li>\n" +
            "                                    </ul>\n" +
            "                                </div>\n" +
            "                                <div class='pi-text'>\n" +
            "                                    <h5 id='product_name'>" + product[0] + "</h5>\n" +
            "                                    <div class='product-price'>\n" +
            "                                        " + product[1] + " LE\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                            </div>"
        );
    });
}


$(document).ready(function () {
    // setInterval(getAllProducts,2000)
    getAllProducts();
});

// $("#addToCartBtn").click(function () {
//     function cart(x) {
//         var productid = document.getElementById("productid" + x).innerHTML;
//         console.log("productid : " + productid);
//         $.post("AddProductToCart", {"productid": productid}, ajaxCallBackAddProductToCart);
//     }
//
//     function ajaxCallBackAddProductToCart() {
//         alert("ajaxCallBackAddProductToCart");
//     }
// });