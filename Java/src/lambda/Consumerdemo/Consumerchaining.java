package lambda.Consumerdemo;

import java.util.function.Consumer;

public class Consumerchaining {
    public static void main(String args[]){
        Consumer<String> c1=e1->System.out.println("first");
        Consumer<String> c2=e2->System.out.println("second");
        Consumer<String> c3=e3->System.out.println("third");
        c1.andThen(c2).andThen(c3).accept("cow");
    }
}
