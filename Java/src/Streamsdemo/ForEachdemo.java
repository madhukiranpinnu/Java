package Streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class ForEachdemo {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(21);
        a.add(32);
        a.add(43);
        a.add(50);
        a.add(56);
        //1
        //a.stream().forEach(System.out::println);
        //2
        //Consumer<Integer> f=i->System.out.println(i);
        //a.stream().forEach(f);
        //3
        a.stream().forEach(i->System.out.println(i));
    }
}
