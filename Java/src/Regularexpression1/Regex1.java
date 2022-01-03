package Regularexpression1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String args[]){
        Pattern p=Pattern.compile("[^a-zA-Z0-9]");
        Matcher m= p.matcher("a23rt%^sdf12");
        while (m.find()){
            System.out.println(m.start()+"---"+m.end()+"----"+m.group());
        }
    }
}
