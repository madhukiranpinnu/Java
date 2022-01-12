package lambda.Predicatedemo;

import java.util.function.Predicate;

public class Predicatedemo3 {
    public static void main(String args[]) {
        Predicate<Integer> p = (e) -> (e > 50);
        Predicate<Integer> p1 = (f) -> (f % 2 == 0);
        int[] a = {20, 30, 40, 50, 60, 70, 80, 90, 45, 55, 66, 54, 67, 78};
        for (int b : a) {
            //if(p.test(b) && p1.test(b)){
            //or
            //if(p1.and(p).test(b)){
            //    System.out.println(b);
            //}
        /*if(p1.or(p).test(b)){
            System.out.println(b);
        }*/
        if(p1.negate().test(b)){
            System.out.println(b);
        }
        }
    }
}
