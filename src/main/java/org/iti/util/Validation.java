package org.iti.util;

import org.iti.service.impl.UserServiceImpl;
import org.iti.service.interfaces.UserService;

import java.util.List;

// contain two method
public class Validation {

    UserService userService = new UserServiceImpl();

    public boolean isUsernameUnique(String username) {
        List<String> names = userService.allUsernames();
        return !(names.stream().anyMatch(s -> s.equalsIgnoreCase(username)));
    }

    public boolean isEmailUnique(String email) {
        List<String> emails = userService.allEmails();
        return !(emails.stream().anyMatch(e -> e.equalsIgnoreCase(email)));
    }

    public static void main(String[] args) {
        System.out.println(new Validation().isUsernameUnique("mariam"));
        System.out.println(new Validation().isEmailUnique("II"));
    }
}


