package StringPrograms;

public class Reverseordereachwordinstring {
    public static void main(String[] args){
        String s=new String("madhu kiran pinnu");
        String[] Strsplit=s.split(" ");
        int length=Strsplit.length;
        for(int i=0;i<length;i++){
            int length1=Strsplit[i].length();
            for(int j=length1-1;j>=0;j--){
                System.out.print(Strsplit[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
