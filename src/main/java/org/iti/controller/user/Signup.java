package org.iti.controller.user;

import org.iti.model.entity.User;
import org.iti.service.impl.UserServiceImpl;
import org.iti.service.interfaces.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Signup extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserService userService = new UserServiceImpl();
        // User user = (User) req.getAttribute("user");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        System.out.println(username + "into dopost");
        String creditLimit = req.getParameter("creditLimit");
        User user = new User(username, password, email, Integer.parseInt(creditLimit));
        user.setRole("User");
        userService.createUser(user);
        System.out.println("User insert Successfully");
        req.getRequestDispatcher("user/home/html/home.html").forward(req, resp);

    }


}
