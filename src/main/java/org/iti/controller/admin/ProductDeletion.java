package org.iti.controller.admin;

import org.iti.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteProduct", urlPatterns = {"/admin/DeleteProduct"})
public class ProductDeletion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        if (new ProductServiceImpl().deleteProduct(id)) {

            request.getSession().setAttribute("AlertMessage", "Product Deleted Successfully");

            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("AdminProductServlet");

        } else {

            request.getSession().setAttribute("AlertMessage", "canot Delete product ..An Error occure");

            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("AdminProductServlet");

        }

    }
}
