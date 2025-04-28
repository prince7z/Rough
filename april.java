  public class april{
    // int a=12;
static int min(int arr[]){
 int m=arr[0];
    for (int i =0; i<arr.length -1; i++){
        if (arr[i]<m){
          m=arr[i];
            // int t=arr[i];
            // arr[i]=arr[i+1];
            // arr[i+1]=t;
        }
    
    }
    return m;
 }
public static void main(String[] args){
        // int b =13;
    // System.out.println(a);
    // System.out.println(b);
    // prints();
    int arr[]={4,7,2,9,6};
  System.out.println(min(arr));

    }
//     public static void prints(){

// System.out.println(a);
// System.out.println(b);

//     }

}