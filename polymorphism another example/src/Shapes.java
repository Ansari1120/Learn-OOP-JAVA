
public class Shapes {
public void area() {
	System.out.println("the formula for ");
}}
class Triangle extends Shapes{
	public void area() {
		System.out.println("base * height / 2");
	}
}
class Rectangle extends Shapes{
	public void area() {
		System.out.println("Length * width");
	}
}
class Testarea{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shapes mys=new Shapes();
mys.area();
Triangle myt=new Triangle();
myt.area();
mys.area();
Rectangle myr=new Rectangle();
myr.area();
	}

}

