
public class Stringexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hell";
String s1="Hello";
String s2="Hello";
String s3="java";
//equalsto method//
System.out.println(s.equals(s1));
System.out.println(s1.equals(s2));

// == operator method//
String s4 = new String("java");

System.out.println(s1==s2);
System.out.println(s3==s4);
//comapre to method//
System.out.println(s.compareTo(s2)); //returns -1 cuz s<s2//
System.out.println(s1.compareTo(s2));// returns 0 cuz s1==s2//
System.out.println(s2.compareTo(s));//returns 1 cuz s2>s1//
	}

}
