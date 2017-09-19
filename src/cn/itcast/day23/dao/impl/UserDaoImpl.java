package cn.itcast.day23.dao.impl;

import cn.itcast.day23.dao.UserDao;
import cn.itcast.day23.domain.User;
import cn.itcast.day23.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.util.List;

public class UserDaoImpl implements UserDao {

	private QueryRunner queryRunner = new QueryRunner();
	
	//参数condition是由Service生成的查询本日生日的用户的条件
	@Override
	public List<User> getUsersByCondition(String condition) throws Exception {
		Connection conn = JdbcUtils.getConnection();
		String sql = "select id,name,password,birthday,email from tb_user where " + condition;
		System.out.println("sql:" + sql);
		List<User> list = queryRunner.query(conn , sql , new BeanListHandler<>(User.class) );
		
		return list;
	}

}
