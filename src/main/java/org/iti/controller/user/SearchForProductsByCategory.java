package org.iti.controller.user;

import org.iti.model.dao.daoimpl.ProductDaoImpl;
import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="searchByCategory",urlPatterns = {"/searchByCategory"})
public class SearchForProductsByCategory extends HttpServlet {

    List<Product> products = new ArrayList<>();
    ProductServiceImpl productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String productCategory = "";
        System.out.println(request.getParameter("category"));
        if (request.getParameter("category") != null) {
            productCategory = request.getParameter("category");
            System.out.println(productCategory);
            products = productService.searchForProductByCategory(productCategory);
            System.out.println(products.size());
            System.out.println(products);
            request.setAttribute("productsFromSearch", products);

        } else {
            request.setAttribute("NotFound","This Category" + productCategory + "Does not exist");
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/user/home/jsp/SearchResult.jsp");
        dispatcher.forward(request, response);

    }

}
