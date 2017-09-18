package cn.itcast.day23.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * 请求的监听器，可以监听到请求的到达和销毁
 * @author Administrator
 *
 */
public class MyRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("===请求结束");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("===服务器发生了请求");
		//HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
		
		
	}

}
