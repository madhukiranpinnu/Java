package StringPrograms;

public class Capitalsmalltosmallcap {
    public static void main(String args[]){
        String s=new String("mAdHuKiRan 123c PiNnU");
        int length=s.length();
        char[] m = new char[s.length()];
        for(int i=0;i<length;i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                m[i]=Character.toUpperCase(s.charAt(i));
            }
            else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                m[i]=Character.toLowerCase(s.charAt(i));
            }
            else{
                m[i]=s.charAt(i);
            }
        }
        int charArraylength=m.length;
        for(int k=0;k<charArraylength;k++){
            System.out.print(m[k]);
        }
    }
}
