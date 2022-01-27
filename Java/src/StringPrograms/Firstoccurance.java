package StringPrograms;

public class Firstoccurance {
    public static void main(String[] args){
        String s=new String("madhukiran pinnu");
        int length=s.length();

        int[] intarr=new int[122];
        for(int i=0;i<length;i++){
            int occurance=0;
            char ch=s.charAt(i);
            int ascii=(int)ch;
            occurance=occurance+1;
            intarr[ascii]=intarr[ascii]+occurance;
            if(intarr[ascii]==1){
                System.out.print(ch);
                System.out.println(i);
            }
        }
    }
}
