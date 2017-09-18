package cn.itcast.day23.service.impl;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cn.itcast.day23.dao.UserDao;
import cn.itcast.day23.dao.impl.UserDaoImpl;
import cn.itcast.day23.domain.User;
import cn.itcast.day23.service.UserService;
import cn.itcast.day23.utils.JdbcUtils;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();
	
	
	@Override
	public List<User> getUsersByBirthday(Date today) throws Exception {
		Connection conn = null;
		List<User> list = null;
		
		try{
			conn = JdbcUtils.getConnection();
			conn.setAutoCommit(false);
			
			//day的值 应该是09-17（月-日）的格式
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
			String day = sdf.format(today);
			String condition = " birthday like '%-"+day+"'";

			//调用Dao取得当天生日的用户
			list = userDao.getUsersByCondition(condition);
			
			conn.commit();
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
		}finally{
			JdbcUtils.releaseResource(conn);
		}
		
		return list;
	}

}
