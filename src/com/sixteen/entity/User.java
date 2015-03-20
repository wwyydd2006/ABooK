package com.sixteen.entity;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1780046036318093041L;
	private int uid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	private String uname;
	private String upasswd;
	private String unickname;
	private String uhead;
	private String ugender;
	private String usignature;
	private int    upower;
	public User(){
		
	}
	public User(String uname,String upasswd,String unickname,String uhead,String ugender,String usignature,int upower){
		this.ugender=ugender;
		this.uhead=uhead;
		this.uname=uname;
		this.unickname=unickname;
		this.upasswd=upasswd;
		this.upower=upower;
		this.usignature=usignature;
		
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpasswd() {
		return upasswd;
	}
	public void setUpasswd(String upasswd) {
		this.upasswd = upasswd;
	}
	public String getUnickname() {
		return unickname;
	}
	public void setUnickname(String unickname) {
		this.unickname = unickname;
	}
	public String getUhead() {
		return uhead;
	}
	public void setUhead(String uhead) {
		this.uhead = uhead;
	}
	public String getUgender() {
		return ugender;
	}
	public void setUgender(String ugender) {
		this.ugender = ugender;
	}
	public String getUsignature() {
		return usignature;
	}
	public void setUsignature(String usignature) {
		this.usignature = usignature;
	}
	public int getUpower() {
		return upower;
	}
	public void setUpower(int upower) {
		this.upower = upower;
	}
}
