import java.util.HashSet;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> alphabets=new HashSet<String>();
alphabets.add("a");
alphabets.add("b");
alphabets.add("c");
alphabets.add("d");
alphabets.add("e");
alphabets.add("f");
alphabets.add("g");
System.out.println(alphabets);
alphabets.contains("z");
System.out.println(alphabets);
alphabets.remove("f");
System.out.println(alphabets);
System.out.println(alphabets.size());
for(String i:alphabets) {
	System.out.println(i);
}
alphabets.clear();
System.out.println(alphabets);

	}

}
