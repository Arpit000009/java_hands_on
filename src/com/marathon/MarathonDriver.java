package com.marathon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarathonDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Registration");

		String name;
		int age;
		String gender;
		String contact;

		while(true) {
			try {
				System.out.println("enter the name");
				name = sc.nextLine();
				
				if(name.length() < 4) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				continue;
			}
		}

		while(true) {
			try {
				System.out.println("enter the age");
				age = sc.nextInt();
				if(age < 18 || age > 60) {
					throw new Exception("age should be between 18 and 60");
				}
				break;
			}
			catch(Exception e) {
				continue;
			}
		}

		sc.nextLine();

		while(true) {
			try {
				System.out.println("enter the gender");
				gender = sc.nextLine();
				if (!gender.equalsIgnoreCase("male")
						&& !gender.equalsIgnoreCase("female")
						&& !gender.equalsIgnoreCase("others")) {
					throw new InputMismatchException();
				}
				break;
			}
			catch(InputMismatchException e) {
				continue;
			}
		}

		while(true) {
			try {
				System.out.println("enter your contact number");
				contact = sc.nextLine();
				boolean isValid = true;

				if (contact.length() != 10) {
				    isValid = false;
				}else{
				    for(int i = 0; i < contact.length(); i++) {
				        if (!Character.isDigit(contact.charAt(i))) {
				            isValid = false;
				            break;
				        }
				    }
				}

				if (!isValid) {
				    throw new Exception("Contact number must contain only digits and exactly 10 characters");
				}
				break;
			}
			catch (Exception e) {
				continue;
			}
		}

		Marathon marathon = new Marathon(name, age, gender, contact);
		System.out.println("Registration done");
	}
}
