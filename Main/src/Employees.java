
import java.util.Scanner;
class Employees{
    int number;
    String name;
    float salary; // Member Data 

    void displayData(int eNum,String eName,float eSalary){ // Member Function
        number= eNum;
        name = eName;
        salary = eSalary;
        System.out.println("\nEmployee Number Is: "+number+"\nEmployee Name Is: "+name+"\nEmployee Salary Is: "+salary);
    }
}
class MainClass{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employees e1 = new Employees();
        Employees e2 = new Employees();
        Employees e3 = new Employees();

        System.out.println("Enter Employee Name: ");
        String name1  = sc.next();
        System.out.println("Enter Employee Number: ");
        int number1  = sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        float salary1 = sc.nextFloat();

        System.out.println("Enter Employee Name: ");
        String name2  = sc.next();
        System.out.println("Enter Employee Number: ");
        int number2  = sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        float salary2 = sc.nextFloat();

        System.out.println("Enter Employee Name: ");
        String name3  = sc.next();
        System.out.println("Enter Employee Number: ");
        int number3  = sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        float salary3 = sc.nextFloat();


        e1.displayData(number1, name1, salary1);
        e2.displayData(number2, name2, salary2);
        e3.displayData(number3, name3, salary3);

    }
}
