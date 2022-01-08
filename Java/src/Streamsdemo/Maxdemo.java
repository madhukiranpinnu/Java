package Streamsdemo;

import java.util.ArrayList;

public class Maxdemo {
    public static void main(String args[]){
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);
        int max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
    }
}
