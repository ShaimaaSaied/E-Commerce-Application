package org.iti.service.impl;

public class Test {

    public static void main(String[] args) {

        ProductServiceImpl productService=new ProductServiceImpl();
        System.out.println(productService.selectProductByPrice(-11,9));


    }
}
