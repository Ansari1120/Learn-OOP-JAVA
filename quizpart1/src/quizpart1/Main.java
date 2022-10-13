package quizpart1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("enter Stirng");
		Scanner myobj = new Scanner(System.in);
		String input = myobj.nextLine();
		
		System.out.println("the length is : "+input.length());
		int index1 = input.indexOf('i');
		char ch = input.charAt(0);
		System.out.println(ch+" at index of "+index1);
		
		int index2 = input.indexOf("java");
		System.out.print(input.substring(7)+" at index of "+index2);	
	}

}