package org.zhuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zhuan.dao.UserDao;
import org.zhuan.domain.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public User getUser(String id){
		return userDao.getUser(id);
	}
}
