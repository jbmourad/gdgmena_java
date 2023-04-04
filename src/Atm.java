import java.util.Scanner;

public class Atm {
    String username;
    float balance;
    float money;

    public void setCardInformation(){
        System.out.println("please enter your name");
        Scanner sc=new Scanner(System.in);
        username = sc.nextLine();
        System.out.println("please enter your balance");
        Scanner sc2=new Scanner(System.in);
        balance = sc2.nextFloat();
    }
    public void getCardInformation(){
        System.out.println("Welcome "+username);
        System.out.println("Your balance is: "+balance);

    }
    public void depositMoney(){
        System.out.println("How much you want to deposit");
        Scanner sc3=new Scanner(System.in);
        money=sc3.nextFloat();
        balance=balance+money;
        checkBalance();
    }
    public void checkBalance(){
        System.out.println("Your have: "+balance);
    }
    public void withdrawMoney(){
        System.out.println("How much you want to withdraw");
        Scanner sc4=new Scanner(System.in);
        money=sc4.nextFloat();
        balance=balance-money;
        checkBalance();
    }

    public Atm(){

    }
    public Atm(int balance){
        System.out.println("Constructor has been initialise");
    }

}
