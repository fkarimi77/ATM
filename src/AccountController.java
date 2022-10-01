import java.math.BigDecimal;
import java.util.*;

public class AccountController {

    List<Account> accounts=new ArrayList<>();


    public BigDecimal showBalance(String accountnumber){
        for (Account account:accounts){
            if (account.getAccountnumber().equals(accountnumber)){
                return Account.getBalance();
            }

        }
       return null ;
    }



    public void transfer(String oriaccount,String desaccount,BigDecimal amount){
    String accountdata=null;
    for (Account account:accounts){
        if (account.getAccountnumber().equals(oriaccount)){
            accountdata=oriaccount;
        }
        else if (amount ==> Account.getBalance()){
            System.out.println("You dont have enough balance !!");
        }
        else{
            BigDecimal money= ;
        }
    }

    }



    public void createnewaccount(String Account){
        Account acobj=new Account();
        accounts.add(acobj);
        acobj.setBalance(BigDecimal.ZERO);

    }


}

