package com.ssh.dao;

import java.util.List;

import com.ssh.entity.Users;

public interface UsersDao {

	public Users checkLogin(Users user);
	public Users findUserById(Integer uid);
	public List getUsers();
	public Integer addUser(Users user);
	public void updateUser(Users user);
	public void deleteUser(Integer uid);
	
}
