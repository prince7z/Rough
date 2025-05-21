class main1{
    // void sum(int a){
    //     int a=a;

    //     System.out.println(this.a);
    // }
    class student {
        int a;
    student (int b){
this.a=b;
    }
    void pr(){
        System.out.println(this.a);
    }
    }

    public static void main  (String[] args){
        main obj =new main ();
        System.out.println(obj);
        obj.sum(5);
        student a= new student(6);
        a.pr();
    }
}