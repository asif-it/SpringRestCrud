package com.vets.controller;

import java.util.List;

import com.vets.model.Transaction;
import com.vets.model.User;
import com.vets.services.TransactionService;
import org.apache.log4j.Logger;
import com.vets.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    static final Logger logger = Logger.getLogger(TransactionController.class);

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addTransaction(@RequestBody Transaction transaction) {
        try {
            transactionService.addTransaction(transaction);
            return new Status(1, "Transaction added Successfully !");
        } catch (Exception e) {
            // e.printStackTrace();
            return new Status(0, e.toString());
        }
    }

    @RequestMapping(value = "/{transactionid}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Transaction getTransaction(@PathVariable("transactionid") long transactionId) {
        Transaction transaction = null;
        try {
            transaction = transactionService.getTransactionById(transactionId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return transaction;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Transaction> getTransaction() {
        List<Transaction> transactionList = null;
        try {
            transactionList = transactionService.getTransactionList();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return transactionList;
    }

    @RequestMapping(value = "delete/{transactionid}", method = RequestMethod.GET,consumes = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    Status deleteTransaction(@PathVariable("id") long transactionId) {
        try {
            transactionService.deleteTransaction(transactionId);
            return new Status(1, "Transaction deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }
}
