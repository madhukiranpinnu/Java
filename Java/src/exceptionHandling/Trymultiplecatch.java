package exceptionHandling;

public class Trymultiplecatch
{
    public static void main(String args[]){
        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch (NullPointerException ne){
            System.out.println(ne.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
