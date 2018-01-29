package com.sangmin.survival.user.vo;

import java.io.Serializable;

public class UserVO implements Serializable{
	
	private String id;
	private String pw;
	private String nm;
	private String email;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserVO() {}

	public UserVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public UserVO(String id, String nm, String email) {
		super();
		this.id = id;
		this.nm = nm;
		this.email = email;
	}

	public UserVO(String id, String pw, String nm, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.nm = nm;
		this.email = email;
	}

	@Override
	public String toString() {
		return "ID : " + getId() + "\nNM : " + getNm() + "\nemail : " + getEmail();
	}
}
