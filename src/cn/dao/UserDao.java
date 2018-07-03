package cn.dao;

import java.util.List;

import cn.pojo.User;

public interface UserDao {
	
	public List<User> findAll();
	
	public int add(User u);
}
