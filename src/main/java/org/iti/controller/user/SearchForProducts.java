package org.iti.controller.user;

import org.iti.model.dao.daoimpl.ProductDaoImpl;
import org.iti.model.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="searchByName",urlPatterns = {"/searchByName"})
public class SearchForProducts extends HttpServlet {
    List<Product> products = new ArrayList<>();
    ProductDaoImpl productDao = new ProductDaoImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String productName = "";
        System.out.println(request.getParameter("search"));
        if (request.getParameter("search") != null) {
            productName = request.getParameter("search");
            System.out.println(productName);
            products = productDao.selectProductByName(productName);
            System.out.println(products.size());
            System.out.println(products);
            request.setAttribute("productsFromSearch", products);

        } else {
            request.setAttribute("NotFound","Keyword" + productName + "Does not match any products");
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/user/home/jsp/SearchResult.jsp");
        dispatcher.forward(request, response);

    }

}
