package org.iti.model.dao.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.iti.model.confg.DBConnection;
import org.iti.model.dao.interfaces.ProductDao;
import org.iti.model.entity.Product;

import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private SessionFactory sessionFactory = null;

    private final String RETRIVE_ALL_PRODUCTS = "from org.iti.model.entity.Product";
    private final String RETRIVE_PRODUCT_BY_ID = "from org.iti.model.entity.Product as product where product.productId =: product_id";
    private final String RETRIVE_PRODUCT_BY_NAME = "from org.iti.model.entity.Product as product where product.productName like : productName";
    private final String RETRIVE_PRODUCT_BY_PRICE = "from org.iti.model.entity.Product as product where product.price =: price";
    private final String RETRIVE_PRODUCT_BY_CATEGORY = "from org.iti.model.entity.Product as product where product.category.categoryName like: categoryName";
    private final String DELETE_PRODUCT_BY_ID = "delete from org.iti.model.entity.Product where productId=:productId";
    private final String UPDATE_PRODUCT_PRICE = "update org.iti.model.entity.Product set price=:price where productId=:productId";
    private final String UPDATE_PRODUCT_STOCK = "update org.iti.model.entity.Product set stock=:stock where productId=:productId";

    public ProductDaoImpl() {
        sessionFactory = DBConnection.getInstance();
    }

    @Override
    public List<Product> selectAllProduct() {
        List<Product> productList = null;
        productList = sessionFactory.openSession().createQuery(RETRIVE_ALL_PRODUCTS).list();
        return productList;
    }

    @Override
    public Product selectProductById(int id) {
        Product product = null;
        product = (Product) sessionFactory.openSession().createQuery(RETRIVE_PRODUCT_BY_ID).
                setParameter("product_id", id).uniqueResult();
        return product;
    }

    @Override
    public List<Product> selectProductByName(String name) {
        List<Product> productList = null;
        productList = sessionFactory.openSession().createQuery(RETRIVE_PRODUCT_BY_NAME).
                setParameter("productName", "%" + name + "%").list();
        return productList;
    }

    @Override
    public List<Product> selectProductByPrice(double price) {
        List<Product> productList = null;
        productList = sessionFactory.openSession().createQuery(RETRIVE_PRODUCT_BY_PRICE).
                setParameter("price", price).list();
        return productList;
    }

    @Override
    public List<Product> selectProductByCategory(String categoryName) {
        List<Product> productList = null;
        productList = sessionFactory.openSession().createQuery(RETRIVE_PRODUCT_BY_CATEGORY).
                setParameter("categoryName", "%" + categoryName + "%").list();
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(product);
        session.getTransaction().commit();
        System.out.println("insert Successfully");
    }

    @Override
    public boolean deleteProduct(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        int row = session.createQuery(DELETE_PRODUCT_BY_ID).setParameter("stock", id).executeUpdate();
        if (row == 1) {
            session.getTransaction().commit();
            System.out.println("delete Successfully");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateProductPrice(int id, double price) {
        Session sessionUpdate = sessionFactory.openSession();
        sessionUpdate.beginTransaction();
        int row = sessionUpdate.createQuery(UPDATE_PRODUCT_PRICE).setParameter("productId", id).setParameter("price", price).executeUpdate();
        if (row == 1) {
            sessionUpdate.getTransaction().commit();
            System.out.println("update Successfully");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateProductStock(int id, int stock) {
        Session sessionUpdate = sessionFactory.openSession();
        sessionUpdate.beginTransaction();
        int row = sessionUpdate.createQuery(UPDATE_PRODUCT_STOCK).setParameter("productId", id).setParameter("stock", stock).executeUpdate();
        if (row == 1) {
            sessionUpdate.getTransaction().commit();
            System.out.println("update Successfully");
            return true;
        } else {
            return false;
        }
    }
}
