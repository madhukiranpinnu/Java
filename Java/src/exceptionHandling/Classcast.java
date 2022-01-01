package exceptionHandling;

public class Classcast {
    public static void main(String args[]){
        Object o=new Object();
        String s=(String) o;
        System.out.println(s);
    }
}
