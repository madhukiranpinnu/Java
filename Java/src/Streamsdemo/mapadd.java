package Streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mapadd {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);
        List<Integer> l2=al.stream().map(i->i+2).collect(Collectors.toList());
        System.out.println(l2);
    }
}
