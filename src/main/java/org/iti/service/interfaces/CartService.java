package org.iti.service.interfaces;

import org.iti.model.entity.Product;

import java.util.List;

public interface CartService {

    int resetCart(int userId);

    double getTotalPrice(int userId);

    boolean deleteProductFromCart(int userId, int productId);

    List<Product> getAllProductsFromCart(int userId);

    boolean buyProductFromCart(int userId, int productId);

    boolean addProductToCart(int userId, int productId, int quantity);

    boolean updateProductQuantityInCart(int userId, int productId, int quantity);

    int getQuantityOfProductInCart(int userId, int productId);
}
