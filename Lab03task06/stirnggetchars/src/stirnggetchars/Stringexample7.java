package stirnggetchars;

public class Stringexample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s =new String("Hello world");
char[] ch = new char[10];
try {
	s.getChars(6, 11, ch, 0);
	System.out.println(ch);
}
catch(Exception ex) {System.out.println(ex);}


	}

}
