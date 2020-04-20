package org.iti.controller.admin;

import org.iti.model.entity.User;
import org.iti.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "adminUsers", urlPatterns = {"/adminUsers"})
public class ViewAllUsers extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserServiceImpl userService = new UserServiceImpl();
        List<User> allUsers = userService.retriveAllUsers();
        request.setAttribute("allUsersAdmin", allUsers);
        String nextJSP = "/admin/home/jsp/viewUser.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }
}
