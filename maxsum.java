public class maxsum{

    static int find(int arr[]){
        int sum=0;
        for (int i=0; i<arr.length; i++){

            for (int j=0; j<arr.length; j++){
                if (arr[i]!=arr[j]){
                    if (arr[i]+arr[j]>sum){
                sum=arr[i]+arr[j];
            }
                }
            
        }

        }
        return sum;
    }

    public static void main(String[] args){
        int arr[]={4,7,2,9,6};
        System.out.println(find(arr));
    }

}