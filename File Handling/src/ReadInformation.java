import java.io.File;
import java.io.IOException; 
public class ReadInformation {

	public static void main(String[] args) {
File obj=new File("F:\\COMPUTER SCIENCE\\SEMESTER 2\\presentation assignements lab task quizes\\Obeject Oriented Programming(LAB)\\handsoncodingcmdjava\\bio.txt");
	if(obj.exists()) { //check the file is at the location given....
		System.out.println("the file name is : "+obj.getName());
		System.out.println("the file path is : "+obj.getAbsolutePath());
		System.out.println("the file readed is : "+obj.canRead());
		System.out.println("the file size is : "+obj.length());
	}
	else {
		System.out.println("the file does not exist");

	}
	}
}
