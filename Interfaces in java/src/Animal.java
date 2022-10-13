
interface Animal {
void Animalaction();  //public abstract writtern by default alongwith
default void AnimalName() {
	System.out.println("AnimalName");
}
}
class Parrot implements Animal{
	public void Animalaction() {
		System.out.println("Parrot Crooning");
	}
	static void NameParrot() {
		System.out.println("alfie");
	}
}
class Monkey implements Animal{
	public void Animalaction() {
		System.out.println("Monkey Juggling");
	}
	protected void NameMonkey() {
		System.out.println("King kong");
	}
}
class Test{
	public static void main(String []args) {
		Parrot p=new Parrot();
		p.AnimalName();
		p.Animalaction();
		Monkey m=new Monkey();
		m.AnimalName();
		m.Animalaction();
	}
}

