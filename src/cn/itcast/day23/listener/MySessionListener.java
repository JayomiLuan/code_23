package cn.itcast.day23.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

	/**
     * Session对象的创建事件被监听到时调用此方法
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("产生了一个会话。。。");
    	//可以通过事件对象得到发生此事件的Session对象
    	//HttpSesseion session = se.getSession();
    }

    /**
     * 超过指定的Session过期时间，会话结束（默认30分钟）
     * 服务器非正常关闭
     * 手动关闭session.invalidate()
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("会话结束。。。");
    }
	
}
