package lambda.Functiondemo;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args){
        Function<Integer,Integer> f=e->e*e;
        System.out.println(f.apply(4));
        //ex2
        Function<String,Integer> f1=s -> s.length();
        System.out.println(f1.apply("madhukiran"));
    }
}
