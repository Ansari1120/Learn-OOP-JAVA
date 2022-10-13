
public class UseStatic {
static int a=3;
static int b;
static void meth(int x) {
	System.out.println("x = "+x);
	System.out.println("a = "+a);	
	System.out.println("b = "+b);
}
static {
	System.out.println("static block initialized");
	b=a*4;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
meth(42);
	}

}

/**static prevent using of object creation in order to call out method/
 *  and the file name constructor declared static will run first 
means shown at the top of the console display*/