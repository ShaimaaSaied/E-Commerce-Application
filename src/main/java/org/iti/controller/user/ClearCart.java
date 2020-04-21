package org.iti.controller.user;

import org.iti.model.dao.daoimpl.CartDaoImpl;
import org.iti.model.dao.interfaces.CartDao;
import org.iti.model.entity.User;
import org.iti.service.impl.CartIServicempl;
import org.iti.service.impl.ProductServiceImpl;
import org.iti.service.interfaces.CartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name="ClearCart",urlPatterns = "/ClearCart")
public class ClearCart  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user= (User) req.getSession().getAttribute("currentuser");
        CartService cartService = new CartIServicempl();
        cartService.resetCart(user.getUserId());

        req.getRequestDispatcher("user/cart/shopping-cart.jsp").forward(req,resp);
    }
}