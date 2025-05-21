public class wed {
        public static void main(String[] args){
            String sam="aabbbcccdddd";
            int count=1;

            for (int i=0;i<sam.length()-1; i++){
                if(sam.charAt(i)==sam.charAt(i+1)){
                    count++;
                }
                else {System.out.print(sam.charAt(i)+""+count);
                count=1;}
            }

            System.out.print(sam.charAt(sam.length()-1)+""+count);
        }
}
