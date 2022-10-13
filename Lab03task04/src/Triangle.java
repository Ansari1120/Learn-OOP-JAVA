
public class Triangle {

	int a,b,c;
	public double getperimeter(){
		return (a+b+c);
	}
	Triangle(int d,int r,int k ){
		a=d;
		b=r;
		c=k;
	}
static class result{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Triangle s = new Triangle(3,4,5);
s.display();
System.out.println("The Perimeter of Triangle "+s.getperimeter());
	}
}
public void display() {
	// TODO Auto-generated method stub
	
}
}