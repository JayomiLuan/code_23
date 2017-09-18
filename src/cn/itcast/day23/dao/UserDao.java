package cn.itcast.day23.dao;

import java.util.List;

import cn.itcast.day23.domain.User;

public interface UserDao {
	List<User> getUsersByCondition( String condition ) throws Exception;
}
