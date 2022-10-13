import java.util.Scanner;
public class ScannerReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "Welcome \n to \n the Dreamworld resort \n Quest Karachi ";
Scanner scnr=new Scanner(text);
while(scnr.hasNextLine()) {
	String Line=scnr.nextLine();
	System.out.println(Line);
}
	}

}
