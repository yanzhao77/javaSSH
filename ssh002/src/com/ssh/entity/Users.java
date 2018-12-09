package com.ssh.entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer uaid;
	private String uname;
	private String upwd;
	private Integer uage;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String uname, String upwd, Integer uage) {
		this.uname = uname;
		this.upwd = upwd;
		this.uage = uage;
	}

	// Property accessors

	public Integer getUaid() {
		return this.uaid;
	}

	public void setUaid(Integer uaid) {
		this.uaid = uaid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Integer getUage() {
		return this.uage;
	}

	public void setUage(Integer uage) {
		this.uage = uage;
	}

}