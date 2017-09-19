package cn.itcast.day23.listener;

import cn.itcast.day23.domain.User;
import cn.itcast.day23.service.UserService;
import cn.itcast.day23.service.impl.UserServiceImpl;
import cn.itcast.day23.utils.DateUtils;
import cn.itcast.day23.utils.MailUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class BirthdayListener implements ServletContextListener {
	
	private UserService userService = new UserServiceImpl();
	
	//创建一个计时器，每天零点查看本日生日的用户
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//创建一个计划任务（定时器）
		new Timer().schedule( 
			new TimerTask(){
				@Override
				public void run(){
					//查找今天生日的用户，调用业务逻辑
					List<User> list = null;
					try {
						list = userService.getUsersByBirthday( new Date() );
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					//遍历用户，发送祝贺邮件
					if( list != null ){
						for( User user : list ){
							//发送邮件
							try {
								MailUtils.sendMail( user.getEmail(), "哎呦喂");
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
					
				}
			}
		,200, DateUtils.getOneDay() );	//200毫秒后开始执行，每隔一天执行一次
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
