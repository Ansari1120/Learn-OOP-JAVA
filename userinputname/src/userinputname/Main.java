package userinputname;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first name = ");
		Scanner input = new Scanner(System.in);
		String firstname = input.nextLine();
		System.out.println("Enter middle name  = ");
		String middlename = input.nextLine();
		System.out.println("Enter last name  = ");
		String lastname = input.nextLine();
		input.close();
		System.out.println(firstname+" "+middlename+" "+lastname);
		
	}

}
