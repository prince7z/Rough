import java.util.Scanner;
public class first{
static int sum(int a, int b){
    return a+b;
 }
static int div10(int a){
    return a/10;
}
static int sum (int a){
int sum =0;
while (a!=0){
sum=sum+a%10;
a=div10(a);
}
return sum;
 }

 static int max(int a, int b){ return a>b? a:b; }

public static void main(String[] args){

System.out.println(sum(456));
System.out.println(max(456,458));

// System.out.println(sum(4,5));
// StringBuilder str= new StringBuilder(5);
// str.append("heya dude");
// System.out.println(str.length());
// System.out.println(str.capacity());
    
    }
        
        }