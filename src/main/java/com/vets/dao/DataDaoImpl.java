package com.vets.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.vets.model.User;

public class DataDaoImpl implements DataDao {

    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;

    @Override
    public boolean addEntity(User user) throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public User getEntityById(long id) throws Exception {
        session = sessionFactory.openSession();
        User user = (User) session.load(User.class,id);
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return user;
    }

    @Override
    public User getEntityByName(String username) throws Exception {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM User U where U.username=:username");
        query.setParameter("username", username);
        tx = session.getTransaction();
        User user= (User) query.list().get(0);
        tx.commit();
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override

    public List<User> getEntityList() throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<User> userList = session.createCriteria(User.class)
                .list();
        tx.commit();
        session.close();
        return userList;
    }

    @Override
    public boolean deleteEntity(long id)
            throws Exception {
        session = sessionFactory.openSession();
        Object o = session.load(User.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();
        return false;
    }

    @Override
    public boolean isAuthenticated(String username, String password)
            throws Exception {
        System.out.println("in isAuthenticated");
        session = sessionFactory.openSession();
//		tx = session.getTransaction();
        session.beginTransaction();
        Query query = session.createQuery("FROM User U where U.username=:username and U.password=:password");
        query.setParameter("username", username);
        query.setParameter("password", password);
//		tx.commit();
        return (query.list().size() > 0);
    }
}
