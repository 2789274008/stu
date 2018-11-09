package com.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.tedu.pojo.User;

public interface UserMapper {
	// 查
	@Select("select * from user")
	public List<User> findAll();

	// 增
	@Insert("INSERT INTO USER" + " (NAME,birthday,address)" + " VALUES(#{user.name},#{user.birthday},#{user.address})")
	public void insert(@Param("user") User user);

	// 改
	@Update("update user set name=#{user.name},birthday=#{user.birthday},address=#{user.address}"
			+ "where id=#{user.id}  ")
	public void update(@Param("user") User user);

	// 删
	@Delete("delete from user where id=#{id}")
	public void delete(Integer id);
}
