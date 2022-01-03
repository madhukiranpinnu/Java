package Regularexpression1;

import java.util.StringTokenizer;

public class StringTokenizer2 {
    public static void main(String args[]){
        StringTokenizer st=new StringTokenizer("02-01-2022","-");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
