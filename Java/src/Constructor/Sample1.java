package Constructor;

public class Sample1 {
    String name;
    int rollNo;
    Sample1(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public static void main(String args[]){
        Sample1 s1=new Sample1("madhu",101);
        Sample1 s2=new Sample1("ravi",102);
        System.out.println(s1.name+"+++++++"+s1.rollNo);
        System.out.println(s2.name+"+++++++"+s2.rollNo);

    }
}
