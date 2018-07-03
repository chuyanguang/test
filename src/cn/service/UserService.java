package cn.service;

import java.util.List;

import cn.pojo.User;

public interface UserService {
	
	public List<User> find();
	
	public int add(User u);
}
