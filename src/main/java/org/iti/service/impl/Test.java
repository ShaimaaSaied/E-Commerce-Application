package org.iti.service.impl;

public class Test {

    public static void main(String[] args) {
//        ProductServiceImpl productService=new ProductServiceImpl();
//

        CartIServicempl cartIServicempl = new CartIServicempl();
// System.out.println(cartIServicempl.Get(18));
//        System.out.println(cartIServicempl.addProductToCart(18, 3, 3));
        System.out.println(cartIServicempl.deleteProductFromCart(2,2));
    }
}
