package com.library;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.println("1. Add Member");
            System.out.println("2. show all the members");
            System.out.println("3. exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    long phone = sc.nextLong();
                    sc.nextLine(); 
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    Member member = new Member(name, phone, email);

                    try {
                        library.addMember(member);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 2:
                    try {
                        List<Member> members = library.getMember();

                        if (members.isEmpty()) {
                            System.out.println("No members found.");
                        } else {
                            System.out.println("\n--- Library Members ---");
                            for (Member m : members) {
                                System.out.println(
                                    "Name: " + m.getName() +
                                    ", Phone: " + m.getPhoneno() +
                                    ", Email: " + m.getEmail()
                                );
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;


                case 3:
                    System.out.println("Exiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
