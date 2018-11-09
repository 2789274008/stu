package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAll(){
		return userMapper.findAll();
	}
	public void insert(User user){
		userMapper.insert(user);
	}
	public void update(User user){
		userMapper.update(user);
	}
	public void delete(Integer id){
		userMapper.delete(id);
	}
}
