
                                //Question # 02 Answer : 
                                                                       //Author : AHMED ALI ANSARI
import java.util.Scanner;
public class Runner {
	   String Name_of_Runner;
		   int Distance_covered_by_Runner;
		   String Name_of_Runner1;
		   int Distance_covered_by_Runner1;
		   
	Runner(){
		
		Name_of_Runner=" ";
		Distance_covered_by_Runner=0;
		Name_of_Runner1=" ";
		Distance_covered_by_Runner1=0;
	}
	Scanner s=new Scanner(System.in);
	 Scanner sc=new Scanner(System.in);
 void Display_input_Runner_name_distance() {

	    System.out.println("Enter First Runner Name Then His/her Distance : ");
	  
	    Name_of_Runner = sc.nextLine();
	    Distance_covered_by_Runner=s.nextInt();
		  
 }
 void Display_Runner_name_and_distance(){
		System.out.println("The name of Runner is : "+Name_of_Runner+" , distance covered by him/her : "+Distance_covered_by_Runner);
	}
 void Display_input_Runner_name_distance1() {

	 System.out.println("Enter second Runner Name Then His/her Distance : ");
	  
	    Name_of_Runner1 = sc.nextLine();
	    Distance_covered_by_Runner1=s.nextInt();	  
}
 void Display_Runner_name_and_distance1(){
		System.out.println("The name of Runner is : "+Name_of_Runner1+" , distance covered by him/her : "+Distance_covered_by_Runner1);
	}
void Display_first_Runner(){
	System.out.println(Name_of_Runner);
	System.out.println("\n");
}
void Display_first_Runner1(){
	System.out.println(Name_of_Runner1);
	System.out.println("\n");
}
}
