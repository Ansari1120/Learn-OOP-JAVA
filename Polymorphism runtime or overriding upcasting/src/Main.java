
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal A=new Animal();
Animal H=new Herbivores(); //Upcasting
Animal C=new Carnivores(); //Upcasting
Animal O=new Omnivores();  //Upcasting
A.method_eat();
H.method_eat();
C.method_eat();
O.method_eat();
	}
}
