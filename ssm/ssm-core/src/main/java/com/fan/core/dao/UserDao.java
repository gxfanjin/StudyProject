package com.fan.core.dao;

import java.util.List;

import com.fan.core.entity.UserEntity;

public interface UserDao{

	public List<UserEntity> findAll();
}
