package com.ssh.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.biz.UsersBiz;
import com.ssh.entity.Users;

/**
 * 
 * ActionSupport已经实现了Action接口，还实现了Validateable接口，提供了数据校验功能。通过继承该ActionSupport类，
 * 可以简化Struts 2的Action开发
 * Actionsupport这个工具类在实现了Action接口的基础上还定义了一个validate()方法,重写该方法
 * ,它会在execute()方法之前执行,如校验失败,会转入input处，必须在配置该Action时配置input属性。
 * 　　另外,Actionsupport还提供了一个getText(String key)方法还实现国际化,该方法从资源文件上获取国际化信息.
 * 这样在自定义标签时可以定义一个变量为new actionsupport对象实现国际化。 　　ActionSupport类的作用
 * struts2不要求我们自己设计的action类继承任何的struts基类或struts接口
 * ，但是我们为了方便实现我们自己的action，大多数情况下都会继承com
 * .opensymphony.xwork2.ActionSupport类，并重写此类里的public String execute() throws
 * Exception方法。 　　因为此类中实现了很多的实用借口，提供了很多默认方法，这些默认方法包括国际化信息的方法、默认的处理用户请求的方法等，
 * 这样可以大大的简化Acion的开发。 　
 * Struts2中通常直接使用Action来封装HTTP请求参数，因此，Action类里还应该包含与请求参数对应的属性
 * ，并且为属性提供对应的getter和setter方法。
 */
public class UsersAction extends ActionSupport {

	/**
	 * 实例化service层,调用具体方法执行
	 */
	private UsersBiz ubiz;

	/**
	 * 实例化user，封装前台的user用户的所有属性
	 */
	private Users user;

	/**
	 * 实例化uaid，用来封装前台的userID
	 */
	private Integer uaid;

	public Integer getUaid() {
		return uaid;
	}

	public void setUaid(Integer uaid) {
		this.uaid = uaid;
	}

	public UsersBiz getUbiz() {
		return ubiz;
	}

	public void setUbiz(UsersBiz ubiz) {
		this.ubiz = ubiz;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	/**
	 * 根据用户来验证登录
	 * 
	 * @return
	 */
	public String checkLogin() {

		Users us = ubiz.findLogin(user);

		if (null != us) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	/**
	 * 查找用户并显示到修改页面
	 * 
	 * @return
	 */
	public String getUserUpdate() {
		Users user = ubiz.queryUserById(uaid);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("user", user);
		System.out.println("&&" + uaid);
		System.out.println("$$" + user.getUname());
		System.out.println("$$" + user.getUpwd());
		if (null != user) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

	/**
	 * 根据user的ID查找该用户
	 * 
	 * @return
	 */
	public String getUserView() {
		Users user = ubiz.queryUserById(uaid);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("user", user);
		if (null != user) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

	/**
	 * 查找所有的用户
	 * 
	 * @return
	 */
	public String getListUsers() {
		List us = ubiz.searchgetUsers();
		Map request = (Map) ActionContext.getContext().get("request");
		if (null != us) {
			System.out.println("!!!!!!!!!!!!!!!!!!");
			request.put("users", us);
			return SUCCESS;
		} else {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
			return ERROR;
		}
	}

	/**
	 * 添加用户
	 * 
	 * @return
	 */
	public String addUser() {
		Integer i = ubiz.addUser(user);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
		if (i > 0) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	/**
	 * 修改用户信息
	 * 
	 * @return
	 */
	public String updateUser() {
		boolean flag = ubiz.updateUser(user);
		if (flag) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	/**
	 * 根据user的ID删除用户信息
	 * 
	 * @return
	 */
	public String deleteUser() {
		boolean flag = ubiz.deleteUserById(uaid);
		if (flag) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}
}
