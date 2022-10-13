
public class Ageclass {
int age;
Ageclass(int age){
	this.age=age;
}
public void getAge() {
	System.out.println("age in superclass : "+age);
}
}
 class Age extends Ageclass{
	Age(int age){
		super(age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Age a=new Age(24);
a.getAge();
	}

}
