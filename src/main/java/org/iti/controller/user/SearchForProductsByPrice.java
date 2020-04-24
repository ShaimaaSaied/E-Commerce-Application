package org.iti.controller.user;

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



@WebServlet(name="searchByPrice",urlPatterns = {"/searchByPrice"})
public class SearchForProductsByPrice extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        System.out.println("min: " + request.getParameter("min"));
        System.out.println("max: " + request.getParameter("max"));
        List<Product> products = productService.selectProductByPrice(Integer.parseInt(request.getParameter("min")), Integer.parseInt(request.getParameter("max")));
        System.out.println("products search by price:" + products);

        request.setAttribute("productsFromSearchByPrice",products);
        getServletContext().getRequestDispatcher("/user/home/jsp/PriceSearchResult.jsp").forward(request,response);

    }

}
