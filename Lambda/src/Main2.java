import java.util.function.Consumer;
import java.util.ArrayList;
public class Main2 {

	public static void main(String[] args) {
ArrayList<Integer>obj=new ArrayList<Integer>();
obj.add(1);
obj.add(2);
obj.add(3);
Consumer<Integer>method=(n)->{System.out.println(n);};
obj.forEach(method);
	}

}
//lambda expression in a variable