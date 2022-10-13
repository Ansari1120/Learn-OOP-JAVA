
import java.util.Scanner;
public class Bankaccount {
	int total;
	Scanner scn=new Scanner(System.in);
    protected  static String Customer_Name;
    protected String Customer_AC_No;
     protected int Customer_Balance;
	protected static int Withdraw;
    void User_Input() {
    System.out.println("Enter your Name  : ");
    Customer_Name=scn.next();
    System.out.println("Enter your Account Number  : ");
    Customer_AC_No=scn.next();
   	
    }}
class Another extends Bankaccount{
	public static int getWithdraw() {
		return Withdraw;
	}
	public static void setWithdraw(int withdraw) {
		Withdraw = withdraw;
	}
	public static String getCustomer_Name() {
		return Customer_Name;
	}
	public static void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getCustomer_AC_No() {
		return Customer_AC_No;
	}
	public void setCustomer_AC_No(String customer_AC_No) {
		Customer_AC_No = customer_AC_No;
	}
	void Customer_Balance(){ 
		 System.out.println("Enter Amount your balance : ");
    	 Customer_Balance=scn.nextInt();
    	 boolean amnt=false;
        while(!amnt){
        if(Customer_Balance > 1){
        	 total += Customer_Balance;
             amnt=true; 
        }
        else if(Customer_Balance < 1){
        	 System.out.println("zero balance");
             System.out.println("\nRe enter amount: ");
        	 Customer_Balance=scn.nextInt();
        }
        
    }
}
double returnCustomer_Balance(){ 
return Customer_Balance;

}
void Amount_Withdraw(){
    loop:
        while(true){
         	 System.out.println("Enter Amount you want to Withdraw : ");
             Withdraw=scn.nextInt();
        if(Withdraw > total){
            System.out.println("Error");
            System.out.println("\nRe Enter amount : ");
        }
        else{
            total -= Withdraw;
            break loop;
        }
}
}
double returnAmount_Withdraw(){ 
return Withdraw;
}
	void withdraw_function() {
			    
	 System.out.println("the Depositor's old balance is = "+Customer_Balance);
		 System.out.println("the name of the Depositor is = "+getCustomer_Name());
				System.out.println("Account_number : "+getCustomer_AC_No());
			System.out.println("the amount withdrawed : "+total);
	 
	}
	public static void main(String[] args) {
		Bankaccount obj = new Bankaccount();
	obj.User_Input();
	Another obj1=new Another();
	obj1.Customer_Balance();
	obj1.Amount_Withdraw();
	obj1.withdraw_function();
		
}
}