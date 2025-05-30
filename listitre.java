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
        ListIterator <String> ne=list.listIterator ();
        while (ne.hasNext()){
            String data =ne.next();
         if (data.length()<=3){
            list2.add("Hello");
         }
         else {
            list2.add(data);
         }

        }
        // while(ne.hasPrevious()){
        //     String data =ne.previous();
        //     System.out.println(data);

        // }
        System.out.println(list2);

        
    }


}
