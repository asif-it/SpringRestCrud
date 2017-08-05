package com.vets.dao;

import com.vets.model.Car;
import oracle.jrockit.jfr.parser.ChunkParser;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by vijayn on 8/3/2017.
 */
public class CarDaoImpl implements CarDao {
    @Autowired
    SessionFactory sessionFactory;
    Session session = null;
    Transaction tx = null;

    @Override
    public boolean addEntity(Car car) throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(car);
        tx.commit();
        session.close();
        return true;
    }

    @Override
    public Car getEntityById(long id) throws Exception {
        session = sessionFactory.openSession();
        session.beginTransaction();
//        Car car = (Car) session.load(Car.class, id);
        Query query = session.createQuery("FROM Car C where C.id=:id");
        query.setParameter("id", id);
        tx = session.getTransaction();
//        session.beginTransaction();
        Car car = (Car) query.list().get(0);
        tx.commit();
        return car;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Car> getEntityList() throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Car> carList = session.createCriteria(Car.class)
                .list();
        tx.commit();
        session.close();
        return carList;
    }

    @SuppressWarnings("unchecked")

    public List<Car> getEntity(String name) throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Car> carList = session.createQuery("FROM CARS C where c.model_name like '%" + name + "'").list();
        tx.commit();
        session.close();

        return carList;
    }

    @Override
    public boolean deleteEntity(long id)
            throws Exception {
        session = sessionFactory.openSession();
        Object o = session.load(Car.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Car> getUsedEntityList() throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Car> carList = session.createQuery("FROM Car C where C.odo_reading > 0").list();
        tx.commit();
        session.close();
        return carList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Car> getNewEntityList() throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Car> carList = session.createQuery("FROM Car C where C.odo_reading <= 0").list();
        tx.commit();
        session.close();
        return carList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Car> getMyCars(String username) throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Integer> user = session.createQuery("SELECT id FROM User U where U.username = "+username).list();
        List<Car> carList = session.createQuery("FROM Car C where C.owned_by = "+user.get(0)).list();
        tx.commit();
        session.close();
        return carList;
    }
}
