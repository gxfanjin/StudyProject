package com.fan.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fan.core.dao.UserDao;
import com.fan.core.entity.UserEntity;
import com.fan.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserEntity> findAll() {
		return userDao.findAll();
	}

}
