import java.util.Scanner;

public class CreateAccount {
    private String name;
    private int num;

    public void getuserdata(){
        Scanner dataaccount=new Scanner(System.in);
        System.out.println("Enter Your Name...");
        name=dataaccount.nextLine();
        System.out.println("Enter Your National Code...");
         num=dataaccount.nextInt();
    }

    public void setname(String nam){
        name=nam;
    }
    public String getName(){
        return name;
    }
    public void setNum(int num2){
        num=num2;
    }
    public int getNum(){
        return num;
    }
}
