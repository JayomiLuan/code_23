package cn.itcast.day23.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 此监听器只在服务器启动时监听到启动事件，并执行contextInitialized方法一次
 * 所以适合做项目资源的初始化操作
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	/**
     * 监听WEB服务的启动（一般是随Tomcat启动而启动）
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	String contextPath = sce.getServletContext().getContextPath();
    	System.out.println( contextPath + " 服务器启动了！");
    }

	/**
     * 监听WEB服务的关闭
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	String contextPath = sce.getServletContext().getContextPath();
    	System.out.println( contextPath + " 服务器关闭了！");
    }
	
}
