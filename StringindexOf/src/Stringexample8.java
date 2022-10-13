
public class Stringexample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="My name is Ahmed";
//char value
int index1=s.indexOf('a');
System.out.println(index1);
//passing substirng
int index2=s.indexOf("is");
System.out.println(index2);
//passing char value from
int index3=s.indexOf("a",3);
System.out.println(index3);
//passing substring from index
int index4=s.indexOf("is",10);
System.out.println(index4);


	}

}
