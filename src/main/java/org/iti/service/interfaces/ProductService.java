package org.iti.service.interfaces;

import org.iti.model.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> selectAllProduct();

    Product selectProductById(int id);

    List<Product> selectProductByName(String name);

    List<Product> selectProductByPrice(double price);

    void addProduct(Product product);

    boolean deleteProduct(int id);

    boolean updateProductPrice(int id, double price);

    boolean updateProductStock(int id, int stock);

    List<String> searchForProductsName();

    List<Product> selectAllProductSpesificField();

    Product updateProduct(Product product);

    List<Product> searchForProductByCategory(String categoryName);
}
