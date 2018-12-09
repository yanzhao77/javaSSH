package com.ssh.biz;

import java.util.List;

import com.ssh.dao.UsersDao;
import com.ssh.entity.Users;

public class UsersBizImpl implements UsersBiz {

	private UsersDao udao;

	public UsersDao getUdao() {
		return udao;
	}

	public void setUdao(UsersDao udao) {
		this.udao = udao;
	}

	@Override
	public Users findLogin(Users user) {
		// TODO Auto-generated method stub
		System.out.println("$$$$$$$$$$$$");
		return udao.checkLogin(user);
	}

	@Override
	public List searchgetUsers() {
		// TODO Auto-generated method stub
		return udao.getUsers();
	}

	@Override
	public Users queryUserById(Integer uid) {
		// TODO Auto-generated method stub
		return udao.findUserById(uid);
	}

	@Override
	public Integer addUser(Users user) {
		// TODO Auto-generated method stub
		return udao.addUser(user);
	}

	@Override
	public boolean updateUser(Users user) {
		
		try {
			udao.updateUser(user);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteUserById(Integer uid) {
		// TODO Auto-generated method stub

		try {
			udao.deleteUser(uid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated cay
			
			e.printStackTrace();
			return false;
		}

	}

}
