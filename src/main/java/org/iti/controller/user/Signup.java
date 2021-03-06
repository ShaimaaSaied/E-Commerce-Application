package org.iti.controller.user;

import org.iti.model.entity.User;
import org.iti.service.impl.UserServiceImpl;
import org.iti.service.interfaces.UserService;
import org.iti.util.Validation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "register", urlPatterns = "/register")
public class Signup extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("signin_signup/html/signup.jsp").include(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Validation validation = new Validation();
        System.out.println("insideUser");
        UserService userService = new UserServiceImpl();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String creditLimit = req.getParameter("creditLimit");

//        String user1 = req.getParameter("user");

        boolean validateMail = validation.isEmailUnique(email);
        boolean validateUsername = validation.isUsernameUnique(username);
//        System.out.println(validateUsername + "validateUsername");
//        PrintWriter out = resp.getWriter();
//        out.println("{user:" + validateUsername + "}");

        if (validateUsername && validateMail) {
            User user = new User(username, password, email, Integer.parseInt(creditLimit));
            user.setRole("User");
            user = userService.createUser(user);
            req.getSession().setAttribute("currentuser", user);
            System.out.println("User insert Successfully");
            System.out.println("validateUsername && validateMail");
            resp.sendRedirect("login");

        } else if (!validateUsername && !validateMail) {
            req.setAttribute("message", " Email and UserName already Exist");
            System.out.println("!validateUsername && !validateMail");
            req.getRequestDispatcher("signin_signup/html/signup.jsp").forward(req, resp);

        } else if (!validateUsername) {
            req.setAttribute("message", " UserName already Exist");
            System.out.println("!validateUsername");
            req.getRequestDispatcher("signin_signup/html/signup.jsp").forward(req, resp);

        } else {
            req.setAttribute("message", " Email already Exist");
            System.out.println("! validateMail");
            req.getRequestDispatcher("signin_signup/html/signup.jsp").forward(req, resp);

        }

    }


}
