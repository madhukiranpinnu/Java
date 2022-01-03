package Regularexpression1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    public static void main(String args[]){
        Pattern p=Pattern.compile("[a-zA-Z0-9._]*@[a-z0-9A-Z]+(.[a-z])+");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Matcher m=p.matcher(s);
        if(m.find()&&m.group().equals(s)){
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
