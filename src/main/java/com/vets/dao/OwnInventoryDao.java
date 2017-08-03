package com.vets.dao;

import com.vets.model.OwnInventory;

import java.util.List;

/**
 * Created by beheraa on 8/2/2017.
 */
public interface OwnInventoryDao {

    public boolean addEntity(OwnInventory ownInventory) throws Exception;
    public OwnInventory getEntityById(long id) throws Exception;
    public List<OwnInventory> getEntityList() throws Exception;
    public boolean deleteEntity(long id) throws Exception;

}
