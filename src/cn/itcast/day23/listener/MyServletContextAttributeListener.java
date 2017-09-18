package cn.itcast.day23.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextAttributeListener
 *
 */
@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	/**
     * 监听ServletContext范围内发生的属性添加事件
     */
    public void attributeAdded(ServletContextAttributeEvent scab)  { 
    	String name = scab.getName();
    	Object value = scab.getValue();
    	System.out.println("ServletContext发生属性添加事件：" + name + ":" + value);
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scab)  { 
    	String name = scab.getName();
    	Object value = scab.getValue();
    	System.out.println("ServletContext发生属性替换事件：" + name + ":" + value);
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scab)  { 
    	String name = scab.getName();
    	Object value = scab.getValue();
    	System.out.println("ServletContext发生属性删除事件：" + name + ":" + value);
    }
	
}
