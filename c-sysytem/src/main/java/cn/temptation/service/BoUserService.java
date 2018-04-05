package cn.temptation.service;

import cn.temptation.entity.BoUser;

public interface BoUserService {
	
	public BoUser findByUsername(String userAccount);
	
}
