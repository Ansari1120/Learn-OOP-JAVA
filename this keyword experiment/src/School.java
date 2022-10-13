
public class School {
String name;
int roll_no;
double fee;
School(String name,int roll_no,double fee){
	this.name=name;
	this.roll_no=roll_no;
	this.fee=fee;
}
}
class SchoolB extends School{
	
SchoolB(String name, int roll_no, double fee) {
		super(name, roll_no, fee);
		// TODO Auto-generated constructor stub
		this.name=name;
		this.roll_no=roll_no;
		this.fee=fee;
	}
}
class SchoolC extends School{
	
        
	SchoolC(String name, int roll_no, double fee) {
		super(name, roll_no, fee);
		// TODO Auto-generated constructor stub
		name=name;
		roll_no=roll_no;
		fee=fee;
	}
}
class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
School s=new School("a",1,2.1);
System.out.println(s);
SchoolB s2=new SchoolB("b",2,3.2);         // how to access same values of second class to third class?
System.out.println(s2);


	}

}
