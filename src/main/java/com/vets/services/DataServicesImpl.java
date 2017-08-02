package com.vets.services;

import java.util.List;

import com.vets.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.vets.dao.DataDao;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(User user) throws Exception {
		return dataDao.addEntity(user);
	}

	@Override
	public User getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<User> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
