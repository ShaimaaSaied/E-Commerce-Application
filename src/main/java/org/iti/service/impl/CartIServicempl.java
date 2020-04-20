package org.iti.service.impl;


import org.iti.model.dao.daoimpl.CartDaoImpl;
import org.iti.model.entity.Product;
import org.iti.service.interfaces.CartService;

import java.util.List;

public class CartIServicempl implements CartService {
    CartDaoImpl cartDao = null;

    public CartIServicempl() {
        this.cartDao = new CartDaoImpl();
    }

    @Override
    public int resetCart(int userId) {
        return cartDao.deleteAllFromCart(userId);
    }

    @Override
    public double getTotalPrice(int userId) {
        return cartDao.getTotalPrice(userId);
    }

    @Override
    public boolean deleteProductFromCart(int userId, int productId) {
        return cartDao.removeProductFromCart(userId, productId);
    }

    @Override
    public List<Product> getAllProductsFromCart(int userId) {
        return cartDao.selectAllProductsFromCart(userId);
    }

    @Override
    public boolean buyProductFromCart(int userId, int productId) {
        return cartDao.buyProductFromCart(userId, productId);
    }

    @Override
    public boolean addProductToCart(int userId, int productId, int quantity) {
        return cartDao.addProductToCart(userId, productId,quantity);
    }

    @Override
    public boolean updateProductQuantityInCart(int userId, int productId, int quantity) {
        return cartDao.updateProductQuantityInCart(userId,productId,quantity);
    }


}
