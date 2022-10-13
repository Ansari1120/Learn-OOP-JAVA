
public class Triangle {

	int a,b,c;
	public double getarea(){
		return (a+b+c)/2.0;
	}
	public double getperimeter(){
		return (a+b+c);
	}
static class result{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Triangle t= new Triangle();
t.a=3;
t.b=4;
t.c=5;
System.out.println("The area of Triangle "+t.getarea());
System.out.println("The Perimeter of Triangle "+t.getperimeter());
	}
}
}
