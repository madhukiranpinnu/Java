package StringStringBuffer;

public class StringConcepts {

	public static void main(String[] args) {
//Seqquence of charecters is string
		//String is immutable
		String s=new String("durga");
		s.concat("software");
		System.out.println(s);//durga because we havent used any reference variable
		//string buffer
		StringBuffer sb =new StringBuffer("durga");
		sb.append("software");
		System.out.println(sb);//mutable
		//we can do any operation in string Buffer
	}

}
