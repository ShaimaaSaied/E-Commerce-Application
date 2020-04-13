package org.iti.model.dao.interfaces;

import org.iti.model.entity.Category;

import java.util.List;

public interface CategoryDao {
    /***
     * select all categories
     * @return List<Category>
     */
    List<Category> selectAllCategories();
}
