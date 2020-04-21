package org.iti.controller.admin;


import org.iti.model.entity.Product;
import org.iti.model.entity.User;
import org.iti.service.impl.ProductServiceImpl;
import org.iti.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "adminUserProfile", urlPatterns = {"/adminUserProfile"})
public class ViewUserProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        User selectedUser = new UserServiceImpl().retriveUserByID(id);
        if (selectedUser != null) {
            request.getSession().setAttribute("selectedUser", selectedUser);
            request.getRequestDispatcher("admin/home/jsp/userProfileAtAdmin.jsp").include(request,response);
        }
    }
}
