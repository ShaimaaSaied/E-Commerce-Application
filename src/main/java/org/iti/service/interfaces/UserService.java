package org.iti.service.interfaces;

import org.iti.model.entity.User;

import java.util.List;

public interface UserService {

    int deleteUser(int id);

    User updateUser(User user);

    User retriveUser(String mail, String password);

    User retriveUserByID(int id);

    List<User> retriveAllUsers();

    User createUser(User user);

    List<String> allUsernames();

    public List<String> allEmails();
}
