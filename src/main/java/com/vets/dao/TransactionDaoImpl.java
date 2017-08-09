package com.vets.dao;
import com.vets.model.Transaction;
//import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



import com.vets.model.User;

public class TransactionDaoImpl implements TransactionDao {

    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    org.hibernate.Transaction tx = null;

    @Override
    public boolean addTransaction(com.vets.model.Transaction transaction) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(transaction);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public com.vets.model.Transaction getTransactionById(long transactionId) throws Exception {
        session = sessionFactory.openSession();
        com.vets.model.Transaction transaction = (com.vets.model.Transaction) session.load(com.vets.model.Transaction.class, transactionId);
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return transaction;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<com.vets.model.Transaction> getTransactionList() throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<com.vets.model.Transaction> transactionList = session.createCriteria(Transaction.class)
                .list();
        tx.commit();
        session.close();
        return transactionList;
    }

    @Override
    public boolean deleteTransaction(long transactionId)
            throws Exception {
        session = sessionFactory.openSession();
        Object o = session.load(com.vets.model.Transaction.class, transactionId);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();
        return false;
    }

}
