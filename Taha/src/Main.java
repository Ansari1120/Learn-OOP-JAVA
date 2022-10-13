		import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	   
	  
		        System.out.println("Enter numbers");
		        
		       Scanner input = new Scanner(System.in);
		       int num1=input.nextInt();
		   	double[] array=new double[num1];
			 
		    System.out.println("Enter elements of array");
		    for(int i=0;i<array.length;i++)
			{
				array[i]=input.nextDouble();
			}
		    input.close();
		    double sum = 0;
					for(int i=0;i<array.length;i++)
					{
						sum=sum + array[i];
					}
		        System.out.println("The sum is "+sum);
		       
		     }
	}
