package arrayusingforloop;
import java.util.Scanner;
public class Displayargs {

	public static void main(String args[]) {
		System.out.println("input size of array numbers : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double[] num1=new  double [num];
		double sum = 0;
		System.out.println("input elements in array : ");
		for(int i=0;i<num1.length;i++)
		{
			num1[i] = input.nextInt();
		}
		input.close();
		for(int i=0;i<num1.length;i++) {
			sum +=num1[i];
		}
		System.out.println("the sum is : "+sum);
	}
}
