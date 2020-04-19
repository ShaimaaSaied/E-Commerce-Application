package org.iti.controller.admin;

import org.iti.model.dao.daoimpl.ProductDaoImpl;
import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AddProduct", urlPatterns = {"/admin/AdminProduct"})
@MultipartConfig
public class ProductAddition extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Product productobject = new ProductServiceImpl().selectProductById(id);
        if (productobject == null) {
            request.getSession().setAttribute("message", "Product not found");
            response.sendRedirect("../Failed.jsp");
        } else {
            request.setAttribute("product", productobject);
            request.setAttribute("type", "Edit");
            request.getRequestDispatcher("/admin/addproduct.jsp").forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String name = request.getParameter("ProductName");
        double price = Double.parseDouble(request.getParameter("ProductPrice"));

        String description = request.getParameter("ProductDescription");


        Product productObj = new Product();
        productObj.setProductName(name);
        productObj.setPrice(price);

        productObj.setDescription(description);


        boolean check = false;
        if (request.getParameter("id") != null && !request.getParameter("id").trim().equals("")) {

            int id = Integer.parseInt(request.getParameter("id"));
            productObj.setProductId(id);


            new ProductDaoImpl().addProduct(productObj);

            request.getSession().setAttribute("AlertMessage", "Product Added Successfully");
            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("adminhome");
            check = true;

        } else if (check != true) {

            request.getSession().setAttribute("AlertMessage", "canot add product ..An Error occure");
            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("adminhome");
            return;
        }

    }

}

