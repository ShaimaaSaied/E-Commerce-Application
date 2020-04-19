package org.iti.model.dao.interfaces;

import org.iti.model.entity.Product;

import java.util.List;

public interface ProductDao {
    /***
     * you can select all product
     * @return list of product
     */
    List<Product> selectAllProduct();

    /***
     * you can select product by id
     * @param id
     * @return Product
     */
    Product selectProductById(int id);

    /***
     * you can select product by name
     * @param name
     * @return
     */
    List<Product> selectProductByName(String name);

    /***
     * you can select product by price
     * @param price
     * @return
     */
    List<Product> selectProductByPrice(double price);

    /***
     * you can select product by category
     * @param categoryName
     * @return
     */
    List<Product> selectProductByCategory(String categoryName);

    /***
     * admin can add new product
     * @param product
     */
    void addProduct(Product product);

    /***
     * admin can delete = product
     * @param id
     * @return
     */
    boolean deleteProduct(int id);

    boolean updateProductPrice(int id, double price);

    boolean updateProductStock(int id, int stock);

    List<String> searchForProductsName();

    List<Product> selectAllProductSpesificField();
}
