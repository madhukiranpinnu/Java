package lambda;
@FunctionalInterface
interface cab
{
    public void bookcab();
}
public class Test {
    public static void main(String args[]){
        cab b=()->System.out.println("hello");
        b.bookcab();
    }
}
