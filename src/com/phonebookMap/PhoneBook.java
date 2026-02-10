package com.phonebookMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
//List<Contact> phoneBook = new ArrayList<Contact>();
	Map<String,Identity> phoneBook = new HashMap<>();
	
	public void addContact(String number,Identity identity) {
		boolean flag = true;
		for(int i=0;i<number.length();i++) {
			if(!Character.isDigit(number.charAt(i))) {
				flag = false;
				break;
			}
		}
		if(number.length()==10 && flag == true) {
			
			Contact contact = new Contact(number, identity);
		phoneBook.put(contact.getNumber(), contact.getIdentity());
		}
		else {
			System.out.println("enter correct number");
		}
	}
	
	public void viewAllContacts() {
		for (Map.Entry<String, Identity> entry : phoneBook.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Name: " + entry.getValue().name + ", email:"+entry.getValue().email);
        }
	}
	
	public void viewContact(String name) {
		for (Map.Entry<String, Identity> entry : phoneBook.entrySet()) {
			if(entry.getValue().name.equals(name)) {
				System.out.println("Number: " + entry.getKey() + ", Name: " + entry.getValue().name +", email:"+entry.getValue().email);
			}
        }
	}
	
	public void deleteContact(String number) {
		for (Map.Entry<String, Identity> entry : phoneBook.entrySet()) {
			if(entry.getKey().equals(number)) {
				phoneBook.remove(entry.getKey());
			}
        }
	}

}
