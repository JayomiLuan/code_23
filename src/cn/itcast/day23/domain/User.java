package cn.itcast.day23.domain;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.Date;


public class User implements HttpSessionBindingListener {
	private String id;
	private String name;
	private String password;
	private Date birthday;
	private String email;
	
	public User(){
		super();
	}
	
	public User(String id, String name, String password , Date birthday ,String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.email = email;
	}

	public User(String id, String name, String password ) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//监听绑定事件
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("User对象和Session绑定啦~~");
	}
	
	//监听解绑事件
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("User对象和Session解绑啦~~");
	}

}
