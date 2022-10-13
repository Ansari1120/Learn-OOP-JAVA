package calculator;

public class Calculator {
	void add(int y , int j)
	{
		System.out.println("the sum is = "+(y+j));
	}
	void sub(int y , int j)
	{
		System.out.println("the sub is = "+(y-j));
	}
	void mul(int y , int j)
	{
		System.out.println("the mul is = "+(y*j));
	}
	void div(int y , int j)
	{
		System.out.println("the div is = "+(y/j));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator myobj = new Calculator();
myobj.add(7, 8);
myobj.sub(3,5);
myobj.mul(74, 2);
myobj.div(4, 4);
	}

}
