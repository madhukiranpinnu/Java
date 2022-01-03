package Regularexpression1;

import java.util.StringTokenizer;

public class Stringtokenizer {
    public static void main(String args[]){
        StringTokenizer st=new StringTokenizer("madhu kiran pinnu");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
