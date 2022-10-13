
public class Employee {
	
	String empname;
	int emplyearofjoining;
	String empadress;
	void insert(String n ,int e, String d) {
		empname = n;
		emplyearofjoining = e;
		empadress = d;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();

	e1.insert("Robert",1994,"64C- WallsStreat");
	e2.insert("Sam",2000,"68D- WallsStreat");
	e3.insert("John",1999,"26B- WallsStreat");
	
	System.out.println("EMPLOYEE 01 DATA");

	System.out.println("Name = " +e1.empname);
	System.out.println("employee year of joining = " +e1.emplyearofjoining);
	System.out.println("Salary = " +e1.empadress);
	
	System.out.println("EMPLOYEE 02 DATA");
	
	System.out.println("Name = " +e2.empname);
	System.out.println("employee year of joining = " +e2.emplyearofjoining);
	System.out.println("Salary = " +e2.empadress);
	
	System.out.println("EMPLOYEE 03 DATA");
	
	System.out.println("Name = " +e3.empname);
	System.out.println("employee year of joining = " +e3.emplyearofjoining);
	System.out.println("Salary = " +e3.empadress);
		}
	}
