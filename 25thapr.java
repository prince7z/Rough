import java.util.Scanner;
public class first{
     static int sum(int a, int b){
    return a+b;
 }

 static int sum (int a){
int sum =0;
while (a!=0){
sum=sum+a%10;
a=a/10;
}
return sum;
 }

public static void main(String[] args){

System.out.println(sum(456));
// System.out.println(sum(4,5));
// StringBuilder str= new StringBuilder(5);
// str.append("heya dude");
// System.out.println(str.length());
// System.out.println(str.capacity());
    
    }
        
        }