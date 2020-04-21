package org.iti.controller.user;

import org.iti.model.entity.Product;
import org.iti.model.entity.User;
import org.iti.service.impl.CartIServicempl;
import org.iti.service.impl.ProductServiceImpl;
import org.iti.service.impl.UserServiceImpl;
import org.iti.service.interfaces.CartService;
import org.iti.service.interfaces.ProductService;
import org.iti.service.interfaces.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="checkOut",urlPatterns = "/checkOut")
public class Payment extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CartService cartService = new CartIServicempl();
        UserService userService = new UserServiceImpl();
        User currentuser = (User) req.getSession().getAttribute("currentuser");
        System.out.println(currentuser + " inside checkOut ");

        List<Product> allProductsFromCart = cartService.getAllProductsFromCart(currentuser.getUserId());
        //check stock
        for( Product product:allProductsFromCart) {
            int quantity = cartService.getQuantityOfProductInCart(currentuser.getUserId(), product.getProductId());
            if(product.getStock()< quantity)
            {
                req.setAttribute("paymentMsg", "Invalid quantity!");
                req.getRequestDispatcher("user/cart/shopping-cart.jsp").forward(req, resp);
            }
            else
            {
                System.out.println(product.getProductName()+" stock is okay");
            }
        }

        double totalPrice =(double) cartService.getTotalPrice(currentuser.getUserId());
        double creditLimit = currentuser.getCreditLimit();

        //check creditlimit
        if(creditLimit-totalPrice < 0) {
            req.setAttribute("paymentMsg", "Credit Limit is not enough!");
            req.getRequestDispatcher("user/cart/shopping-cart.jsp").forward(req, resp);
        }
        else{
            System.out.println("credit limit is okay");
        }

        System.out.println(cartService.resetCart(currentuser.getUserId()));
        //update stock
        for( Product product:allProductsFromCart) {
            int quantity = cartService.getQuantityOfProductInCart(currentuser.getUserId(), product.getProductId());
            System.out.println(cartService.updateProductQuantityInCart(currentuser.getUserId(),
                                                                        product.getProductId(),
                                                                product.getStock()-quantity));
        }
        //update CreditLimit
        currentuser.setCreditLimit((int)(currentuser.getCreditLimit()- totalPrice));
        System.out.println(userService.updateUser(currentuser));

        req.setAttribute("paymentMsg", "Purchasing done Successfully");
        req.getRequestDispatcher("user/cart/shopping-cart.jsp").forward(req, resp);

    }
}
