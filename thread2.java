class tst implements Runnable{
    public void run (){
        System.out.println("hello dude, whts u doin");
    }

}

public class thread2 {
    public static void main(String[] args) {
        tst t1 =new tst();
        Thread t=new Thread(t1);
        t.start();
         try {
                    
                        Thread.sleep(1000);
                        } 
                    catch (Exception e) {
                        System.out.println(e);
                        }
        System.out.println("im here");
        
    }

}
