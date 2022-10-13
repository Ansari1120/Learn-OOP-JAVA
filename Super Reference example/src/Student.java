
public class Student {
	String Name,id;
 Student(){
	System.out.println("Name & id displayed below");
}
 Student(String Name , String id) {
	 this.Name=Name;
	 this.id=id;
	System.out.println("Name = "+Name+" ID = "+id);
}
}
class StudentDetails extends Student{
 StudentDetails(){
		super("Shah nawaz","67.b");
	}
}
class Driver{
	public static void main(String[] args) {
		 Student obj = new Student();
		 StudentDetails obj2=new StudentDetails();
		
}
}