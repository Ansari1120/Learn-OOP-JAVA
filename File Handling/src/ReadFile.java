import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {

	public static void main(String[] args)throws FileNotFoundException {
File obj=new File("F:\\COMPUTER SCIENCE\\SEMESTER 2\\presentation assignements lab task quizes\\Obeject Oriented Programming(LAB)\\handsoncodingcmdjava\\bio.txt");
	Scanner read=new Scanner(obj);
	while(read.hasNextLine()) {
		String data=read.nextLine();
		System.out.println(data);
		read.close();
	}
	
	
	}

}
