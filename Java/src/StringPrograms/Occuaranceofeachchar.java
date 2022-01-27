package StringPrograms;

public class Occuaranceofeachchar {
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
        }
        for (int i=0;i<122;i++){
            if(!(intarr[i]==0)){
                System.out.print((char)i);
                System.out.print(intarr[i]);
                System.out.println();
            }
        }
    }
}
