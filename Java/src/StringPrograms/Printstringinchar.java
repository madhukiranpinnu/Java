package StringPrograms;

public class Printstringinchar {
    public static void main(String[] args){
        String s=new String("madhukiran");
        int length=s.length();
        for(int i=0;i<length;i++){
            System.out.println(s.charAt(i));
        }
    }
}
