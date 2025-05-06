 class employe {
    String name ;
    int age ;

    employe(String n,int a){
        name=n;
        age =a;
    }
    void eat(){
        System.out.println("hellow "+ name +age);
    }

}

public class may5{
public static void main(String[] args){
    System.out.println("hello");

    employe O = new employe("prince",19);
    O.eat();
}
}