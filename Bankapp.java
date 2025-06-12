import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;
class Transection{
String type ;
double amount;
public Transection(String t, double a){
    this.type=t;
    this.amount=a;

}
}

class account{
   private int accn;
    private String Name;
    private double balance;
    ArrayList <Transection> transection = new ArrayList();
    public account( String n, double b){
        this.accn=01;
        this.Name=n;
        this.balance=b;

    }
    public void deposite(int amount ){
        balance=balance+amount;
        transection.add(new Transection("deposite", amount));
        System.out.println("done");
    }
    public void widrawl(int amount ){
        if(amount>balance){
            System.out.println("Insufficiant balance ");
            return;
        }
        balance=balance-amount;
        transection.add(new Transection("widrawl", amount));
        System.out.println("done");

    }
    public void viewTransection(){
        for (Transection t : transection) {
            System.out.println(t);
            
        }
    }

}

public class Bankapp {

    public static void main(String[] args) {
        int name 
        System.out.println("Welcome to lena bank");
        int x;

        while(true){
            switch (x) {
                case 1:System.out.println(Enter your name);
                    
                }
                    
                    break;
            
                default:
                    break;
            }
            
        }  


    }
}
