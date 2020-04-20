package org.iti.service.impl;


import org.iti.model.dao.daoimpl.ProductDaoImpl;
import org.iti.model.entity.Product;
import org.iti.service.interfaces.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDaoImpl productDao = null;

    public ProductServiceImpl() {
        productDao = new ProductDaoImpl();
    }

    @Override
    public List<Product> selectAllProduct() {
        return productDao.selectAllProduct();
    }

    @Override
    public Product selectProductById(int id) {
        return productDao.selectProductById(id);
    }

    @Override
    public List<Product> selectProductByName(String name) {
        return productDao.selectProductByName(name);
    }

    @Override
    public List<Product> selectProductByPrice(double price) {
        return productDao.selectProductByPrice(price);
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public boolean deleteProduct(int id) {
        return productDao.deleteProduct(id);
    }

    @Override
    public boolean updateProductPrice(int id, double price) {
        return productDao.updateProductPrice(id, price);
    }

    @Override
    public boolean updateProductStock(int id, int stock) {
        return productDao.updateProductStock(id, stock);
    }

    @Override
    public List<String> searchForProductsName() {
        return productDao.searchForProductsName();
    }

    @Override
    public boolean updateProduct(Product product) {
        return productDao.updateProduct(product);
    }
}
