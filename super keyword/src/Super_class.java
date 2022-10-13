class Super_class {
int num=20;
public void display() {
	System.out.println("display of superclass");
}
}
 class Sub_class extends Super_class{
	int num = 10;
	public void display() {
		System.out.println("display of subclass");
}
	public void my_method() {
		display();
		super.display();
		System.out.println("num in subclass : "+num);
		System.out.println("num in subclass : "+super.num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sub_class obj=new Sub_class();
obj.my_method();
	}

}
