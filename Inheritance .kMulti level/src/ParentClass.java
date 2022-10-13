
public class ParentClass {
	void method_parent() {
		System.out.println("This is a Parent Class");
	}
}
 class SubClass extends ParentClass {
		void method_child() {
			System.out.println("this is sub/child class");}
	}
	class SubClass2 extends SubClass{
		void method_child2() {
			System.out.println("this is sub/child2 class");
		}
	}
	class Result{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	SubClass obj1=new SubClass();
	SubClass2 obj2=new SubClass2();
	obj1.method_parent();
	obj1.method_child();
	obj2.method_child2();
		}
	}

