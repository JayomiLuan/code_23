package cn.itcast.day23.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class MySessionAttributeListener
 *
 */
@WebListener
public class MySessionAttributeListener implements HttpSessionAttributeListener {

	/**
     * 监听Session范围的属性删除事件
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	String name = se.getName();
    	Object value = se.getValue();
    	System.out.println("Session中的属性被删除了." + name + ":" + value);
    }

	/**
     * 属性添加
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
    	String name = se.getName();
    	Object value = se.getValue();
    	System.out.println("Session中的属性添加." + name + ":" + value);
    }

	/**
     * 属性替换
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	String name = se.getName();
    	Object value = se.getValue();
    	System.out.println("Session中的属性被替换了." + name + ":" + value);
    }
	
}
