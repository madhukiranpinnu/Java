package lambda.Consumerdemo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee3{
    String name;
    int salary;
    String gender;
    Employee3(String name,int salary,String gender){
        this.gender=gender;
        this.name=name;
        this.salary=salary;
    }
}

public class Allhere {
    public static void main(String args[]){
        ArrayList<Employee3> al= new ArrayList<Employee3>();
        al.add(new Employee3("madhu",10000,"male"));
        al.add(new Employee3("kiran",20000,"female"));
        al.add(new Employee3("pinnu",30000,"male"));
        al.add(new Employee3("Hindu",40000,"female"));
        al.add(new Employee3("India",50000,"male"));
        Function<Employee3,Integer> f=e-> e.salary*10/100;
        Predicate<Integer> p=e1->e1>30000;
        Consumer<Employee3> c=e2->{
            System.out.println(e2.gender);
            System.out.println(e2.name);
            System.out.println(e2.salary);
        };
        for(Employee3 k:al) {
           int bonus=f.apply(k);
           if(p.test(k.salary)){
               c.accept(k);
               System.out.println(bonus);
           }
        }
    }
}
