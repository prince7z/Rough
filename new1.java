import java.util.Scanner;

public class first{
public static void main(String[] args){
    System.out.println("hello");
    Scanner in=new Scanner(System.in);
    
    
    String str1="Helllloooooonkj";
    

    for(int i=0; i<str1.length(); i++){
        int count=0;
        for (int j=i; j<str1.length(); j++){
            if(str1.charAt(i)==str1.charAt(j)){
                count++;
            }
                      
        }
        System.out.println(str1.charAt(i) +" is " +count +" times " );
        if (count>1){
            count=0;
            i++;
             }
                
        

        
    }
    

        }
    }