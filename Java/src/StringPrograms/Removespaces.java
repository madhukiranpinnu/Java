package StringPrograms;

public class Removespaces {
    public static void main(String[] args){
        String s=new String("Pinnu Madhu Kiran");
        int length=s.length();
        for(int i=0;i<length;i++){
            if(s.charAt(i)==' ')
            {

            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}
