package exceptionHandling;

public class Throws {
    public static void main(String args[]) throws InterruptedException{
        dostuff();
    }

    public static void dostuff() throws InterruptedException {
        doMoreStuff();
    }

    public static void doMoreStuff() throws InterruptedException{
        Thread.sleep(1000);
    }
}
