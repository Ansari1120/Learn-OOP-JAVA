
public class Employee {
	int emplid;
	String empname;
	double empsalary;
	void insert(int e,String n, double d) {
		emplid = e;
		empname = n;
		empsalary = d;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();

	e1.insert(12,"saqib",12341);
	e2.insert(34,"ghazanfar",31600);
	e3.insert(23,"hamad",4234.42);
	
	System.out.println("EMPLOYEE 01 DATA");
	
	System.out.println("Number = " +e1.emplid);
	System.out.println("Name = " +e1.empname);
	System.out.println("Salary = " +e1.empsalary);
	
	System.out.println("EMPLOYEE 02 DATA");
	
	System.out.println("Number = " +e2.emplid);
	System.out.println("Name = " +e2.empname);
	System.out.println("Salary = " +e2.empsalary);
	
	System.out.println("EMPLOYEE 03 DATA");
	
	System.out.println("Number = " +e3.emplid);
	System.out.println("Name = " +e3.empname);
	System.out.println("Salary = " +e3.empsalary);
		}
	}