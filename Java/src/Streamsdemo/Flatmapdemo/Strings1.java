package Streamsdemo.Flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings1 {
    public static void main(String args[]){
        List<String> s1= Arrays.asList("madhu","kiran");
        List<String> s2=Arrays.asList("pinnu","chinna");
        List<String> s3=Arrays.asList("sai","Ram");
        List<List<String>> finala=Arrays.asList(s1,s2,s3);
        List<String> f=finala.stream().flatMap(i->i.stream()).collect(Collectors.toList());
        f.stream().forEach(j->System.out.println(j));
    }
}
