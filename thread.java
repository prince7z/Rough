 class  hell extends Thread{
    
    public void run (){
        String n ="GOT";
        
        for(int i=0; i<100; i=i+10){
            System.out.println(n+" =" +i+ "%");
                try {
            
         Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
            
        }
            
        }      
        
       
        
    }

public class thread {

         
    void count(){
        String n ="Money Hiest";

        for (int j=0; j<100; j=j+10){
           System.out.println(n+" =" +j+ "%");
                    try {
                    
                        Thread.sleep(1000);
                        } 
                    catch (Exception e) {
                        System.out.println(e);
                        }
                        
                    }
            }
        
        
        
    
public static void main(String[] args) {
        hell H =new hell();            
        thread t=new thread();
         H.start();
         t.count();
        

    }
}
    

