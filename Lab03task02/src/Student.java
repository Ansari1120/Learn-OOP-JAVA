
public class Student {
	String name;
	int rollnumber;
	String Phonenumber;
	static String adress;
	void insert(String n,int r,String p,String a) {
		name=n;
		rollnumber=r;
		Phonenumber=p;
		adress=a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.insert("Sam", 7, "03045262211", "street03 sec 4/b h no 625");
		Student s1=new Student();
		s1.insert("john", 2, "03365762263", "street05 sec 11/c h no 5261");
		
System.out.println("the roll number is "+s.rollnumber+" & the name is "+s.name+" & the phone number is "+s.Phonenumber+" & the adress is "+adress);

System.out.println("the roll number is "+s1.rollnumber+" & the name is "+s1.name+" & the phone number is "+s1.Phonenumber+" & the address is "+adress);

	}

}
