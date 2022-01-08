package Streamsdemo;

import java.util.ArrayList;

public class Mindemo {
    public static void main(String args[]){
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);
        int min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
    }
}
