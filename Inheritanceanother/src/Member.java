
public class Member {
	String Name;
	 String Adress;
	 int Phone_number;
	 int Age;
	 double Salary;
	Member(String n,String a,int pn,int g,double d){
		Name=n;
		Adress=a;
		Phone_number=pn;
		Age=g;
		Salary=d;
	}
	public void method_printsalaryempl() {
		System.out.println("The salary of the employee is =  "+Salary+" /=");
		System.out.println("\n");
	}
	public void method_printsalarymang() {
		System.out.println("The salary of the Manager is = "+Salary+" /=");
		System.out.println("\n");
		System.out.println("Below is First employe and then manager's data : ");
	}
public static class Employee extends Member{
	Employee(String n, String a, int pn, int g,double d) {
		super(n, a, pn, g,d);
		// TODO Auto-generated constructor stub
	}
	String spacializations="programming";
	String Department = "facit";
}
public static class Manager extends Member{
	Manager(String n, String a, int pn, int g,double d) {
		super(n, a, pn, g,d);
		// TODO Auto-generated constructor stub
	}
	String spacializations="Buissness marketing";
	String Department = "BBA";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj1= new Employee("wajahat","h no 315 sec 42/b north nazimabad",+920414444,34,84321.90);
Manager obj2=new Manager("farhat","h no 753 sec 51/c qasba colony",+92356563,46,56134.56);
obj1.method_printsalaryempl();
obj2.method_printsalarymang();
System.out.println("\n"+"Data Employee : "+"\n"+"Name : "+obj1.Name+"\n"+"Adress : "+obj1.Adress+"\n"+"Phone Number : "+obj1.Phone_number+"\n"+"Age : "+obj1.Age+"\n"+"Spacialization : "+obj1.spacializations+"\n"+"Department : "+obj1.Department);
System.out.println("\n");
System.out.println("\n"+"Data Manager : "+"\n"+"Name : "+obj2.Name+"\n"+"Adress : "+obj2.Adress+"\n"+"Phone Number : "+obj2.Phone_number+"\n"+"Age : "+obj2.Age+"\n"+"Spacialization : "+obj2.spacializations+"\n"+"Department : "+obj2.Department);
	
	}

}
