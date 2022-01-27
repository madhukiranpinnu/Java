package StringPrograms;

public class RemoveSpecialcharecters {
    public static void main(String[] args){
        String s=new String("m@dhu  K!r@n");
        int length=s.length();
        for(int i=0;i<length;i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')|| s.charAt(i)==' '){
                System.out.print(s.charAt(i));
            }
        }
    }
}
