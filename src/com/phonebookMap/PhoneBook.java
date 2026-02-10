package com.phonebookMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
//List<Contact> phoneBook = new ArrayList<Contact>();
	Map<String,String> phoneBook = new HashMap<>();
	
	public void addContact(String name,String number) {
		boolean flag = true;
		for(int i=0;i<number.length();i++) {
			if(!Character.isDigit(number.charAt(i))) {
				flag = false;
			}
		}
		if(number.length()==10 && flag == true) {
			Contact contact = new Contact(name, number);
		phoneBook.put(contact.getNumber(), contact.getName());
		}
		else {
			System.out.println("enter correct number");
		}
	}
	
	public void viewAllContacts() {
		for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
	}
	
	public void viewContact(String name) {
		for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
			if(entry.getKey().equals(name)) {
				System.out.println("Number: " + entry.getKey() + ", Name: " + entry.getValue());
			}
        }
	}
	
	public void deleteContact(String number) {
		for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
			if(entry.getKey().equals(number)) {
				phoneBook.remove(entry.getKey());
			}
        }
	}

}
