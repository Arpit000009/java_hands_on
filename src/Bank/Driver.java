package Bank;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankOne A = new BankOne("Arpit", 10000);
        A.doesRetrieve(sc);
    }
}
