package com.vets.services;

import java.util.List;

import com.vets.dao.TransactionDao;
import com.vets.model.Transaction;
import com.vets.model.User;
import org.springframework.beans.factory.annotation.Autowired;



public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionDao transactionDao;

    @Override
    public boolean addTransaction(Transaction transaction) throws Exception {
        return transactionDao.addTransaction(transaction);
    }

    @Override
    public Transaction getTransactionById(long transactionId) throws Exception {
        return transactionDao.getTransactionById(transactionId);
    }

    @Override
    public List<Transaction> getTransactionList() throws Exception {
        return transactionDao.getTransactionList();
    }

    @Override
    public boolean deleteTransaction(long transactionId) throws Exception {
        return transactionDao.deleteTransaction(transactionId);
    }

}
