package Regularexpression1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("\\s");
        Matcher m= p.matcher("a2 3r t%^ sdf1 2");
        while (m.find()){
            System.out.println(m.start()+"---"+m.group());
        }
    }
}
