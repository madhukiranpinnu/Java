package Streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Countdemo {
    public static void main(String args[]){
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);
        long even=al.stream().filter(i->i%2==0).count();
        System.out.println(even);
    }
}
