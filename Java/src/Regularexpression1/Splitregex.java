package Regularexpression1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitregex {
    public static void main(String[] args){
        Pattern p=Pattern.compile("\\s");
        String[] s=p.split("madhu kiran pinnu");
        for(String s1:s){
            System.out.println(s1);
        }
    }
}
