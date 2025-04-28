//import java.util.Scanner;
import java.util.Arrays;
public class trii{
    public static int[] sort(int arr[]){
        for (int j =0; j<arr.length-1; j++){
             for(int i=0; i<arr.length-1; i++){
            if (arr[i]<arr[i+1]){
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
        }
       
        return arr;
    }

    public static void main(String[] args){
        System.out.print("hell");
        int arr[]={3,5,1,9,5,0};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
