
public class Animal {
	public void move() {
System.out.println("Animal can move");
	}}
	class Dog extends Animal{
		public void move() {
			System.out.println("Dogs can walk and run");
		}
	}
 class TestDog{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Animal();
Dog b=new Dog();
a.move();
b.move();
	}
}
