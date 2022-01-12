package Streamsdemo;

import java.util.ArrayList;
import java.util.Optional;

public class Distinctdemo {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(21);
        a.add(32);
        a.add(43);
        a.add(50);
        a.add(56);
        a.add(32);
        a.add(50);
        a.add(43);
        a.stream().distinct().forEach(i->System.out.println(i));
        //count
        long number=a.stream().distinct().count();
        System.out.println(number);
        //limit
        a.stream().distinct().limit(4).forEach(i->System.out.println(i));
        //min
        System.out.println(a.stream().min((i1,i2)->i1.compareTo(i2)).get());
        //
        Optional<Integer> min=a.stream().min((i1,i2)->i1.compareTo(i2));
        System.out.println(min.get());
        //max
        Optional<Integer> max=a.stream().max((i1,i2)->i1.compareTo(i2));
        System.out.println(max.get());
        //reduce
        Optional<Integer> red=a.stream().reduce((value,combinedvalue)->
        {
           return combinedvalue+value;
        });
        System.out.println(red.get());
    }
}
