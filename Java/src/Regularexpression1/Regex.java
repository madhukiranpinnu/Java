package Regularexpression1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String args[]){
        int count=0;
        Pattern p =Pattern.compile("ba");
        Matcher m= p.matcher("ababbaba");
        while(m.find()){
            System.out.println(m.start()+"-----"+m.end()+"-----"+m.group());
            count++;
        }
        System.out.println(count);
    }
}
