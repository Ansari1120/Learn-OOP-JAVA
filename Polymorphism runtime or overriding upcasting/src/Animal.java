
public class Animal {
void method_eat() {
	System.out.println("Kinds of eating by diffrent Animals");  
}
}
class Herbivores extends Animal{                             //Hirarchial Inheritance
	void method_eat() {
		System.out.println("Herbivores eat plants");
	}
}
class Carnivores extends Animal{
	void method_eat() {
		System.out.println("Carnivores eat plants & meat");
	}
}
class Omnivores extends Animal{
	void method_eat() {
		System.out.println("Omnivores eat meat ");
	}
}

