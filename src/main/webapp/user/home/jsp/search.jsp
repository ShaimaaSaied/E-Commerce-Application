<%--
  Created by IntelliJ IDEA.
  User: SARA
  Date: 4/20/2020
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
***********************
<form action="SearchForProduct" method="get">
    <div class="price-range"><!--price-range-->
        <h2>Price Range</h2>
        <div class="well text-center">
            <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="${maxPrice}"
                   data-slider-step="5" data-slider-value="[0,${maxPrice}]" id="sl2"><br/>
            <b class="pull-left">$ 0</b> <b class="pull-right">$${maxPrice}</b>
            <br>
            <%--            <input type="hidden" id="downValue" name="down" value="0"/>--%>
            <input type="hidden" id="upValue" name="up" value="${maxPrice}"/>
            <input type="submit" class="btn btn-default">
        </div>
    </div><!--/price-range-->
</form>