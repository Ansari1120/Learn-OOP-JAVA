interface Stringfunction{
	String run(String str);
}
public class Main3 {

	public static void main(String[] args) {
Stringfunction exclaim=(s)->s+"!";
Stringfunction ask=(s)->s+"?";
printFormatted("hello",exclaim);
printFormatted("hello",ask);
	}
	public static void printFormatted(String str,Stringfunction format) {
		String result=format.run(str);
		System.out.println(result);  //lambda expression as a parameter
	}

}
