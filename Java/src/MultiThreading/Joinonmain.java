package MultiThreading;

public class Joinonmain {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
//deadlock