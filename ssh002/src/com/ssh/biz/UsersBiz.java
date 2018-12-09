package com.ssh.biz;

import java.util.List;

import com.ssh.entity.Users;

public interface UsersBiz {

	public Users findLogin(Users user);
	public Users queryUserById(Integer uid);
	public List searchgetUsers();
	public Integer addUser(Users user);
	public boolean updateUser(Users user);
	public boolean deleteUserById(Integer uid);
	
}
