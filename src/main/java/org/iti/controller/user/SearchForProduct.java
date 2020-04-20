package org.iti.controller.user;

import com.fasterxml.classmate.GenericType;
import com.google.gson.Gson;
import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;
import org.iti.service.interfaces.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchForProduct extends HttpServlet {

    List<Product> products = new ArrayList<>();

    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        String name = req.getParameter("name");
        System.out.println("Name inside filter: " + name);

        products = productService.selectProductByName(name);
        System.out.println("in dopost"+products);

    }
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        System.out.println("in doget");
        Gson json = new Gson();    //error in json
        String myJson = json.toJson(products, new GenericType<List<Product>>() {});
        System.out.println("myJson : selectProductByName \n" + myJson);
        response.getWriter().println(myJson);
    }


}
