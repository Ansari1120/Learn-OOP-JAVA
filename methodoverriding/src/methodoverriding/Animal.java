package methodoverriding;

public class Animal {
public void move() {
	System.out.println("Animal Can move");
}}
class Dog extends Animal{
	public void move() {
		System.out.println("Dogs can walk and Run");
	}
	public void bark() {
		System.out.println("Dogs can Bark");
	}
}