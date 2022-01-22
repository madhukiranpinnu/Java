package MultiThreading;
class Mythread3 extends Thread{
    public void run(){
        System.out.println("no-arg");
    }
    public void run(int i){
        System.out.println("int-arg");
    }
}

public class RunOverloading {
    public static void main(String args[]){
        Mythread3 m=new Mythread3();
        m.start();
        m.run(7);
    }
}
