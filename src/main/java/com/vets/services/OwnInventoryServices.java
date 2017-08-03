package com.vets.services;

import com.vets.model.OwnInventory;

import java.util.List;

/**
 * Created by beheraa on 8/2/2017.
 */
public interface OwnInventoryServices {
    public boolean addEntity(OwnInventory user) throws Exception;
    public OwnInventory getEntityById(long id) throws Exception;
    public List<OwnInventory> getEntityList() throws Exception;
    public boolean deleteEntity(long id) throws Exception;
}
