package com.vets.dao;

import java.util.List;
import com.vets.model.Car;
import com.vets.model.User;

/**
 * Created by vijayn on 8/3/2017.
 */
public interface CarDao {
    public boolean addEntity(Car car) throws Exception;
    public Car getEntityById(long id) throws Exception;
    public long getUserIdByCarId(long car_id) throws Exception;
    public List<Car> getEntityList() throws Exception;
    public List<Car> getEntityList(String keyword) throws Exception;
    public boolean deleteEntity(long id) throws Exception;
    public List<Car> getUsedEntityList() throws Exception;
    public List<Car> getNewEntityList() throws Exception;
    public List<Car> getUsedEntityList(int top) throws Exception;
    public List<Car> getNewEntityList(int top) throws Exception;
    public List<Car> getMyCars(String username) throws Exception;
}
