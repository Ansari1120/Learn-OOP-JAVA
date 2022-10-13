
package userinputanother;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("enter a number");
		int number = reader.nextInt();
		System.out.println("you have entered a "+number);
	}

}
