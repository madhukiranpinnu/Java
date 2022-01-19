package Streamsdemo;

import java.util.HashSet;
import java.util.Set;

public class Matchesdemo {
    public static void main(String args[]){
        Set<String> fruits= new HashSet<String>();
        fruits.add("one mango");
        fruits.add("one apple");
        fruits.add("two guava");
        fruits.add("three orange");
        //one match
        boolean value=fruits.stream().anyMatch(i->{
            return i.startsWith("one");
        });
    System.out.println(value);
    //all match
        boolean value1=fruits.stream().allMatch(i->{
            return i.startsWith("one");
        });
        System.out.println(value1);
        //none match
        boolean value3=fruits.stream().noneMatch(i->{
            return i.startsWith("one");
        });
        System.out.println(value3);
    }
}
