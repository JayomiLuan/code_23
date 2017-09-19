package cn.itcast.day23.domain;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * 监听此类对象是否随着Session被钝化和活化的事件，
 * 此类必须实现序列化接口，否则不能被活化和钝化
 * @author Administrator
 *
 */
public class Category implements HttpSessionActivationListener,Serializable{
	
	private String id;
	private String name;
	public Category(){
		super();
	}
	public Category(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**钝化：当服务器正常关闭的时候，可以把Session序列化到磁盘，
	 * 当服务器再次启动的时候，把磁 盘上的序列化的Session恢复到内存
	 * 在进行此操作时，Session中保存的对象，是否可以一起被序列化和反序列化
	 * 就是此接口实现的
	 */
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("===对象被钝化（保存到磁盘）");
	}
	
	//活化
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("===对象被活化（从磁盘读取出来恢复到内存Session中）");
	}
}
