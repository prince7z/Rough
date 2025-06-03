 import java.util.*;

public class listitre {
   

        public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list.add("Ram");
        list.add("sam");
        list.add("Radhe");
        list.add("hari");
        //System.out.println(list);
        int c=0;
        ListIterator <String> ne=list.listIterator ();
             while (ne.hasNext()){
             String data =ne.next();}
        //
             while(ne.hasPrevious()){
                c++;    
            if (c==4){
                ne.set("bye");

            }
            
        }
        System.out.println(list);
        }
       
       

        
    }

