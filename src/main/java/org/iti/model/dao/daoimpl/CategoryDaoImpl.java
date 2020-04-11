package org.iti.model.dao.daoimpl;

import org.hibernate.SessionFactory;
import org.iti.model.confg.DBConnection;
import org.iti.model.dao.interfaces.CategoryDao;
import org.iti.model.entity.Category;
import org.iti.model.entity.User;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    private SessionFactory sessionFactory = null;

    private final String SELECT_ALL_CATEGORIES = "FROM org.iti.model.entity.Category";

    public CategoryDaoImpl() {
        sessionFactory = DBConnection.getInstance();
    }

    @Override
    public List<Category> selectAllCategories() {
        List<Category> list = null;
        list = sessionFactory.openSession().createQuery(SELECT_ALL_CATEGORIES).list();
        return list;
    }

}
