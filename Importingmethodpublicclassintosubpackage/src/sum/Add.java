package sum;

public class Add {
	int a=24,b=13,sum,sub;
	public void sum(int s,int v) {
		a=s;
		b=v;
	}
	public int method_add() {
		return sum = a+b;
	}
	public int method_sub() {
		return sub = a-b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add s=new Add();
System.out.println("the addition is "+s.method_add());
System.out.println("the substraction is  is "+s.method_sub());
	}

}
