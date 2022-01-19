package Streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorteddemo {
    public static void main(String args[]){
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);
        List<Integer> l=al.stream().sorted().collect(Collectors.toList());
        System.out.println(l);
        //reverse
        List<Integer> r=al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(r);
        List<String> l1= Arrays.asList("madhu","kiran","pinnu","varshi","vijaya");
       List<String>l3= l1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
       l3.stream().forEach(i->System.out.println(i));
       List<String> l4=l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       l4.stream().forEach(i1->System.out.println(i1));
    }
}
