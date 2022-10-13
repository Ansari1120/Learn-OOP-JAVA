
public class Main {
	int a,b;
final int x=15;    //cannot be alter and assigned in constructor 
void method(){
	System.out.println("product"+x*3);
}
final void method2() {
	System.out.println("Sum"+(x+3));    // cannot be overriden as final declared
}
void SetData(int a,int b) {
	this.a=a;
	this.b=b;         // this used for differ bt instance and local variable
}
void method3() {
	System.out.println("Substraction "+(a-b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main m=new Main();
m.SetData(4,3);
m.method();
m.method2();
m.method3();
	}

}
