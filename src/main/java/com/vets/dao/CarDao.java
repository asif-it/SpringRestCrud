package com.vets.dao;

import java.util.List;
import com.vets.model.Car;
/**
 * Created by vijayn on 8/3/2017.
 */
public interface CarDao {
    public boolean addEntity(Car car) throws Exception;
    public Car getEntityById(long id) throws Exception;
    public List<Car> getEntityList() throws Exception;
    public boolean deleteEntity(long id) throws Exception;

}
