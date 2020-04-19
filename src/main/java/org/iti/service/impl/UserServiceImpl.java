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
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User retriveUser(String mail, String password) {
        return userDao.retriveUser(mail, password);
    }

    @Override
    public User retriveUserByID(int id) {
        return null;
    }

    @Override
    public List<User> retriveAllUsers() {
        return userDao.retriveAllUsers();
    }

    @Override
    public User createUser(User user) {
       return  userDao.createUser(user);
    }

    @Override
    public List<String> allUsernames() {
        return userDao.allUsernames();
    }

    @Override
    public List<String> allEmails() {
        return userDao.allEmails();
    }
}