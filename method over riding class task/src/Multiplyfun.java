
public class Multiplyfun {
public void Multiplyfun(int a,int b) {
	System.out.println("Multiply = "+a*b);
}
public void Multiplyfun(double a,double b) {
	System.out.println("Multiply = "+a*b);
}
}
class Driver{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multiplyfun obj=new Multiplyfun();
obj.Multiplyfun(5, 12);
obj.Multiplyfun(67.4, 51.5);
	}

}
