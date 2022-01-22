package MultiThreading;
class MyThread8 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinDemo {
    public static void main(String args[]) throws InterruptedException {
        MyThread8 t=new MyThread8();
        t.start();
        t.join(10000);
        for(int i=0;i<10;i++){
            System.out.println("main");
        }
    }
}
