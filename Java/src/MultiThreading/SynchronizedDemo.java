package MultiThreading;
class Display{
    public synchronized void wish(String name){
        for(int i=0;i<10;i++){
            System.out.print("Happy Birthday :");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }

    }
}
class Mythread11 extends Thread{
    Display d;
    String name;
    Mythread11(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
public class SynchronizedDemo {
    public static void main(String args[]){
        Display d1=new Display();
        Mythread11 mt=new Mythread11(d1,"madhu");
        mt.start();
        Mythread11 mt1=new Mythread11(d1,"sai");
        mt1.start();

    }
}
