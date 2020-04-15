package org.iti.model.dao.interfaces;

import org.iti.model.entity.User;

import java.util.List;

public interface UserDao {

    int deleteUser(int id);

    int updateUser(User user);

    User retriveUser(String mail, String password);

    List<User> retriveAllUsers();


    void createUser(User user);

    List<String> allUsernames();

    List<String> allEmails();
}
