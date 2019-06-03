package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {
   private String user;
   private String year;
   private String sex;
   private String adss;
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getAdss() {
	return adss;
}
public void setAdss(String adss) {
	this.adss = adss;
}
   
	public String execute(){
		System.out.println("ggggggggg");
		return SUCCESS;
	}

}
