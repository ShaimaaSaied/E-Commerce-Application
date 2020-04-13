package org.iti.service.impl;


import org.iti.model.dao.daoimpl.UserDaoImpl;
import org.iti.model.entity.User;
import org.iti.service.interfaces.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDaoImpl userDao = null;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User retriveUser(String mail, String password) {
        return userDao.retriveUser(mail, password);
    }

    @Override
    public List<User> retriveAllUsers() {
        return userDao.retriveAllUsers();
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }
}