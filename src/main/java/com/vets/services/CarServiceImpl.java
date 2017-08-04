package com.vets.services;

import com.vets.dao.CarDao;
import com.vets.model.Car;
import com.vets.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mahapata on 8/3/2017.
 */
public class CarServiceImpl implements CarService{
    @Autowired
    CarDao carDao;

    @Override
    public boolean addCar(Car car) throws Exception {
        return carDao.addEntity(car);
    }

    @Override
    public Car getCarById(long carId) throws Exception {
        return carDao.getEntityById(carId);
    }

    @Override
    public List<Car> getCarList() throws Exception {
        return carDao.getEntityList();
    }

    @Override
    public boolean deleteCar(long carId) throws Exception {
        return carDao.deleteEntity(carId);
    }

    @Override
    public List<Car> getEntity(String name) throws Exception {
        return carDao.getEntity(name);
    }
}