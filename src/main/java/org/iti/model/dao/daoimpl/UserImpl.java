package org.iti.model.dao.daoimpl;

import org.hibernate.SessionFactory;
import org.iti.model.dao.interfaces.User;

import java.util.List;

public class UserImpl implements User {

    private SessionFactory sessionFactory = null;

    private final String AUTHENTICATE = "";
    private final String SELECT_ALL_USERS = "";
    private final String SELECT_USERS_BY_ID = "";
    private final String SELECT_USER_BY_USERNAME = "";
    private final String ADD_USER = "";
    private final String ADD_ADMIN = "";
    private final String DELETE_USER = "";
    private final String UPDATE_USER = "";

    @Override
    public boolean authenticate(String email, String password) {

        return false;
    }

    @Override
    public List<User> selectAllUsers() {

        return null;
    }

    @Override
    public User selectUserById(int id) {

        return null;
    }

    @Override
    public User selectUserByUsername(String username) {
        return null;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean addAdmin(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }
}
