package org.iti.controller.user;

import com.google.gson.Gson;
import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;
import org.iti.service.interfaces.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class getAllProductsNames extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        ProductService productService = new ProductServiceImpl();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        List<String> list = productService.searchForProductsName();
        Gson json = new Gson();
        String myListOfJson = json.toJson(list);
        System.out.println("myListOfJson : SearchForProductUsingName \n" + myListOfJson);
        response.getWriter().println(myListOfJson);
    }




}
