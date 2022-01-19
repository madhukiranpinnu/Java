package Streamsdemo.Flatmapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.salary=salary;
        this.name=name;
    }
}
public class Objectdemo1 {
    public static void main(String args[]) {
        List<Employee> ls1 = new ArrayList<Employee>();
        ls1.add(new Employee("kiran", 10000));
        ls1.add(new Employee("pinnu", 20000));
        List<Employee> ls2 = new ArrayList<Employee>();
        ls2.add(new Employee("sai", 10000));
        ls2.add(new Employee("ram", 20000));
        List<List<Employee>> final1=Arrays.asList(ls1,ls2);
        List<Employee> f1=final1.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        f1.stream().forEach(y->{System.out.println(y.name+"----"+y.salary);});
    }
}
