package MultiThreading;
class MyThread5 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
        }

public class NamingThreadDemo {
    public static void main(String args[]){
        MyThread5 t=new MyThread5();
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
