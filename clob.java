
  class student{
    String Fname;
    String Lname;
    student (String n, String m){
        Fname=n;
        Lname=m;
    }
    void printname(){
        System.out.println(Fname+" "+Lname);
    }
 }
public class clob{

public static void main(String args[]){
    student p = new student("Prince","sahu");
   
    p.printname();
    }

}