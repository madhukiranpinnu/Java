package MultiThreading;
class Mythread2 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("childThread");
        }
    }
}

public class GenrateThread2 {
    public static void main(String[] args){
        Mythread2 t1=new Mythread2();
        Thread t=new Thread(t1);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("MainThread");
        }
    }
}
