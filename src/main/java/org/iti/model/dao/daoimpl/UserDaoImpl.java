package org.iti.model.dao.daoimpl;

import org.hibernate.Session;
import org.iti.model.confg.DBConnection;
import org.iti.model.dao.interfaces.UserDao;
import org.iti.model.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private Session session = null;

    private final String RETRIVE_USER_BY_EMAIL_AND_PASSWORD = "SELECT  u from org.iti.model.entity.User u where u.email=:name and u.password=:pass";
    private final String RETRIVE_ALL_USERS = "FROM org.iti.model.entity.User";
    private final String DELETE_USER = "delete from org.iti.model.entity.User where userId=:user_id";
    private final String UPDATE_USER = "update org.iti.model.entity.User u set u.firstName=:firstName," +
            "u.lastName=:lastName, u.username=:username, u.password=:password,u.email=:email,u.address=:address," +
            "u.jop=:jop ,u.role=:role ,u.creditLimit=:creditLimit where u.userId=:userId";

    private final String RETRIVE_ALL_MAIL = "select email FROM org.iti.model.entity.User";
    private final String RETRIVE_ALL_USERNAME = "select username FROM org.iti.model.entity.User";

    private final String RETRIVE_USER_BY_ID = "from org.iti.model.entity.User as u where u.userId=:user_id";


    public UserDaoImpl() {
        session = DBConnection.getInstance();
    }

    @Override
    public int deleteUser(int id) {
        session.beginTransaction();
        int res = session.createQuery(DELETE_USER).setParameter("user_id", id).executeUpdate();
        session.getTransaction().commit();
        System.out.println("delete Successfully");
        return res;
    }

    @Override
    public User updateUser(User user) {
        session.beginTransaction();
        Query query = session.createQuery(UPDATE_USER).
                setParameter("firstName", user.getFirstName())
                .setParameter("lastName", user.getLastName())
                .setParameter("username", user.getUsername())
                .setParameter("password", user.getPassword())
                .setParameter("email", user.getEmail())
                .setParameter("address", user.getAddress())
                .setParameter("jop", user.getJop())
                .setParameter("role", user.getRole())
                .setParameter("userId", user.getUserId())
                .setParameter("creditLimit", user.getCreditLimit());
//        session.merge(user);
        int result = query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("update Successfully");
        return user;
    }

    @Override
    public User retriveUser(String mail, String password) {
        User user = null;
        user = (User) session.createQuery(RETRIVE_USER_BY_EMAIL_AND_PASSWORD).
                setParameter("name", mail).setParameter("pass", password).uniqueResult();
        return user;
    }

    @Override
    public User retriveUserByID(int id) {
        User user = null;
        user = (User) session.createQuery(RETRIVE_USER_BY_ID).
                setParameter("user_id",id).uniqueResult();
        return user;
    }

    @Override
    public List<User> retriveAllUsers() {
        List<User> list = null;
        list = session.createQuery(RETRIVE_ALL_USERS).list();
        return list;
    }




    @Override
    public User createUser(User user) {
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        System.out.println("insert Successfully");
        return user;
    }

    @Override
    public List<String> allUsernames() {
        List<String> username = session.createQuery(RETRIVE_ALL_USERNAME).list();
        return username;
    }

    @Override
    public List<String> allEmails() {
        List<String> mails = session.createQuery(RETRIVE_ALL_MAIL).list();
        return mails;
    }
}
