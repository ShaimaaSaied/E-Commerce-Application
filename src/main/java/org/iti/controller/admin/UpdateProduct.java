package org.iti.controller.admin;

import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "updateAdminProduct", urlPatterns = {"/updateAdminProduct"})
public class UpdateProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Product selectedProduct = new ProductServiceImpl().selectProductById(id);
        if (selectedProduct != null) {
            request.getSession().setAttribute("selectedProduct", selectedProduct);
            response.sendRedirect("admin/home/jsp/updateproduct.jsp");
        }
    }
}
