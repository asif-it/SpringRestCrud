package com.vets.services;

import com.vets.dao.OwnInventoryDao;
import com.vets.model.OwnInventory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by beheraa on 8/2/2017.
 */
public class OwnInventoryServicesImpl implements OwnInventoryServices {

    @Autowired
    OwnInventoryDao ownInventoryDao;

    @Override
    public boolean addEntity(OwnInventory ownInventory) throws Exception {
        return ownInventoryDao.addEntity(ownInventory);
    }

    @Override
    public OwnInventory getEntityById(long id) throws Exception {
        return ownInventoryDao.getEntityById(id);
    }

    @Override
    public List<OwnInventory> getEntityList() throws Exception {
        return ownInventoryDao.getEntityList();
    }

    @Override
    public boolean deleteEntity(long id) throws Exception {
        return ownInventoryDao.deleteEntity(id);
    }

}
