public class first{
public static void main(String[] args){
    System.out.println("new string with 0 occrence ");
 String sts= "preiince";
 String sts1= "";

 for (int i=0; i<sts.length(); i++){
    // for (int j=i+1; j<sts.length(); j++){
    //     if (sts.charAt(i)==sts.charAt(j)){
    //         System.out.println(sts.charAt(i));
    //         i=sts.length();
    //         break;
           
    //     }
    // }

    char c = sts.charAt(i);
if (sts1.indexOf(c)==-1){
    sts1=sts1+sts.charAt(i);

}
else System.out.println(sts.charAt(i));
 }

}



}
