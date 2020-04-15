package org.iti.controller.user;

import org.iti.model.entity.User;
import org.iti.service.impl.UserServiceImpl;
import org.iti.service.interfaces.UserService;
import org.iti.util.Validation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Signup extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Validation validation = new Validation();
        System.out.println("insideUser");
        UserService userService = new UserServiceImpl();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String creditLimit = req.getParameter("creditLimit");

        String user1 = req.getParameter("user");

        // boolean validateMail = validation.isEmailUnique(email);
        boolean validateUsername = validation.isUsernameUnique(user1);

        PrintWriter out = resp.getWriter();
        out.println("{user:" + validateUsername + "}");


        if (validateUsername) {
            User user = new User(username, password, email, Integer.parseInt(creditLimit));
            user.setRole("User");
            userService.createUser(user);
            System.out.println("User insert Successfully");

            req.getRequestDispatcher("user/home/html/home.html").forward(req, resp);
        } else {
            resp.sendRedirect("signin_signup/html/SigninSignUp.html?");
        }


    }


}
