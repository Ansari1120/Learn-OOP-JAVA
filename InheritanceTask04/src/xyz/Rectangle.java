package xyz;

class Shape {
	 void method_ToPrintShape() {
		// TODO Auto-generated method stub
		System.out.println("This is shape");
	}
}
 class Rectangle extends Shape{	
	void method_ToPrintrectangle() {
		// TODO Auto-generated method stub
		System.out.println("This is rectangular shape");
	}
 }
 class Circle extends Shape{
		public void method_ToPrintShape() {
			System.out.println("This is circular shape");
		}
	}
 class Square extends Rectangle {
		public void method_ToPrintSquare() {
			// TODO Auto-generated method stub
			System.out.println("Square is a Rectangle");}

static class Result{
	public static void main(String args[]) {
		Square obj=new Square();
		obj.method_ToPrintShape();
		obj.method_ToPrintrectangle();
	}
}
 }

