
public class StaticDemo {
static int a=42;
static int b=99;
static void callme() {
	System.out.println("a= "+a);
}}
class StaticByName{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticDemo.callme();
System.out.println("b= "+StaticDemo.b);
	}

}