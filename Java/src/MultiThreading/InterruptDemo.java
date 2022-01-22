package MultiThreading;
class Test extends Thread{
    public void run(){
        try{
            for (int i=0;i<10;i++){
                System.out.println("child");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interuption happend");
        }
    }
}
public class InterruptDemo {
    public static void main(String[] args){
        Test t=new Test();
        t.start();
        t.interrupt();
        System.out.println("main");
    }
}
