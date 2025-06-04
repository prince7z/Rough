
public class  bank implements Runnable {
    static int balance=1000;
    static int amt;
    
    public void run(){
       System.out.println("balance is "+balance+ '\n' );
       try{
        Thread.sleep(2000);

       }       
        catch (Exception e) {
       
       }
       System.out.println("deducting "+amt);

    }
    
}
  class thread3{
    
            public static void main(String[] args) {
      
            bank b1=new bank( );
            bank b2 =new bank();
            Thread t1= new Thread(b1);
            Thread t2= new Thread(b2);
            t1.start();
            t2.start();


    }
}
