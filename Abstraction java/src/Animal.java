
public abstract class Animal {        //abstract class
abstract void Animalsound();
void sleep() {             //regular method 
	System.out.println("Zzzz");
}
}
class Dog extends Animal{
	void Animalsound() {
		System.out.println("the dog barking");
	}
}
class Cat extends Animal{
	void Animalsound() {
		System.out.println("Cat is meowing");
	}
}
class Main{
public static void main(String []args) {
	Dog d=new Dog();
	d.Animalsound();
	d.sleep();
	Cat c=new Cat();
	c.Animalsound();
}
}
