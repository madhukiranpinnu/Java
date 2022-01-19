package Streamsdemo.Parllelsreamdemo.Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.marks=marks;
        this.name=name;
    }
    public int getMarks(int marks){
        this.marks=marks;
        return marks;
    }
    public String getName(String name){
        this.name=name;
        return name;
    }
}
public class Demo1 {
public static void main(String args[]){
    List<Student> ls= new ArrayList<Student>();
    ls.add(new Student("madhu",100));
    ls.add(new Student("varshi",15));
    ls.add(new Student("madhup",70));
    ls.add(new Student("madhul",60));
    ls.add(new Student("madhui",77));
    ls.add(new Student("madhuz",66));
    ls.add(new Student("madhux",54));
    ls.add(new Student("madhuc",30));
    Predicate<Integer> p=i->(i>35);
    Function<Student,String> f=f1->{
        int marks= f1.marks;
        String marksS="fail";
        if(marks>35){
            marksS="pass";
            return marksS;
        }
        return marksS;
    };
    Consumer<Student> c=y->{
        System.out.println(y.marks);
        System.out.println(y.name);
    };
    for(Student s:ls){
        String status=f.apply(s);
        System.out.println(status);
        if(p.test(s.marks)){
            c.accept(s);
        }
    }
    //Streams only
    ls.stream().filter(i->i.marks>35).forEach(i->System.out.println(i.name+"----"+i.marks));
    //parllelstreams
    ls.parallelStream().filter(i->i.marks>35).forEach(i->System.out.println(i.name+"----"+i.marks));
    //convert stream to parllelstream
    ls.stream().parallel().filter(i->i.marks>35).forEach(i->System.out.println(i.name+"----"+i.marks));
}
}
