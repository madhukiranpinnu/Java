package MultiThreading;
class Thread13 extends Thread{
    int total=0;
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total = total + i;
            }
            this.notify();
        }
    }
}
public class Interthreadcommunication {
    public static void main(String[] args) throws InterruptedException {
        Thread13 t=new Thread13();
        t.start();
        synchronized (t){
            t.wait();
        }
        System.out.println(t.total);
    }
}
