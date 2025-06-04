public class downloa implements Runnable {

public void run (){
    for(int i=0; i<100; i=1+10)
{    System.out.println("dpwnloading movie");
 try {
                    
                        Thread.sleep(1000);
                        } 
                    catch (Exception e) {
                        System.out.println(e);
                        }

}}
    
}

public class thread3 {
    public static void main(String[] args) {
        downloa d1 =new downloa();
        Thread t1= new Thread(d1);

        t1.start();
         for(int i=0; i<100; i=1+10)
{    System.out.println("dpwnloading movie");
 try {
                    
                        Thread.sleep(1000);
                        } 
                    catch (Exception e) {
                        System.out.println(e);
                        }

}
    }
}
