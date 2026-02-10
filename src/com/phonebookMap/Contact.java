package com.phonebookMap;

public class Contact {
	String number;
	Identity identity;
	
	
	public Contact(String number, Identity identity) {
		super();
		this.number = number;
		this.identity = identity;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	public Identity getIdentity() {
		return identity;
	}
	public void setIdentity(Identity identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "Contact [name=" + identity.name + ", number=" + number + "email="+identity.email + "]\n";
	}

}
