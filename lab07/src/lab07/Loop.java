package lab07;
import java.util.Scanner;


public class Loop {
static String n;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		    System.out.println("want to print the table : ? y/n");
		    String input = scanner.nextLine();
		    if (input.equals("n")||input.equals("N")||input.equals("No")||input.equals("no")) {
		        break;
		        
		    }
		    System.out.print("Input a number: ");
		    int num1 = scanner.nextInt();
		    System.out.print("Input range of the table : ");
		     int num2=scanner.nextInt();
		    for (int i=0; i<=num2; i++){
		     System.out.println(num1 + " x " + (i+1) + " = " + 
		       (num1 * (i+1)));
		    }
		}

		System.out.println("Program Terminated!");
		  
		  
}
}