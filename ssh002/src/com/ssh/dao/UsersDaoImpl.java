package com.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.entity.Users;

public class UsersDaoImpl extends HibernateDaoSupport implements UsersDao {

	@Override
	public Users checkLogin(Users user) {
		// TODO Auto-generated method stub

		HibernateTemplate ht = this.getHibernateTemplate();
		List users = ht.find("from Users u where u.uname=? and u.upwd=?",
				new String[] { user.getUname(), user.getUpwd() });
		if (users != null && users.size() > 0) {
			return (Users) users.get(0);
		} else {
			return null;
		}
		
		
		/*System.out.println("######################");
		return this.getHibernateTemplate().get(Users.class, user);
	*/
	}

	@Override
	public List getUsers() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Users");
	}

	@Override
	public Integer addUser(Users user) {
		// TODO Auto-generated method stub
		return (Integer) this.getHibernateTemplate().save(user);
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public void deleteUser(Integer uid) {
		// TODO Auto-generated method stub
		Users user=this.getHibernateTemplate().get(Users.class, uid);
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public Users findUserById(Integer uid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Users.class, uid);
	}

}
