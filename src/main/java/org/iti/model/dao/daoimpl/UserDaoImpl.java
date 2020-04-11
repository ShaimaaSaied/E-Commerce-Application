package org.iti.model.dao.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.iti.model.confg.DBConnection;
import org.iti.model.dao.interfaces.UserDao;
import org.iti.model.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory = null;

    private final String RETRIVE_USER_BY_EMAIL_AND_PASSWORD = "from org.iti.model.entity.User as u where u.email=:name and u.password=:pass";
    private final String RETRIVE_ALL_USERS = "FROM org.iti.model.entity.User";
    private final String DELETE_USER = "delete from org.iti.model.entity.User where userId=:user_id";
    private final String UPDATE_USER = "update org.iti.model.entity.User u set u.firstName=:firstName," +
            "u.lastName=:lastName, u.username=:username, u.password=:password,u.email=:email,u.address=:address," +
            "u.jop=:jop ,u.role=:role where u.userId=:userId";

    public UserDaoImpl() {
        sessionFactory = DBConnection.getInstance();
    }

    @Override
    public int deleteUser(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        int res = session.createQuery(DELETE_USER).setParameter("user_id", id).executeUpdate();
        session.getTransaction().commit();
        System.out.println("delete Successfully");
        return res;
    }

    @Override
    public int updateUser(User user) {
        Session session = sessionFactory.openSession();
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
                .setParameter("userId", user.getUserId());
        int result = query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("update Successfully");
        return result;
    }

    @Override
    public User retriveUser(String mail, String password) {
        User user = null;
        user = (User) sessionFactory.openSession().createQuery(RETRIVE_USER_BY_EMAIL_AND_PASSWORD).
                setParameter("name", mail).setParameter("pass", password).uniqueResult();
        return user;
    }

    @Override
    public List<User> retriveAllUsers() {
        List<User> list = null;
        list = sessionFactory.openSession().createQuery(RETRIVE_ALL_USERS).list();
        return list;
    }


    @Override
    public void createUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        System.out.println("insert Successfully");
    }

}
