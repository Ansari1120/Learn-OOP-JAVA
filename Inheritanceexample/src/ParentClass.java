
public class ParentClass {
void method_parent() {
	System.out.println("This is a Parent Class");
}
public static class SubClass extends ParentClass {
	void method_child() {
		System.out.println("this is sub/child class");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentClass obj1=new ParentClass();
SubClass obj2=new SubClass();
obj1.method_parent();
obj2.method_child();
obj2.method_parent();
	}
}
}
