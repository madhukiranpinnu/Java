package Streamsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatinaingstreams {
    public static void main(String args[]){
        List<String> animal = Arrays.asList("pig","girrafe","lion");
        List<String> birds = Arrays.asList("pigeon","parrot","owl");
        Stream<String> s1=animal.stream();
        Stream<String> s2=birds.stream();
        Stream<String> s3=Stream.concat(s1,s2);
        List<Object> k=s3.collect(Collectors.toList());
        k.forEach(i->System.out.println(i));
    }
}
