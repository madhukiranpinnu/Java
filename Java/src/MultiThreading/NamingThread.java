package MultiThreading;
class MyThread4 implements Runnable{

    @Override
    public void run() {
        System.out.println("madhu");
    }
}
public class NamingThread {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("madhu");
        System.out.println(Thread.currentThread().getName());
        Thread t=new Thread();
        System.out.println(t.getName());
        Thread t1=new Thread();
        System.out.println(t1.getName());
        Thread t2=new Thread("kiran");
        System.out.println(t2.getName());
    }
}
