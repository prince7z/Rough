import java.util.*;
public class itretor {
        public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Ram");
        list.add("shyam");
        list.add("Radhe");
        list.add("hari");
        System.out.println(list);
        Iterator <String> ne=list.iterator();
        while(ne.hasNext()){
            String data =ne.next();
            if (data.startsWith("R"))
            {
                ne.remove();
            }

        }
        System.out.println(list);

        
    }
}
