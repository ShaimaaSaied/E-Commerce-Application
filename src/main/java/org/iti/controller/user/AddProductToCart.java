package org.iti.controller.user;

import com.google.gson.Gson;
import org.iti.model.entity.Product;
import org.iti.model.entity.User;
import org.iti.service.impl.CartIServicempl;
import org.iti.service.interfaces.CartService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AddProductToCart extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        CartService cartService = new CartIServicempl();
        String productid = req.getParameter("id");
        System.out.println("id : " + productid);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        User currentuser = (User) req.getSession().getAttribute("currentuser");
        System.out.println("currentuser inside AddProductToCart : " + currentuser.getUserId());
        boolean res = cartService.addProductToCart(currentuser.getUserId(), Integer.parseInt(productid), 1);
        System.out.println("addProductInCartRes :" + res);
        // productid always 1
        req.getRequestDispatcher("user/home/home.jsp").forward(req, response);
    }

}
