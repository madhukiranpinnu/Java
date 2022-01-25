package StringPrograms;

public class Polindrome {
    public static void main(String args[]){
        String s=new String("ababa");
        int length=s.length();
        char[] s1 = new char[s.length()];
        int j=0;
        for(int i=length-1;i>=0;i--,j++){
            s1[j] =s.charAt(i);
        }
        System.out.println(s1);
        String s3= String.valueOf(s1);
        if(s3.equals(s)){
            System.out.println("Polindrome");
        }
        else{
            System.out.println("not polindrome");
        }
    }
}
