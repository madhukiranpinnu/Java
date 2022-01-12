package lambda;
@FunctionalInterface
interface Square1{
    public int squaremethod(int a);
}
public class Squaredemo {
    public static void main(String args[]){
        Square1 s=(a)->a*a;
        int b=s.squaremethod(4);
        System.out.println(b);
    }
}
