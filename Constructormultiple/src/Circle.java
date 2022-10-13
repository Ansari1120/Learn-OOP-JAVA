
public class Circle {
	public double x,y,r; //instance variables
	// Constructors
	public Circle(double centreX, double centreY, double radius)
	{ 
		x = centreX; y = centreY; r = radius;
	}
	public Circle(double radius) { x=0; y=0; r = radius; }
	public Circle() { x=0; y=0; r=1.0; }

	//Methods to return circumference and area
	public double circumference() { return 2*3.14*r; }
	public double area() { return 3.14 * r * r; }
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("the circumference is : "+circumference());
		System.out.println("the area is : "+ area());
	}
	}
