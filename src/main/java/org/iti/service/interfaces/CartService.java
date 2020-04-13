package org.iti.service.interfaces;

import org.iti.model.entity.Product;

import java.util.List;

public interface CartService {

    int resetCart();

    double getTotalPrice(int userId);

    boolean deleteProductFromCart(int userId, int productId);

    List<Product> getAllProductsFromCart(int userId);

    boolean buyProductFromCart(int userId, int productId);

    boolean addProductToCart(int userId, int productId, int quantity);
}
