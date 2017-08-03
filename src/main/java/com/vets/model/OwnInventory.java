package com.vets.model;

import java.io.Serializable;
import java.text.DateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by beheraa on 8/2/2017.
 */
@Entity
@Table(name = "own_inventory")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class OwnInventory {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue

    @Column(name = "id")
    private long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "variant")
    private String variant;

    @Column(name = "mileage")
    private double mileage;

    @Column(name = "fuel_type")
    private String fuel_type;

    @Column(name = "seating_capacity")
    private int seating_capacity;

    @Column(name = "top_speed")
    private double top_speed;

    @Column(name = "warranty_time")
    private DateFormat warranty_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public int getSeating_capacity() {
        return seating_capacity;
    }

    public void setSeating_capacity(int seating_capacity) {
        this.seating_capacity = seating_capacity;
    }

    public double getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(double top_speed) {
        this.top_speed = top_speed;
    }

    public DateFormat getWarranty_time() {
        return warranty_time;
    }

    public void setWarranty_time(DateFormat warranty_time) {
        this.warranty_time = warranty_time;
    }
}
