package exceptionHandling;

public class Nestedtrycatch {
    public static void main(String args[]){
        try{
            System.out.println("outer try block");
            try{
                System.out.println(10/0);
            }
            catch (NullPointerException e){
                System.out.println("null pointer");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Arthematic Exception");
        }
        finally{
            System.out.println("finally");
        }
    }
}
