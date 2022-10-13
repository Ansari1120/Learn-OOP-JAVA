package userinputname;
import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner myobj = new Scanner(System.in);

System.out.println("enter username");
String username = myobj.nextLine();
System.out.println("Username is : "+username);
myobj.close();
	}


}
