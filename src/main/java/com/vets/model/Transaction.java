package com.vets.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "transaction")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue
    @Column(name = "transaction_id")
    private long transaction_id;

    @Column(name = "buyer_id")
    private long buyer_id;

    @Column(name = "seller_id")
    private long seller_id;

    @Column(name = "price")
    private double price;

    //@Column(name = "transaction_date")
    //private Date transaction_date;

    @Column(name = "vehicle_id")
    private int vehicle_id;

    public Transaction(){
        System.out.println("in Transaction constructor....");
    }

    public Transaction(long transaction_id,long buyer_id,long seller_id,double price/*,Date transaction_date*/,int vehicle_id){
        System.out.println("in Transaction constructor1111....");
        this.transaction_id=transaction_id;
        this.buyer_id=buyer_id;
        this.seller_id=seller_id;
        this.price=price;
       // this.transaction_date=transaction_date;
        this.vehicle_id=vehicle_id;
    }
    
    public long getTransaction_id() {
        System.out.println("in 1");
        return transaction_id;
    }

    public void setTransaction_id(long transaction_id) {
        System.out.println("in 2");
        this.transaction_id = transaction_id;
    }

    public long getBuyer_id() {
        System.out.println("in 3"); return buyer_id;
    }

    public void setBuyer_id(long buyer_id) {
        System.out.println("in 4"); this.buyer_id = buyer_id;
    }

    public long getSeller_id() {
        System.out.println("in 5"); return seller_id;
    }

    public void setSeller_id(long seller_id) {
        System.out.println("in 6"); this.seller_id = seller_id;
    }

    public double getPrice() {
        System.out.println("in 7"); return price;
    }

    public void setPrice(double price) {
        System.out.println("in 8"); this.price = price;
    }
/*
    public Date getTransaction_date() {
        System.out.println("in 9");return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        System.out.println("in 10");this.transaction_date = new  Date(); //transaction_date;
    }
*/
    public int getvehicle_id() {
        System.out.println("in 11"); return vehicle_id;
    }

    public void setvehicle_id(int vehicle_id) {
        System.out.println("in 12"); this.vehicle_id = vehicle_id;
    }
    
    public void commit(){
        
    }
}
