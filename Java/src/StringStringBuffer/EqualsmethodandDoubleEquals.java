package StringStringBuffer;

public class EqualsmethodandDoubleEquals {

	public static void main(String[] args) {
String s1=new String("durga");
String s2=new String("durga");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
//StringBuffer
StringBuffer sb1=new StringBuffer("durga");
StringBuffer sb2=new StringBuffer("durga");
System.out.println(sb1==sb2);
System.out.println(sb1.equals(sb2));

	}
}
