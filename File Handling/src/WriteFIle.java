import java.io.FileWriter;
import java.io.IOException;
public class WriteFIle {

	public static void main(String[] args) {

	try {
		FileWriter myobj=new FileWriter("F:\\COMPUTER SCIENCE\\SEMESTER 2\\presentation assignements lab task quizes\\Obeject Oriented Programming(LAB)\\handsoncodingcmdjava\\my file.txt");
		myobj.write("here is file");
		System.out.println("the file wrote successfully");
	myobj.close();
	}
	catch(IOException e) {
		System.out.println("an error occured");
		e.printStackTrace();
	}
	}

}
