package org.iti.controller.user;

import org.iti.model.dao.daoimpl.ProductDaoImpl;
import org.iti.model.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchForProducts extends HttpServlet {
    List<Product> product = new ArrayList<>();
    ProductDaoImpl productDao = new ProductDaoImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("search") != null) {
            String productName = request.getParameter("search");

            System.out.println(productName);

            product = productDao.selectProductByName(productName);

            System.out.println(product.size());

        } else {
            System.out.println("else");
            double min = Integer.parseInt(request.getParameter("down"));
            System.out.println(min);
            double max = Integer.parseInt(request.getParameter("up"));
            System.out.println(max);


            System.out.println("sizeof product" + product.size());

        }

        request.setAttribute("allProducts", product);


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("");
        dispatcher.forward(request, response);
    }

}
