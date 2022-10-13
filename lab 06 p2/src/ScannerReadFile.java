import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerReadFile {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
File text=new File("C:\\Program Files\\Java\\jdk-16.0.1\\bin/data.txt");
Scanner scnr=new Scanner(text);
while(scnr.hasNextLine()) {
	String Line=scnr.nextLine();
	System.out.println(Line);
}
	}

}
