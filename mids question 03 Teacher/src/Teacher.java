                             //Question # 04 Answer : 
                                                                       //Author : AHMED ALI ANSARI
public class Teacher {
String name;
int grades;
double salary;
Teacher(String n,int g,double s){
	name=n;
	grades=g;
	salary=s;
}
Teacher(){
	name=" ";
	grades=0;
	salary=0;
}
void Display() {
	System.out.println("the name is : "+name+", grades : "+grades+", salary : "+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher obj1=new Teacher("Shah nawaz",4,56780.12);
Teacher obj2=new Teacher("Yasir nawaz",6,86520.78);
Teacher obj3=new Teacher();
obj1.Display();
obj2.Display();
obj3.Display();
	}

}
