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
    List<Car> getCarList(String keyword) throws Exception;
    List<Car> getUsedCarList() throws Exception;
    List<Car> getUsedCarList(int top) throws Exception;
    List<Car> getNewCarList() throws Exception;
    List<Car> getNewCarList(int top) throws Exception;
    boolean deleteCar(long carId) throws Exception;
}
