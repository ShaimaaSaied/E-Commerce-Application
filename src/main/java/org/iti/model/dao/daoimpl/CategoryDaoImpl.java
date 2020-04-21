package org.iti.model.dao.daoimpl;

import org.hibernate.Session;
import org.iti.model.confg.DBConnection;
import org.iti.model.dao.interfaces.CategoryDao;
import org.iti.model.entity.Category;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    private Session session = null;

    private final String SELECT_ALL_CATEGORIES = "FROM org.iti.model.entity.Category";

    public CategoryDaoImpl() {
        session = DBConnection.getInstance();
    }

    @Override
    public List<Category> selectAllCategories() {
        List<Category> list = null;
        list = session.createQuery(SELECT_ALL_CATEGORIES).list();
        return list;
    }

}
