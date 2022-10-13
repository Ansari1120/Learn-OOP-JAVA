import java.util.ArrayList;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> alphabets=new ArrayList<String>();
alphabets.add("a");
alphabets.add("b");
alphabets.add("c");
alphabets.add("d");
alphabets.add("e");

Iterator<String> it=alphabets.iterator();
System.out.println(it.next());

while(it.hasNext()) {
	System.out.println(it.next());
}
ArrayList<Integer> numbers=new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);

Iterator<Integer> it2=numbers.iterator();

while(it.hasNext()) {
	Integer i=it2.next();
	if(i<3) {
		it2.remove();
}
}
System.out.println(numbers);
	}

}
