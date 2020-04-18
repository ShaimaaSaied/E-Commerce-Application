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
            req.getRequestDispatcher("signin_signup/html/SigninSignUp.html").forward(req, resp);

        }

    }
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            Validation validation = new Validation();
            System.out.println("doPostProfile");
            UserService userService = new UserServiceImpl();

            String username = req.getParameter("validationCustomName");
            String password = req.getParameter("validationCustompassword");
            String email = req.getParameter("validationCustomEmail");
            String jop = req.getParameter("validationjop");
            String address = req.getParameter("validationCustomAddress");

            System.out.println("user Test"+username);
            System.out.println("user Test"+password);
            System.out.println("user Test"+email);
            System.out.println("user Test"+jop);
            System.out.println("user Test"+address);

            boolean validateUsername = validation.isUsernameUnique(username);
            System.out.println(validateUsername+"validateUsername");
//            PrintWriter out = resp.getWriter();
//            out.println("{user:" + validateUsername + "}");
            if (validateUsername) {
                //hna hagebo mn session

                User user= (User) req.getSession().getAttribute("currentuser");
                user.setUsername(username);
                user.setFirstName("firstTest");
                user.setLastName("lastTest");
                user.setPassword(password);
                user.setEmail(email);
                user.setJop(jop);
                user.setAddress(address);
                System.out.println("user Test"+user);
                userService.updateUser(user);
                System.out.println("User updated Successfully");
                req.setAttribute("message","User updated Successfully");
            } else {
                System.out.println("User not updated ");
                req.setAttribute("message","User not updated");


            }
            req.getRequestDispatcher("user/profile/profile.jsp").include(req, resp);

        }
}