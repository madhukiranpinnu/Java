package MultiThreading;
class My extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("interupted");
        }
    }

}
public class Interruptjava {
    public static void main(String[] args){
        My t=new My();
        t.start();
        t.interrupt();
        System.out.println("main");
    }
}
