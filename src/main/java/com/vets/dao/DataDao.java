package com.vets.dao;

import java.util.List;

import com.vets.model.User;

public interface DataDao {

	public boolean addEntity(User user) throws Exception;
	public User getEntityById(long id) throws Exception;
	public List<User> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
