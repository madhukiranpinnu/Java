package MultiThreading;
class Mythread9 extends Thread{
    static Thread mt;
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("child");
        }
    }

}
public class JoinDemo2 {
    public static void main(String[] args){
        Mythread9 t=new Mythread9();
        Mythread9.mt=Thread.currentThread();
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("main");
        }
    }
}
