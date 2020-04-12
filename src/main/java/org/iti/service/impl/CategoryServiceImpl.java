package org.iti.service.impl;

import org.iti.model.dao.daoimpl.CategoryDaoImpl;
import org.iti.model.entity.Category;
import org.iti.service.interfaces.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    CategoryDaoImpl categoryDao = null;

    @Override
    public List<Category> selectAllCategories() {
        return categoryDao.selectAllCategories();
    }
}
