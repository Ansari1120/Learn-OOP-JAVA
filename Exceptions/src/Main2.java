
public class Main2 {
static void Test(int check) {
	if(check<18) {
		throw new ArithmeticException("access denied --you must at least 18 years old");
	}
	else {
		System.out.println("access granted !");
	}
}
	public static void main(String[] args) {  //throw actions include FileNotFoundException,ArrayIndexOutOfBoundsException,SecurityException..
Main2 obj=new Main2();
Main2.Test(3);
	}
}
