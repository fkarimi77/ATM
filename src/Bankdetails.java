import java.util.Scanner;

public class Bankdetails {
    private String name;
    private int accnum;
    private double balance=0;
    private double amount;
    private  double money;
    Scanner Ba=new Scanner(System.in);

    public void showbalance(){
        System.out.println(balance);
    }



    public void transfer(){
    accnum=Ba.nextInt();
    System.out.println("Enter the Destination Account Number:");
    amount=Ba.nextDouble();
    System.out.println("Enter Your Desired Amount :");
    if(amount<balance){
        balance=balance-amount;
    }
    else {
        System.out.println("You Do not Have Anough Balance!!!");
    }
    }



    public void deposit(){
    System.out.println("Enter the Amount You Want to Deposit :");
    money=Ba.nextDouble();
    System.out.println("your Balance Is :");
    balance=balance+money;
    }


}

