package com.vets.dao;

import com.vets.model.OwnInventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by beheraa on 8/2/2017.
 */
public class OwnInventoryDaoImpl implements OwnInventoryDao{

    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;

    @Override
    public boolean addEntity(OwnInventory ownInventory) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(ownInventory);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public OwnInventory getEntityById(long id) throws Exception {
        session = sessionFactory.openSession();
        OwnInventory user = (OwnInventory) session.load(OwnInventory.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<OwnInventory> getEntityList() throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<OwnInventory> ownInventoryList = session.createCriteria(OwnInventory.class).list();
        tx.commit();
        session.close();
        return ownInventoryList;
    }

    @Override
    public boolean deleteEntity(long id)
            throws Exception {
        session = sessionFactory.openSession();
        Object o = session.load(OwnInventory.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();
        return false;
    }
}
