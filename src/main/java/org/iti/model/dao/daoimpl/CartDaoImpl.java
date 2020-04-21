package org.iti.model.dao.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.iti.model.confg.DBConnection;
import org.iti.model.dao.interfaces.CartDao;
import org.iti.model.entity.Cart;
import org.iti.model.entity.CartId;
import org.iti.model.entity.Product;
import org.iti.model.entity.User;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CartDaoImpl implements CartDao {

    private Session session= null;

    private final String SELECT_ALL_PRODUCTS_FROM_CART = "select c.product FROM org.iti.model.entity.Cart c WHERE c.user.userId=:user_id";
    private final String DELETE_PRODUCT_FROM_CART = "DELETE FROM org.iti.model.entity.Cart c WHERE c.product.productId=:product_id and c.user.userId=:user_id";
    private final String GET_TOTAL_PRICE = "SELECT SUM(c.quantity*c.product.price) FROM org.iti.model.entity.Cart c " +
            "WHERE c.id.userId=:user_id GROUP BY c.user.userId";
    private final String DELETE_ALL_FROM_CART = "DELETE FROM org.iti.model.entity.Cart c WHERE c.user.userId=:user_id";
    private final String BUY_PRODUCT_FROM_CART = "UPDATE org.iti.model.entity.Cart c SET c.purchased=:bought " +
            "WHERE c.product.productId=:product_id and c.user.userId=:user_id";
    private final String UPDATE_PRODUCT_QUANTITY_IN_CART = "UPDATE org.iti.model.entity.Cart c SET c.quantity=:quantity " +
            "WHERE c.product.productId=:product_id and c.user.userId=:user_id";
    private final String GET_QUANTITY_OF_PRODUCT="SELECT c.quantity from org.iti.model.entity.Cart c WHERE c.product.productId=:product_id and c.user.userId=:user_id";

    public CartDaoImpl() {
        session = DBConnection.getInstance();
    }

    /**
     * select all products from a cart of specific user
     *
     * @param userId
     * @return
     */
    @Override
    public List<Product> selectAllProductsFromCart(int userId) {
       return (List<Product>)session.createQuery(SELECT_ALL_PRODUCTS_FROM_CART).setParameter("user_id", userId).list();

    }

    /**
     * add product to cart of a specifuc user
     *
     * @param userId
     * @param productId
     * @return
     */
    @Override
    public boolean addProductToCart(int userId, int productId, int quantity) {
        session.beginTransaction();

        if (session.get(Cart.class, new CartId(userId, productId)) != null) {
            throw new RuntimeException("Duplicate Entry to cart table");
        }

        byte[] purchased = new BigInteger("0", 2).toByteArray();
        byte[] deleted = new BigInteger("0", 2).toByteArray();
        Product product = (Product) session.get(Product.class, productId);
        User user = (User) session.get(User.class, userId);
        Cart cart = new Cart(new CartId(userId, productId), product, user, quantity, purchased, deleted);

        session.save(cart);

        session.getTransaction().commit();
        if (session.get(Cart.class, new CartId(userId, productId)) != null)
            return true;

        return false;
    }

    /**
     * remove product from cart of a specifuc user
     *
     * @param userId
     * @param productId
     * @return
     */
    @Override
    public boolean removeProductFromCart(int userId, int productId) {
        session.beginTransaction();
        int result = session.createQuery(DELETE_PRODUCT_FROM_CART).setParameter("user_id", userId).setParameter("product_id", productId).executeUpdate();
        session.getTransaction().commit();
        System.out.println("delete Successfully");
        if (result == 1)
            return true;
        return false;
    }

    /**
     * buy product from cart
     *
     * @return
     */
    @Override
    public boolean buyProductFromCart(int userId, int productId) {
        session.beginTransaction();
        byte[] bval = new BigInteger("1", 2).toByteArray();
        int result = session.createQuery(BUY_PRODUCT_FROM_CART).setParameter("bought", bval).setParameter("user_id", userId).setParameter("product_id", productId).executeUpdate();
        session.getTransaction().commit();
        if (result == 1)
            return true;
        return false;
    }


    /***
     * reset cart
     * @return boolean
     */
    @Override
    public int deleteAllFromCart() {
        session.beginTransaction();
        int result = session.createQuery(DELETE_ALL_FROM_CART).executeUpdate();
        session.getTransaction().commit();
        System.out.println("delete Successfully");
        return result;
    }

    /***
     * get total price of all products in cart
     * @return
     */
    @Override
    public double getTotalPrice(int userId) {
        if(this.selectAllProductsFromCart(userId).size() != 0)
            return (double) session.createQuery(GET_TOTAL_PRICE).setParameter("user_id", userId).uniqueResult();
        return 0 ;
    }

    @Override
    public boolean updateProductQuantityInCart(int userId, int productId, int quantity) {
        session.beginTransaction();
        int result = session.createQuery(UPDATE_PRODUCT_QUANTITY_IN_CART)
                .setParameter("user_id", userId)
                .setParameter("product_id", productId)
                .setParameter("quantity", quantity)
                .executeUpdate();
        session.getTransaction().commit();
        return (result == 1);
    }


}
