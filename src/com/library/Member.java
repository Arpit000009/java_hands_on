package com.library;

public class Member {
	String name;
	long phoneno;
	String email;
	public Member(String name, long phoneno,String email) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void getEmail(String email) {
		this.email = email;
	}
	
	
}
