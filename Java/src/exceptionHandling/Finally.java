package exceptionHandling;

public class Finally {
    public static void main(String args[]){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(10/2);
        }
        finally {
            System.out.println("finally");
        }
    }
}
