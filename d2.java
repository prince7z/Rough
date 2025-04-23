
import java.util.Scanner;
public class first{
public static void main(String[] args){
    System.out.println("hello");
    Scanner in=new Scanner(System.in);
    
    int arr[]={1,4,2,3,6,0};
    int n =5;
    

    for (int i =0; i<arr.length; i++){

        for (int j =i+1; j<arr.length; j++){
        if (arr[i]+arr[j]==n){
            System.out.println(i+" "+j);
        }
    }
    }
    
}
}