package Streamsdemo.Flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo {
    public static void main(String args[]){
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> l1= Arrays.asList(11,12,13,14,15,16,17,18);
        List<Integer> l2= Arrays.asList(21,22,23,24,25,26,27,28);
        List<List<Integer>> final1=Arrays.asList(l,l1,l2);
        List<Integer> f=final1.stream().flatMap(i->i.stream().map(j->j+10)).collect(Collectors.toList());
        f.stream().forEach(i->System.out.println(i));
    }
}
