package org.iti.controller.admin;

import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="adminproduct",urlPatterns = {"/adminproduct"})
public class ProductPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> productsList = productService.selectAllProduct();
        req.setAttribute("listOfProduct", productsList);
        req.getRequestDispatcher("admin/home/jsp/product.jsp").forward(req, resp);
    }
}
