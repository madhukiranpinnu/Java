package StringPrograms;

public class StringReverse {
    public static void main(String[] args){
        String s=new String("madhukiran");
        int length=s.length();
        for(int i=length-1;i>=0;--i){
            System.out.print(s.charAt(i));
        }
    }
}
