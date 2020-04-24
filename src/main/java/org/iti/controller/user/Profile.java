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

@WebServlet(name="profile",urlPatterns = "/profile")
public class Profile extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user= (User) req.getSession().getAttribute("currentuser");
        if(user!=null){
            req.getRequestDispatcher("user/profile/profile.jsp").include(req, resp);
        }else
        {
            req.getRequestDispatcher("signin_signup/html/SigninSignUp.jsp").forward(req, resp);

        }

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Validation validation = new Validation();
        System.out.println("doPostProfile");
        UserService userService = new UserServiceImpl();

        String username = req.getParameter("validationCustomName");
        String password = req.getParameter("validationCustompassword");
        String email = req.getParameter("validationCustomEmail");
        int creditCard = Integer.parseInt(req.getParameter("validationCredit"));
        String address = req.getParameter("validationCustomAddress");

        //1- get all Field update

        User user = (User) req.getSession().getAttribute("currentuser");
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPassword(password);
        user.setCreditLimit(creditCard);
        user.setAddress(address);

        // 2-User Name and mail check not in data base
        //check userName & email not change
        if(username.equals(user.getUsername()) && email.equals(user.getEmail())){
            req.setAttribute("message", "User updated Successfully :)");
            userService.updateUser(user);
        }
        //if change username and email
        else if (!username.equals(user.getUsername())&&!email.equals(user.getEmail())){
            boolean isUniqueUsername = validation.isUsernameUnique(username);
            boolean isUniqueEmail = validation.isEmailUnique(email);

            if(isUniqueUsername&&isUniqueEmail){
                user.setUsername(username);
                user.setEmail(email);
                req.setAttribute("message", "User updated Successfully :)");
                userService.updateUser(user);
            }else{
                req.setAttribute("message", "username and email is already exist");
            }
        }
        else if (!username.equals(user.getUsername())){
            boolean isUniqueUsername = validation.isUsernameUnique(username);
            if(isUniqueUsername){
                user.setUsername(username);
                req.setAttribute("message", "User updated Successfully :)");
                userService.updateUser(user);
            }else{
                req.setAttribute("message", "username is already exist");
            }

        }else {
            boolean isUniqueEmail = validation.isEmailUnique(email);
            if(isUniqueEmail){
                user.setEmail(email);
                req.setAttribute("message", "User updated Successfully :)");
                userService.updateUser(user);
            }else{
                req.setAttribute("message", "Email is already exist");
            }
        }
        req.getRequestDispatcher("user/profile/profile.jsp").include(req, resp);
    }
}




