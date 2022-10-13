
public class MyClass {
int i;
private MyClass() {
	i=5;
	System.out.println("The Constructor is Called");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyClass s=new MyClass();
System.out.println("the value of i is : "+s.i);
	}

}
