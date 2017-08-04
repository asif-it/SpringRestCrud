package com.vets.services;

import com.vets.model.Car;
import com.vets.model.Transaction;

import java.util.List;

/**
 * Created by mahapata on 8/3/2017.
 */
public interface CarService {
    boolean addCar(Car car) throws Exception;
    Car getCarById(long carId) throws Exception;
    List<Car> getCarList() throws Exception;
    boolean deleteCar(long carId) throws Exception;
    List<Car> getEntity(String name) throws Exception;
}
