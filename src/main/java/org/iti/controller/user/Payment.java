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

@WebServlet(name = "checkOut", urlPatterns = "/checkOut")
public class Payment extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CartService cartService = new CartIServicempl();
        UserService userService = new UserServiceImpl();
        ProductService productService = new ProductServiceImpl();

        User currentuser = (User) req.getSession().getAttribute("currentuser");
        System.out.println(currentuser + " inside checkOut ");

        List<Product> allProductsFromCart = cartService.getAllProductsFromCart(currentuser.getUserId());
        if (allProductsFromCart.size() != 0) {

            double totalPrice = (double) cartService.getTotalPrice(currentuser.getUserId());
            System.out.println("total price " + totalPrice);
            double creditLimit = currentuser.getCreditLimit();
            System.out.println("creditLimit " + creditLimit);

            //check creditlimit
            if (creditLimit - totalPrice < 0) {
                req.setAttribute("paymentMsg", "Credit Limit is not enough!");
            } else {
                //update stock
                for (Product product : allProductsFromCart) {
                    int quantity = cartService.getQuantityOfProductInCart(currentuser.getUserId(), product.getProductId());
                    System.out.println("update stock in product:  " + productService.updateProductStock(product.getProductId(), product.getStock() - quantity));
                }

                //update CreditLimit
                System.out.println("new credit" + (currentuser.getCreditLimit() - totalPrice));
                currentuser.setCreditLimit((int) (currentuser.getCreditLimit() - totalPrice));
                System.out.println("update CreditLmit:  " + userService.updateUser(currentuser));

                //reset cart
                System.out.println("reset Cart: " + cartService.resetCart(currentuser.getUserId()));

                req.setAttribute("paymentMsg", "Purchasing done Successfully");
            }
        }
        req.getRequestDispatcher("GetCartProducts").forward(req, resp);
    }
}
