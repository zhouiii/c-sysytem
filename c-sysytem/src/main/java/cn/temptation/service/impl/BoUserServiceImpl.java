package cn.temptation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.temptation.dao.BoUserDao;
import cn.temptation.entity.BoUser;
import cn.temptation.service.BoUserService;

@Service
public class BoUserServiceImpl implements BoUserService{
	@Autowired
	private BoUserDao boUserDao;

	@Override
	public BoUser findByUsername(String userAccount) {
		return boUserDao.findByUsername(userAccount);
	}

}
