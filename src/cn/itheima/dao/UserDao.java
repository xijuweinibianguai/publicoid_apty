package cn.itheima.dao;

import cn.itheima.domain.User;

public interface UserDao {
	//根据登录名返回User
	User getByUserCode(String user_code);

}
