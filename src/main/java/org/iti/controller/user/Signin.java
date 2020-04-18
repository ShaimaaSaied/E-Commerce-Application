package org.iti.controller.user;

import org.iti.model.entity.User;
import org.iti.service.impl.UserServiceImpl;
import org.iti.service.interfaces.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Signin extends HttpServlet {


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        System.out.println("password " + password);
        System.out.println("email " + email);
        UserService userService = new UserServiceImpl();
        User user = userService.retriveUser(email, password);
        System.out.println("User : inside singin " + user);
        if (user != null) {
            resp.sendRedirect("user/home/home.html");
        } else {
            req.getRequestDispatcher("signin_signup/html/SigninSignUp.html").forward(req, resp);
        }
    }
}
