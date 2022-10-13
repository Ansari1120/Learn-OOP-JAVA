package methodoverriding;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Animal();
Dog d=new Dog();
a.move();
d.bark();
d.move();
	}

}
