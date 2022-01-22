package MultiThreading;
class Mythread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child");
            Thread.yield();
        }
    }
}
public class YieldDemo {
    public static void main(String[] args){
        Mythread t=new Mythread();
        t.start();
        for(int j=0;j<10;j++){
            System.out.println("main");
        }
    }
}
