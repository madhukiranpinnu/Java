package exceptionHandling;

public class Illeagalstate {
    public static void main(String args[]){
        Thread t=new Thread();
        t.start();
        t.start();
    }
}
