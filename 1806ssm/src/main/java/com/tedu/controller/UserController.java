package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.pojo.User;
import com.tedu.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("/list")
	public List<User> findAll(){
		return userService.findAll();
	}
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user){
		try {
			userService.insert(user);
			return "插入成功了！！！！";
		} catch (Exception e) {
			e.printStackTrace();
			return "插入失败";
		}
	}
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user){
		try {
			userService.update(user);
			return "更新成功了！！！！";
		} catch (Exception e) {
			e.printStackTrace();
			return "更新失败";
		}
	}
	@RequestMapping("/delete/{id}")
	public String detele(@PathVariable Integer id){
		try {
			userService.delete(id);
			return "删除成功了！！！！";
		} catch (Exception e) {
			e.printStackTrace();
			return "删除失败";
		}
	}
}
