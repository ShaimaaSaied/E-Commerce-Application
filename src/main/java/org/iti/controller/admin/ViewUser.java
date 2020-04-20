package org.iti.controller.admin;

import org.iti.model.dao.daoimpl.UserDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/admin/AdminUserServlet")
public class ViewUser extends HttpServlet {
    List<String> allUsers = new ArrayList<String>();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        UserDaoImpl userDbModel = new UserDaoImpl();
        allUsers = userDbModel.allUsernames();
        request.setAttribute("allUsersAdmin", allUsers);
        String nextJSP = "/admin/home/jsp/viewUser.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }
}
