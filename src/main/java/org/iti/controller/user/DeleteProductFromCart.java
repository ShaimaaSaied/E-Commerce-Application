package org.iti.controller.user;

import org.iti.model.dao.daoimpl.CartDaoImpl;
import org.iti.model.dao.interfaces.CartDao;
import org.iti.model.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="DeleteProductFromCart",urlPatterns = "/DeleteProductFromCart")
public class DeleteProductFromCart extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CartDao cartDao = cartDao = new CartDaoImpl();
        User currentuser = (User) request.getSession().getAttribute("currentuser");

        int productId = Integer.parseInt(request.getParameter("id"));
        System.out.println("productID: "+productId);
        boolean deleteProductFromCart = cartDao.removeProductFromCart(currentuser.getUserId(), productId);
        System.out.println("deleteProductFromCart:  "+deleteProductFromCart);

        request.getRequestDispatcher("GetCartProducts").forward(request, response);
    }


}

