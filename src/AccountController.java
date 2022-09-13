import java.math.BigDecimal;
import java.util.*;

public class AccountController {
    private String name;
    private int accnum,accnum2,accnum3;
    private double balance=0;
    private double amount;
    private  double money;
    private String account;
    Account accountobj= new Account();
    List<Account> accounts=new ArrayList<>();
    Scanner Ba=new Scanner(System.in);

    public void showbalance(){
        System.out.println("Choose Your Account :");
        account=Ba.nextLine();
        System.out.println("Accounts :"+BigDecimal.valueOf(Long.parseLong(account)));
    }



    public void transfer(){
        System.out.println("Enter the Origin Account Number:");
        accnum=Ba.nextInt();
        System.out.println("Enter the Destination Account Number:");
        accnum2=Ba.nextInt();
        System.out.println("Enter Your Desired Amount :");
        amount=Ba.nextDouble();

    if(amount<balance){
        balance=balance-amount;
    }
    else {
        System.out.println("You Do not Have Anough Balance!!!");
    }
    }



    public void deposit(){
    System.out.println("Enter Your Account Number :");
    accnum3=Ba.nextInt();
    System.out.println("Enter The Amount :");
    money=Ba.nextDouble();
    balance=balance+money;
    }

    public void createnewaccount(){
        accounts.add(accountobj);
    }


}

