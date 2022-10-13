
public class Student {
int id;
String name;

Student(int i,String n){
	id = i;
	name = n;
}
void display() {System.out.println(id+" "+name);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student(122,"Shahid");
Student s2 = new Student(421,"Kamal");

s1.display();
s2.display();
	}

}
