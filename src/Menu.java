import java.util.Scanner;

public class Menu {

    public void showmenu() {
        Scanner ch = new Scanner(System.in);
        Bankdetails obj = new Bankdetails();
        CreateAccount obj4=new CreateAccount();

        System.out.println("Please Choose Your Action...");
        System.out.println("--1) visit your Balance--");
        System.out.println("--2) Deposit--");
        System.out.println("--3) Transfer--");
        System.out.println("--4) Open New Account--");
        System.out.println("--5) Back To Menu--");

        int choice = ch.nextInt();
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
                obj4.getuserdata();
            case 5:
                 showmenu();
                 break;
        }
    }
}
