package org.iti.controller.user;

import org.iti.model.dao.daoimpl.CartDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteCart")
public class DeleteProductFromCart extends HttpServlet {
    CartDaoImpl cartDao;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        cartDao = new CartDaoImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        int productId = Integer.parseInt(request.getParameter("productId"));
        boolean addCart = cartDao.removeProductFromCart(id, productId);

        String nextJSP = "";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.include(request, response);
    }


}

