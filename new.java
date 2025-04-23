import java.util.Scanner;
public class first{
public static void main(String[] args){
    System.out.println("hello");
    Scanner in=new Scanner(System.in);
    
    int arr[]={1,4,2,3,6,0,7,21};
    boolean prime=true;

    for(int i=0; i<arr.length; i++){
        for (int j=2; j<arr[i]; j++){
            if(arr[i]%j==0){
                prime= false;
            }
            else prime=true
        }
        System.out.println(arr[i] +"is"+prime);
    }
        }
    }