package Streamsdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Toarraydemo {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(21);
        a.add(32);
        a.add(43);
        a.add(50);
        a.add(56);
        Integer[] i=a.stream().toArray(Integer[]::new);
        a.stream().forEach(i1->System.out.println(i1));
        System.out.println(a);
    }
}
