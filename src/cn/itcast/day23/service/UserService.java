package cn.itcast.day23.service;

import java.util.Date;
import java.util.List;

import cn.itcast.day23.domain.User;

public interface UserService {
	//取得指定日期生日的用户集合
	List<User> getUsersByBirthday( Date today ) throws Exception;
}
