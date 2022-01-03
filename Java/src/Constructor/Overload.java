package Constructor;

public class Overload {
    Overload(double d){
        this(10);
        System.out.println("double arg");
    }
    Overload(int i){
        this();
        System.out.println("int arg");
    }
    Overload(){
        System.out.println("no arg");
    }
    public static void main(String args[]){
        Overload o1=new Overload(10.5);
        Overload o2=new Overload(10);
        Overload o3=new Overload();

    }

}
