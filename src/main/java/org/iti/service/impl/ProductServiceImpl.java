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
    public List<Product> selectProductByPrice(double min, double max) {
        return productDao.selectProductByPrice(min, max);
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
    public Product updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    @Override
    public List<Product> selectAllProductSpesificField() {
        return productDao.selectAllProductSpesificField();
    }

    @Override
    public List<Product> searchForProductByCategory(String categoryName) {
        return productDao.selectProductByCategory(categoryName);
    }
}
