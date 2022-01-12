package lambda.Predicatedemo;

import java.util.function.Predicate;

public class Predicatedemo {
    public static void main(String args[]){
        //ex1
        Predicate<Integer> p=i->(i>100);
        System.out.println(p.test(1000));
        //ex2
        Predicate<String> s=s1 -> (s1.length()>10);
        System.out.println(s.test("madhukiranpinnu"));
        //ex3
        //length of string in string array
        String[] names={"madhu","kiranp","ji","jijiji"};
        Predicate<String> s2=s3->(s3.length()>4);
        for(String s5:names){
            if(s2.test(s5)){
               System.out.println(s5);
            }
            else
            {
                System.out.println(false);
            }
        }
    }
}
