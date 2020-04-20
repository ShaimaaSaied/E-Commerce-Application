package org.iti.controller.user;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.iti.model.entity.Product;
import org.iti.model.entity.User;
import org.iti.service.impl.CartIServicempl;
import org.iti.service.interfaces.CartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GetCartProducts", urlPatterns = "/GetCartProducts")
public class GetCartProducts extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        CartService cartService = new CartIServicempl();

        User currentuser = (User) req.getSession().getAttribute("currentuser");
        System.out.println(currentuser + " inside AddProductToCart ");
        List<Product> allProductsFromCart = cartService.getAllProductsFromCart(currentuser.getUserId());
        System.out.println(allProductsFromCart);

        req.setAttribute("CartProducts", allProductsFromCart);
        req.getRequestDispatcher("user/cart/shopping-cart.jsp").forward(req, response);

    }
}
