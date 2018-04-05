package cn.temptation.dao;

import cn.temptation.entity.BoUser;

public interface BoUserDao {

	BoUser findByUsername(String userAccount);

}
