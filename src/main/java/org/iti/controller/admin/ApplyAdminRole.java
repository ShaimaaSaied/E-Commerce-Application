package org.iti.controller.admin;

import org.iti.model.entity.User;
import org.iti.service.impl.ProductServiceImpl;
import org.iti.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "adminRole", urlPatterns = {"/adminRole"})
public class ApplyAdminRole extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.retriveUserByID(id);
        System.out.println(user);
        user.setRole("admin");
        User updatedUser = userService.updateUser(user);
        if (updatedUser.getRole().equalsIgnoreCase("admin")) {
            response.sendRedirect("adminUsers");
        } else {
            response.sendRedirect("admin/home/jsp/viewUser.jsp");
        }
    }
}
