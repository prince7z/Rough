import java.util.HashMap;

public class ana {
    public static void main(String[] args) {
        
        String str1="Helll";
        String str2="lehll";
        
        HashMap<Character, Integer> Frequency1 = new HashMap<>();
        // HashMap<Character, Integer> Frequency2 = new HashMap<>();

        
        
        char[] ar1=str1.toCharArray();
        char[] ar2=str2.toCharArray();
        
       for (char i : ar1) {
        Frequency1.put(i,Frequency1.getOrDefault(i,0)+1);
       }
       for (char i : ar1) {
        Frequency1.put(i,Frequency1.getOrDefault(i,0)-1);
       }
       for (Integer j:Frequency1.values()){
        if (j!=0){
            System.out.println("not an anagram ");
            return; 
        }
        
       }
       System.out.println("Anagram confirmed");
        
    }

}
