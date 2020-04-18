package org.iti.model.dao.interfaces;

import org.iti.model.entity.Product;
import org.iti.model.entity.User;

import java.util.List;

public interface CartDao {

    public List<Product> selectAllProductsFromCart(int userId);

    boolean addProductToCart(int userId, int productId, int quantity);

    boolean removeProductFromCart(int userId,int productId);

    boolean buyProductFromCart(int userId, int productId);

    int deleteAllFromCart();

    double getTotalPrice(int userId);

    boolean updateProductQuantityInCart(int userId, int productId, int quantity);

}
