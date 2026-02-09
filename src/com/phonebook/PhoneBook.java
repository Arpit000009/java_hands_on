package com.phonebook;


import java.util.ArrayList;
import java.util.List;


public class PhoneBook {
	List<Contact> phoneBook = new ArrayList<Contact>();
	
	public void addContact(String name,String number) {
		boolean flag = true;
		for(int i=0;i<number.length();i++) {
			if(!Character.isDigit(number.charAt(i))) {
				flag = false;
			}
		}
		if(number.length()==10 && flag == true) {
		phoneBook.add(new Contact(name, number));
		}
		else {
			System.out.println("enter correct number");
		}
	}
	
	public void viewAllContacts() {
		System.out.println(phoneBook);
	}
	
	public void viewContact(String name) {
		for(Contact contact:phoneBook) {
			if(contact.getName().equals(name)) {
				System.out.println(contact);
			}
		}
	}
	
	public void deleteContact(String number) {
		for(int i=0;i<phoneBook.size();i++) {
			if(phoneBook.get(i).equals(number)) {
				phoneBook.remove(i);
			}
		}
	}
}
