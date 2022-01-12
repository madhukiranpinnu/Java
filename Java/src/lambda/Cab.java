package lambda;
@FunctionalInterface
interface cab1{
    public void bookCab(String source,String destination);
}
public class Cab {
    public static void main(String args[]){
        cab1 c=(source, destination) -> System.out.println(source+"--------"+destination);
        c.bookCab("hyderabad","Benguluru");
    }
}
