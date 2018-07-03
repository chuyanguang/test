package cn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.UserDao;
import cn.pojo.User;
import cn.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> find() {
		return userDao.findAll();
	}

	@Override
	public int add(User u) {
		return userDao.add(u);
	}

}
