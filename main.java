class main{
    void sum(){
        System.out.println(this);
    }

    public static void main  (String[] args){
        main obj =new main ();
        System.out.println(obj);
        obj.sum();
    }
}