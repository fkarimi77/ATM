import java.math.BigDecimal;
import java.util.Scanner;

public class Account {

    public void getdata()

    {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter Your Account Number...  ");
        String number = ac.next();
        System.out.println("And Your Balance...");
        BigDecimal balance = ac.nextBigDecimal();
    }


}
