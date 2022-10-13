//primitve data types also act as classes called wrapper classes
//wrapper classes can be called out simply or by methods like doubleValue(); etc
//we can convert int to string using to string method and call it out with .length method.
public class Main {

	public static void main(String[] args) {
Integer myint=55;
Character myChar = 'A';
Double mydouble=42.11;
System.out.println(myint+"\t"+myChar+"\t"+mydouble+"\t");
System.out.println("-------------------------------\t");
System.out.println(myint.intValue()+"\t"+myChar.charValue()+"\t"+mydouble.doubleValue()+"\t");
String mystring=myint.toString();
System.out.println(mystring.length());

	}

}
