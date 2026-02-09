package com.phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- PhoneBook Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. View Specific Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    phoneBook.addContact(name, phone);
                    break;

                case 2:
                    phoneBook.viewAllContacts();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    phoneBook.viewContact(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    phoneBook.deleteContact(sc.nextLine());
                    break;

                case 5:
                    System.out.println("Exiting PhoneBook. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
