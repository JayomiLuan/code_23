package cn.itcast.day23.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyRequestAttributeListener implements ServletRequestAttributeListener {

	//监听Request范围内发生的属性添加事件
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		Object value = srae.getValue();
		System.out.println("request中添加了一个属性:" + value);
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		Object value = srae.getValue();
		System.out.println("request中删除了一个属性：" + value);
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		Object value = srae.getValue();
		System.out.println("request中替换了一个属性：" + value);
	}

}
