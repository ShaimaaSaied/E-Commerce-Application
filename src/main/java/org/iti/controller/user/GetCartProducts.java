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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "GetCartProducts", urlPatterns = "/GetCartProducts")
public class GetCartProducts extends HttpServlet {
    Map<Product, Integer> productQuantityMap = new HashMap<>();

    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("-------------------start");
        CartService cartService = new CartIServicempl();
        User currentuser = (User) req.getSession().getAttribute("currentuser");
        System.out.println(currentuser + " inside AddProductToCart ");
        List<Product> allProductsFromCart = cartService.getAllProductsFromCart(currentuser.getUserId());
        System.out.println(allProductsFromCart);
        productQuantityMap.clear();
        for (Product product : allProductsFromCart) {
            int quantity = cartService.getQuantityOfProductInCart(currentuser.getUserId(), product.getProductId());
            productQuantityMap.put(product, quantity);
        }
        double totalPrice = cartService.getTotalPrice(currentuser.getUserId());
        req.setAttribute("totalPrice", totalPrice);
        System.out.println(totalPrice);
        System.out.println("////////////////////////////////////////");
        System.out.println(productQuantityMap);
        req.setAttribute("CartProducts", productQuantityMap);
        System.out.println("-----------------end");
        req.getRequestDispatcher("user/cart/shopping-cart.jsp").forward(req, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("GetCartProducts");
    }
}
