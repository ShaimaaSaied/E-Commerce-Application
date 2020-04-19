$(document).ready(function () {

    $("#searchBtn").click(function () {
        var name = $("#search").val();
        $.post("searchProducts", {"name": name}, ajaxCallBack);

    });
});

function ajaxCallBack(responseTxt, statusTxt, xhr) {
    alert("outside");
    if (statusTxt == "success") {
        alert("inside");
        $.ajax({
            url: 'searchProducts',
            type: 'GET',
            dataType: 'json',
            success: function (data) {
                alert("hhhhhhi")
                $("#products").empty();
                $.each(data, function (index, product) {
                    console.log(product);
                    $("#products").append("<div class='col-lg-4 col-sm-6'>\n" +
                        "                            <div class='product-item'>\n" +
                        "                                <div class='pi-pic' >\n" +
                        "                                    <img src=" + product[3] + "alt='picture'>\n" +
                        "                                    <ul>\n" +
                        "                                        <li class='w-icon active'><a href='#'><i class='icon_bag_alt'></i></a></li>\n" +
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
        });

    }
}
