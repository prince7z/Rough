public class bine{
 public static int search(int arr[], int n){
    int l=0;
    int h=arr.length-1;
    
    for (int i =0; i<arr.length-1; i++){
        int m =(l+h)/2;
        if(n>arr[m]){            
            l=m+1;            
        }
        else if (n==arr[m]) return m;
        else h=m-1;
    }
    return -1;
    
 }
    public static void main(String[] args){
        int arr []={1,5,8,9,11,66};
        int n=11;
        System.out.println(search(arr,n));
    }
}