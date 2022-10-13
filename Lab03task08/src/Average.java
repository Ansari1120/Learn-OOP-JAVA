import java.util.Scanner;
public class Average {
	double n1,n2,n3;
public Average(double v1,double v2,double v3) {
	n1=v1;
	n2=v2;
	n3=v3;
}
double method_calculate() {
	return (n1+n2+n3/3);
}
public void print_average(){
	System.out.println("The Average of three values is  ="+method_calculate());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter any three numbers : ");
double s1=input.nextInt();
double s2=input.nextInt();
double s3=input.nextInt();
input.close();
Average s4 = new Average(s1,s2,s3);
s4.print_average();
	}

}
