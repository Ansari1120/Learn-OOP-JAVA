package Rectangle;

public class Rectangle {
	public static double r;
	double length,breadth;
	static double result;
	Rectangle(double l,double b){
		length=l;
		breadth=b;
	}
	void method_calulate_area() {
		result=length*breadth;
		System.out.println("the area of rectangle is = : "+result);
	}
	void method_calulate_perimeter() {
		result=2*(length+breadth);
		System.out.println("the perimeter of rectangle is = : "+result);
	}
	
	public static class Square extends Rectangle{
			
			Square(double result) {
			super(result, result);
			// TODO Auto-generated constructor stub
		}
			// TODO Auto-generated constructor stub
			// TODO Auto-generated constructor stub
			void method_calculate_area2() {
				double result2 = result*result;
				System.out.println("the area of Square is = : "+result2);
			}
			void method_calculate_perimeter2() {
				double result2 = 4*result;
				System.out.println("the perimeter of Square is = : "+result2);
			}
			public static void main(String args[]){
				Rectangle obj1=new Rectangle(24,41);
			obj1.method_calulate_area();
			obj1.method_calulate_perimeter();
			Square obj2=new Square(result);
			obj2.method_calculate_area2();
			obj2.method_calculate_perimeter2();
			}
}
}
