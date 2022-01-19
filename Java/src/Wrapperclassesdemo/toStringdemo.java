package Wrapperclassesdemo;

public class toStringdemo {
    public static void main(String[] args){
        String s=Integer.toString(10);
        System.out.println(s);
        Integer i=new Integer("10");
        System.out.println(i);
        System.out.println(i.toString());
        String s1=Integer.toString(15,2);
        System.out.println(s1);
        String s2=Integer.toHexString(15);
        System.out.println(s2);
    }
}
