import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
LinkedList <String> cars=new LinkedList<String>();
cars.add("Suzuki");
cars.add("mazda");
cars.add("Toyota");
cars.add("audi");

cars.addFirst("Mg");
System.out.println(cars);
cars.addLast("bogatti");
System.out.println(cars);
cars.removeLast();
System.out.println(cars);
cars.getFirst();
System.out.println(cars);
cars.getLast();
System.out.println(cars);

	}

}
