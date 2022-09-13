import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Menu {


    public void showMenu() {
        Scanner ch = new Scanner(System.in);
        AccountController obj = new AccountController();
        Account obj4 = new Account();
        int choice = ch.nextInt();


        do {
            System.out.println("Please Choose Your Action...");
            System.out.println("--1) visit your Balance--");
            System.out.println("--2) Deposit--");
            System.out.println("--3) Transfer--");
            System.out.println("--4) Open New Account--");
            System.out.println("--5) Back To Menu--");


            switch (choice) {
                case 1:
                    obj.showbalance();
                    break;
                case 2:
                    obj.deposit();
                    break;
                case 3:
                    obj.transfer();
                    break;
                case 4:

                case 5:
                    showMenu();
                    break;
                case 6:
                    System.out.println("See you Soon...");
                    break;
            }
        }

        while (choice != 6);

    }

}





