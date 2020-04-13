package org.iti.service.impl;

import org.iti.model.entity.User;
import org.iti.service.interfaces.UserService;

public class Test {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user = new User("****mariamragabjjjjj3", "123", "***marijjjjamgfh444jQ@yahoo.com", 1234);
        user.setRole("User");
        //user.setUserId(2);
        userService.createUser(user);
//        System.out.println(userService.retriveAllUsers());
//        System.out.println(userService.retriveUser("mariamgfhjQ@yahoo.com","123"));
        //System.out.println(userService.deleteUser(10));
        System.out.println(userService.updateUser(user));


    }
}
