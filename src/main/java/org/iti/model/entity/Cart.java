package org.iti.model.entity;

public class Cart implements java.io.Serializable {


    private CartId id;
    private Product product;
    private User user;
    private int quantity;
    private byte[] purchased;
    private byte[] deleted;

    public Cart() {
    }

    public Cart(CartId id, Product product, User user, int quantity, byte[] purchased, byte[] deleted) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.quantity = quantity;
        this.purchased = purchased;
        this.deleted = deleted;
    }

    public CartId getId() {
        return this.id;
    }

    public void setId(CartId id) {
        this.id = id;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public byte[] getPurchased() {
        return this.purchased;
    }

    public void setPurchased(byte[] purchased) {
        this.purchased = purchased;
    }

    public byte[] getDeleted() {
        return this.deleted;
    }

    public void setDeleted(byte[] deleted) {
        this.deleted = deleted;
    }


}


