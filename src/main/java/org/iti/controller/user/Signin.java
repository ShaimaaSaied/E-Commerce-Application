package org.iti.controller.user;

import org.iti.model.entity.User;
import org.iti.service.impl.UserServiceImpl;
import org.iti.service.interfaces.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="login", urlPatterns = "/login")
public class Signin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("signin_signup/html/SigninSignUp.html").include(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        System.out.println("password " + password);
        System.out.println("email " + email);

        UserService userService = new UserServiceImpl();
        User user = userService.retriveUser(email, password);
        System.out.println("User : inside singin " + user);
        if (user != null) {
            if (user.getRole().equalsIgnoreCase("user")){
                req.getSession().setAttribute("currentuser",user);
                resp.sendRedirect("/ECommerce/home");
            } else {
                resp.sendRedirect("/ECommerce/adminhome");
            }
        } else {
            req.getRequestDispatcher("signin_signup/html/SigninSignUp.html").forward(req, resp);
        }
    }
}
