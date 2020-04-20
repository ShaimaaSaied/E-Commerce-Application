$(document).ready(function () {
    VeiwProductInCart();
});

var VeiwProductInCartRequest = null;

function VeiwProductInCart() {
    if (window.XMLHttpRequest)
        VeiwProductInCartRequest = new XMLHttpRequest();
    else if (window.ActiveXObject)
        VeiwProductInCartRequest = new ActiveXObject(Microsoft.XMLHTTP);

    VeiwProductInCartRequest.onreadystatechange = handleVeiwProductInCart;
    VeiwProductInCartRequest.open("GET", "getAllProductsFromCart", true);
    VeiwProductInCartRequest.send(null);
}


var jsonListProductInCart;

function handleVeiwProductInCart() {

    if (VeiwProductInCartRequest.readyState == 4 && VeiwProductInCartRequest.status == 200) {
        console.log(jsonListProductInCart);
        jsonListProductInCart = JSON.parse(VeiwProductInCartRequest.responseText);
        console.log(jsonListProductInCart);
        viewCartProduct();
    }
}

function viewCartProduct() {

    console.log("in viewProductsCart");
    $("#tableProductCart").empty();
    $.each(jsonList, function (index, product) {
        $("#tableProductCart").append("  <tr>\n" +
            "                            <td class=\"cart-pic first-row\"><img src=" + product[3] + " alt=\"\"></td>\n" +
            "                            <td class=\"cart-title first-row\">\n" +
            "                                <h5>product.productName</h5>\n" +
            "                            </td>\n" +
            "                            <td class=\"p-price first-row\"> " + product[1] + " LE</td>\n" +
            "                            <td class=\"qua-col first-row\">\n" +
            "                                <div class=\"quantity\">\n" +
            "                                    <div class=\"pro-qty\">\n" +
            "                                        <input type=\"text\" value=\"" + "hhhhhh" + "\">\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                            </td>\n" +
            "                            <td class=\"total-price first-row\">" + product.price + "</td>\n" +
            "                            <td class=\"close-td first-row\"><i class=\"ti-close\"></i></td>\n" +
            "                        </tr>"
        );
    });
}
