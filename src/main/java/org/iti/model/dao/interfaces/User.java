package org.iti.model.dao.interfaces;

import java.util.List;

public interface User {
    /***
     * authenticate a user by email and password for login
     * @param email
     * @param password
     * @return
     */
    boolean authenticate(String email, String password);

    /***
     * select all users
     * @return
     */
    List<User> selectAllUsers();

    /***
     * select user by id
     * @param id
     * @return
     */
    User selectUserById(int id);

    /***
     * select user by username
     * @param username
     * @return
     */
    User selectUserByUsername(String username);

    /***
     * add user as ordinary User
     * @param user
     */
    boolean addUser(User user);

    /***
     *add user as admin
     * @param user
     * @return
     */
    boolean addAdmin(User user);

    /***
     * delete user
     * @param user
     * @return
     */
    boolean deleteUser(User user);

    /***
     * update user
     * @param user
     * @return
     */
    boolean updateUser(User user);

}
