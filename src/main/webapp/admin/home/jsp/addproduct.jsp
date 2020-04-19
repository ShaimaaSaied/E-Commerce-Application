<%--
  Created by IntelliJ IDEA.
  User: SARA
  Date: 4/19/2020
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp" %>


</div>
<div class="col-sm-8">
    <div class="product-information"><!--/product-information-->
        <form action="AdminProduct" method="post" enctype="multipart/form-data">
            <h2>${type} Product</h2>
            <label>Product Name</label>
            <input type="text" placeholder="Product Name" name="ProductName" value="${product.name}" class="input-field"
                   id="ProductName" required/>
            <label>Product Price</label>
            <input type="number" placeholder="Product Price" name="ProductPrice" value="${product.price}" step="0.01"
                   class="input-field" id="ProductPrice" required/>

            <label>Product Description</label>
            <textarea placeholder="Product Description" name="ProductDescription"
                      class="input-field">${product.discriptin}</textarea>

        </form>


    </div>
</div>
</div>