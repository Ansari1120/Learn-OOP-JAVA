
public class Rectangle {
int length;
int breadth;

Rectangle(int l , int b){
	length = l;
	breadth=b;
}
 public int getarea() {
	 return length*breadth;
 }
 public int getperimeter() {
	 return 2*(length+breadth);
 }
 public static class result{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle a=new Rectangle(4,5);
Rectangle b=new Rectangle(5,8);
System.out.println("Area : "+a.getarea()+" & Perimeter : "+a.getperimeter());
System.out.println("Area : "+b.getarea()+" & Perimeter : "+b.getperimeter());

	}
}
}