package Regularexpression1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobilenumber {
    public static void main(String args[]){
        Pattern p=Pattern.compile("(0|91)?[6789][0-9]{9}");
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
