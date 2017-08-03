package com.vets.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vijayn on 8/2/2017.
 */
@Entity
@Table(name = "Cars")
public class Car {
    @Column(name = "city")
    String city;
    @Column(name = "fuel")
    Fuel fuel;
    @Column(name = "odoReading")
    String odoReading;
    @Column(name = "color")
    String color;
    @Column(name = "noOfOwners")
    int noOfOwners;
    @Column(name = "powerSteering")
    boolean powerSteering;
    @Column(name = "insurance")
    String insurance;
    @Column(name = "ensuranceExpiry")
    Date ensuranceExpiry;
    @Column(name = "manufacturingYear")
    int manufacturingYear;
    @Column(name = "registrationData")
    Date registrationData;
    @Column(name = "registrationType")
    String registrationType;
    @Column(name = "RTO_Location")
    String RTO_Location;
    @Column(name = "dateOfRegOnWebsite")
    Date dateOfRegOnWebsite;
    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;
    public Car(int id,String city, Fuel fuel, String odoReading, String color, int noOfOwners, boolean powerSteering, String insurance, Date ensuranceExpiry, int manufacturingYear, Date registrationData, String registrationType, String RTO_Location, Date dateOfRegOnWebsite) {
        this.id = id;
        this.city = city;
        this.fuel = fuel;
        this.odoReading = odoReading;
        this.color = color;
        this.noOfOwners = noOfOwners;
        this.powerSteering = powerSteering;
        this.insurance = insurance;
        this.ensuranceExpiry = ensuranceExpiry;
        this.manufacturingYear = manufacturingYear;
        this.registrationData = registrationData;
        this.registrationType = registrationType;
        this.RTO_Location = RTO_Location;
        this.dateOfRegOnWebsite = dateOfRegOnWebsite;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Fuel getFuel() {
        return fuel;
    }
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public String getOdoReading() {
        return odoReading;
    }

    public void setOdoReading(String odoReading) {
        this.odoReading = odoReading;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfOwners() {
        return noOfOwners;
    }

    public void setNoOfOwners(int noOfOwners) {
        this.noOfOwners = noOfOwners;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public Date getEnsuranceExpiry() {
        return ensuranceExpiry;
    }

    public void setEnsuranceExpiry(Date ensuranceExpiry) {
        this.ensuranceExpiry = ensuranceExpiry;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public Date getRegistrationData() {
        return registrationData;
    }

    public void setRegistrationData(Date registrationData) {
        this.registrationData = registrationData;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public String getRTO_Location() {
        return RTO_Location;
    }

    public void setRTO_Location(String RTO_Location) {
        this.RTO_Location = RTO_Location;
    }

    public Date getDateOfRegOnWebsite() {
        return dateOfRegOnWebsite;
    }

    public void setDateOfRegOnWebsite(Date dateOfRegOnWebsite) {
        this.dateOfRegOnWebsite = dateOfRegOnWebsite;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
