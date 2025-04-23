public class first{
public static void main(String[] args){
    System.out.println("new string with 0 occrence ");
 String sts= "pprrincee";
 String sts1= "";
 for (int i=0; i<sts.length(); i++){
    if(sts1.indexOf(sts.charAt(i))==-1){
        sts1=sts1+sts.charAt(i);
    }
 }
 System.out.println(sts1);
}



}
