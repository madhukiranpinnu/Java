package lambda.Functiondemo;

import java.util.function.Function;

class Employee1
{
    String name;
    int salary;
    Employee1(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
public class Demo2 {
    public static void main(String args[]) {
        Employee1 e = new Employee1("madhu", 100000);
        Function<Employee1, Integer> f = (e1) -> {
            int sal = e1.salary;
            if (sal > 10000) {
                sal = sal + 100;
            }
            return sal;
        };
        System.out.println(f.apply(e));
    }
}

