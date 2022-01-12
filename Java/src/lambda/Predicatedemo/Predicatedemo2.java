package lambda.Predicatedemo;

import java.util.ArrayList;
import java.util.function.Predicate;
class Employee {
    String name1;
    int salary;
    int exper;

    Employee(String name1, int salary, int exper) {
        this.name1 = name1;
        this.salary = salary;
        this.exper = exper;
    }
}
public class Predicatedemo2 {

    public static void main(String args[]){
        Employee d= new Employee("madhu",20000,3);
        Predicate<Employee> p=(e)->(e.exper>2 && e.salary>20000);
        System.out.println(p.test(d));
        ArrayList<Employee> al =new ArrayList<Employee>();
        al.add(new Employee("sai",40000,4));
        al.add(new Employee("saiji",10000,5));
        al.add(new Employee("saikiki",20006,8));
        al.add(new Employee("saijkj",30000,7));
        al.add(new Employee("kiran",40000,2));
        for (Employee a:al){
            System.out.println(p.test(a));
        }
    }
}
