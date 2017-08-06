package com.vets.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vijayn on 8/2/2017.
 */
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name="model_name")
    private String model_name;

    @Column(name="brand_name")
    private String brand_name;

    @Column(name="engine")
    private String engine;

    @Column(name = "city")
    private String city;

    @Column(name = "fuel")
    private String fuel;

    @Column(name = "odo_reading")
    private String odo_reading;

    @Column(name = "color")
    private String color;

    @Column(name = "no_of_owners")
    private int no_of_owners;

    @Column(name = "power_steering")
    private boolean power_steering;

    @Column(name = "insurance")
    private String insurance;

    @Column(name = "insurance_expiry")
    private Date insurance_expiry;

    @Column(name = "manufacturing_year")
    private int manufacturing_year;

    @Column(name = "registration_type")
    private String registration_type;

    @Column(name = "rto_location")
    private String rto_location;

    @Column(name = "date_of_reg_on_website")
    private Date date_of_reg_on_website;

    @Column(name="mileage")
    private double mileage;

    @Column(name = "seating_capacity")
    private int seating_capacity;

    @Column(name = "owned_by")
    private long owned_by;

    public Car(){
    }

    public Car(String model_name,String brand_name,String engine,String city,String fuel,String odo_reading,String color,int no_of_owners,boolean power_steering,String insurance,Date insurance_expiry,int manufacturing_year,String registration_type,String rto_location,Date date_of_reg_on_website,Double mileage,int seating_capacity,int owned_by){
      this.model_name=model_name;
      this.brand_name=brand_name;
      this.engine=engine;
      this.city=city;
      this.fuel=fuel;
      this.odo_reading=odo_reading;
      this.color=color;
      this.no_of_owners=no_of_owners;
      this.power_steering=power_steering;
      this.insurance=insurance;
      this.insurance_expiry=insurance_expiry;
      this.manufacturing_year=manufacturing_year;
      this.registration_type=registration_type;
      this.rto_location=rto_location;
      this.date_of_reg_on_website=date_of_reg_on_website;
      this.mileage=mileage;
      this.seating_capacity=seating_capacity;
      this.owned_by=owned_by;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Date getDate_of_reg_on_website() {
        return date_of_reg_on_website;
    }

    public void setDate_of_reg_on_website(Date date_of_reg_on_website) {
        this.date_of_reg_on_website = date_of_reg_on_website;
    }

    public long getOwned_by() {
        return owned_by;
    }

    public void setOwned_by(long owned_by) {
        this.owned_by = owned_by;
    }

    public int getSeating_capacity() {
        return seating_capacity;
    }

    public void setSeating_capacity(int seating_capacity) {
        this.seating_capacity = seating_capacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Date getDate_of_regOnWebsite() {
        return date_of_reg_on_website;
    }

    public void setDate_of_regOnWebsite(Date date_of_regOnWebsite) {
        this.date_of_reg_on_website = date_of_regOnWebsite;
    }

    public String getRto_location() {
        return rto_location;
    }

    public void setRto_location(String rto_location) {
        this.rto_location = rto_location;
    }

    public String getRegistration_type() {
        return registration_type;
    }

    public void setRegistration_type(String registration_type) {
        this.registration_type = registration_type;
    }

    public int getManufacturing_year() {
        return manufacturing_year;
    }

    public void setManufacturing_year(int manufacturing_year) {
        this.manufacturing_year = manufacturing_year;
    }

    public Date getInsurance_expiry() {
        return insurance_expiry;
    }

    public void setInsurance_expiry(Date insurance_expiry) {
        this.insurance_expiry = insurance_expiry;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public boolean isPower_steering() {
        return power_steering;
    }

    public void setPower_steering(boolean power_steering) {
        this.power_steering = power_steering;
    }

    public int getNo_of_owners() {
        return no_of_owners;
    }

    public void setNo_of_owners(int no_of_owners) {
        this.no_of_owners = no_of_owners;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOdo_reading() {
        return odo_reading;
    }

    public void setOdo_reading(String odo_reading) {
        this.odo_reading = odo_reading;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
}
