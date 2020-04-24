package org.iti.controller.user;

import org.iti.model.entity.User;
import org.iti.service.impl.CartIServicempl;
import org.iti.service.interfaces.CartService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name="UpdateQuantity",urlPatterns = "/UpdateQuantity")
public class UpdateQuntityOfProductAtCart extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CartService cartService = new CartIServicempl();

        User currentuser = (User) req.getSession().getAttribute("currentuser");
        System.out.println(currentuser + " inside UpdateQuntityOfProductAtCart");

        String pid =req.getParameter("productId");
        System.out.println(pid);
        String quantity= req.getParameter("quantityInput"+pid);
        System.out.println("productId : "+pid);
        System.out.println("quantity : "+ quantity);

        System.out.println(cartService.updateProductQuantityInCart(currentuser.getUserId(), Integer.parseInt(pid), Integer.parseInt(quantity)));

        req.getRequestDispatcher("GetCartProducts").forward(req, resp);
    }
}
