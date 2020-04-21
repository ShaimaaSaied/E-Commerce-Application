package org.iti.controller.admin;

import org.iti.model.entity.Category;
import org.iti.model.entity.Product;
import org.iti.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "updateAdminProduct", urlPatterns = {"/updateAdminProduct"})
//@MultipartConfig(maxFileSize = 4 * 1024 * 1024)
public class UpdateProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Product selectedProduct = new ProductServiceImpl().selectProductById(id);
        if (selectedProduct != null) {
            request.setAttribute("selectedProduct", selectedProduct);
            request.getRequestDispatcher("admin/home/jsp/updateproduct.jsp").include(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println((Product) request.getAttribute("selectedProduct"));
        request.getParameterNames().asIterator().forEachRemaining(System.out::println);
        System.out.println("updateAdminProduct");
        // get parameters from request

        System.out.println(">>>>" + request.getParameter("pname"));
        String productName = request.getParameter("pname");
        System.out.println(request.getParameter("pprice"));
        double price = Double.parseDouble(request.getParameter("pprice"));
        int stock = Integer.parseInt(request.getParameter("pstock"));
        String image = request.getParameter("pimage");
        String description = request.getParameter("pdescription");
        int categoryId = Integer.parseInt(request.getParameter("pcategory"));
        Category category = new Category(categoryId, "bbbb");

        int productToBeUpdatedId = Integer.parseInt(request.getParameter("id"));
        Product productToBeUpdated = new ProductServiceImpl().selectProductById(productToBeUpdatedId);
        productToBeUpdated.setProductName(productName);
        productToBeUpdated.setPrice(price);
        productToBeUpdated.setStock(stock);
        productToBeUpdated.setImage(image);
        productToBeUpdated.setDescription(description);
        productToBeUpdated.setCategory(category);

        System.out.println(productToBeUpdated);
        Product updatedProduct = new ProductServiceImpl().updateProduct(productToBeUpdated);
        System.out.println(updatedProduct);
        System.out.println("updated successfully");
        response.sendRedirect("adminproduct");

    }
}
