
public class Shapes {
void method_area() {
	System.out.println("Find Area");
}
public void method_area(int r) {
	System.out.println("the area of circle = "+3.14*r*r);
}
public void method_area(double b,double h) {
	System.out.println("the area of Triangle = "+0.5*b*h);
}
public void method_area(int l,int b) {
	System.out.println("the area of Rectangle = "+l*b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shapes obj=new Shapes();
obj.method_area();
obj.method_area(7);
obj.method_area(45.0,11.0);
obj.method_area(45, 11);
	}

}
