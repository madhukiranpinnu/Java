package MultiThreading;
class MyThread6 extends Thread{
public void run(){
    System.out.println("child");
}
}

public class PriorityDemo {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getPriority());
        MyThread6 m=new MyThread6();
        m.setPriority(10);
        m.start();
        System.out.println(m.getPriority());
        System.out.println("main");
    }
}
