package org.iti.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Product  implements java.io.Serializable {


     private Integer productId;
     private Category category;
     private String productName;
     private String description;
     private double price;
     private int stock;
     private String image;
     private Set carts = new HashSet(0);

    public Product() {
    }

	
    public Product(Category category, String productName, double price, int stock, String image) {
        this.category = category;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.image = image;
    }
    public Product(Category category, String productName, String description, double price, int stock, String image, Set carts) {
       this.category = category;
       this.productName = productName;
       this.description = description;
       this.price = price;
       this.stock = stock;
       this.image = image;
       this.carts = carts;
    }


    public Product(String productName, String description, double price, String image) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.image = image;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Set getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "Product{" +
                " productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}


