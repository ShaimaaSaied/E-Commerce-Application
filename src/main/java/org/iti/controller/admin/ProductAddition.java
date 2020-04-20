package org.iti.controller.admin;

import org.iti.model.dao.daoimpl.ProductDaoImpl;
import org.iti.model.entity.Category;
import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AddProduct", urlPatterns = {"/addAdminProduct"})
@MultipartConfig
public class ProductAddition extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/admin/jsp/addproduct.jsp").forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String name = request.getParameter("ProductName");
        double price = Double.parseDouble(request.getParameter("ProductPrice"));
        int stock = Integer.parseInt(request.getParameter("ProductStock"));
        String image = request.getParameter("ProductImage");
        int catId = Integer.parseInt(request.getParameter("ProductCategory"));
        String description = request.getParameter("ProductDescription");

        Category category = new Category();
        category.setCategoryId(catId);
        category.setCategoryName("bbbb");

        Product productObj = new Product();
        productObj.setProductName(name);
        productObj.setPrice(price);
        productObj.setStock(stock);
        productObj.setImage(image);
        productObj.setCategory(category);
        productObj.setDescription(description);

        if (!request.getParameter("ProductName").trim().equals("")) {
            new ProductDaoImpl().addProduct(productObj);
            request.getSession().setAttribute("AlertMessage", "Product Added Successfully");
            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("adminproduct");
        } else {
            request.getSession().setAttribute("AlertMessage", "canot add product ..An Error occure");
            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("addAdminProduct");
            return;
        }

    }

}

