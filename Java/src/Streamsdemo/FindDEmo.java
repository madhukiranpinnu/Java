package Streamsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDEmo {
    public static void main(String args[]){
        List<String> l= Arrays.asList("madhu","kiran","pinnu","srisailam");
        Optional<String> ele=l.stream().findAny();
        System.out.println(ele.get());
        //find first
        Optional<String> ele1=l.stream().findFirst();
        System.out.println(ele1.get());
    }
}
