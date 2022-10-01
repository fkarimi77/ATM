import java.math.BigDecimal;
import java.util.Scanner;

public class Account {

    String accountnumber;
    static BigDecimal balance;

    public String getAccountnumber(){
        return accountnumber;
    }

    public void setAccountNumber(String accountnumber) {

        this.accountnumber = accountnumber;
         Math.random();
    }

    public static BigDecimal getBalance() {
        return  balance;
    }

    public void setBalance(BigDecimal balance) {
        
        this.balance = balance;
    }
}
