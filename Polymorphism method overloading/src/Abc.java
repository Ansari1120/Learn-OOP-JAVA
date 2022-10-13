
public class Abc {
void Sum()
{
	int x=5,y=10;
	System.out.println("Sum"+(x+y));
	
}
void Sum(int a)
{
	System.out.println("Sum"+(a+a));
}
void sum(int a,int b) {
	System.out.println("Sum"+(a+b));
}
int Sum(int a,int b , int c) {
	System.out.println("Sum"+(a+b+c));
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abc obj=new Abc();
obj.Sum();
obj.Sum(5);
obj.sum(5, 10);
obj.Sum(5, 10, 15);
	}
}

