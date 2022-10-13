import java.util.Scanner;

public class UserInput {
	 static double num1;
	 static double num2;
UserInput(double num1,double num2){
	this.num1=num1;
	this.num2=num2;
}
Scanner scanner_object=new Scanner(System.in);
void method_select() {
	System.out.println("enter your choice from 1 to 4 : ");
	int choice=scanner_object.nextInt();
	System.out.println("------------1 : ADDITION-------------");
	System.out.println("------------2 : SUBSTRACTION-------------");
	System.out.println("------------3 : MULTIPLICATION-------------");
	System.out.println("------------4 : DIVISION-------------");
		System.out.println("Enter First Number : ");
		num1=scanner_object.nextDouble();
		System.out.println("Enter Second Number : ");
		num2=scanner_object.nextDouble();
		switch(choice){
			case 1:
				System.out.println("Addition of your enter two numbers is : "+(num1+num2));
				break;
			case 2:
				System.out.println("Substraction of your enter two numbers is : "+(num1-num2));
                break;
			case 3:
				System.out.println("Multiplication of your enter two numbers is : "+(num1*num2));
                break;
                case 4:
					System.out.println("Division of your enter two numbers is : "+(num1/num2));
                    break;
		}
}
	class result{
	public void main(String[] args) {
		UserInput object1=new UserInput(num1,num2);
		 object1.method_select();
	}
	}

}
