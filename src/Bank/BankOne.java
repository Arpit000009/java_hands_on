package Bank;

import java.util.Scanner;

public class BankOne {

    String name;
    int amount;

    BankOne(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

     int getValidNumber(Scanner sc) {
        while (true) {
        	System.out.println("your balance is "+amount);
            System.out.print("Enter amount to withdraw: ");
            String s = sc.nextLine();

            if (s.isEmpty()) {
                System.out.println("Invalid input");
                continue;
            }

            boolean isValid = true;
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                return Integer.parseInt(s);
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public void doesRetrieve(Scanner sc) {
        int amountToRetrieve = getValidNumber(sc);

        if (amountToRetrieve <= 0) {
            System.out.println("Invalid amount");
        } else if (amount >= amountToRetrieve) {
            amount -= amountToRetrieve;
            System.out.println("Approved");
            System.out.println("Your current balance is " + amount);
        } else {
            System.out.println("Rejected: Insufficient balance");
        }
    }
}
