                                 //Question # 03 Answer : 
                                                                       //Author : AHMED ALI ANSARI

public class Bankaccount {
     static String Name_of_the_depositer="Ahmed Ali Ansari";
	String Account_type="Buissness";
    String Account_number="Ad.675";
     double Current_balance=77000;
     double i=0;
    double Fixed_fee=0.50;
     int Deposit;
	 int Withdraw;
    Bankaccount(int d,int w){
    	Deposit=d;
    	Withdraw=w;
    }
    void Deposit_function()
    {
    	 System.out.println("Detailed Statistics of Transaction : ");
    	 System.out.println("\n");
    	System.out.println("Balance before Deposit : "+Current_balance);
    	 System.out.println("Amount after deposition : "+(Current_balance+Deposit));
    }
    void withdraw_function() {
    	System.out.println("the name of the Depositor is = "+Name_of_the_depositer);
    	System.out.println("Account type : "+Account_type+", Account_number : "+Account_number);
		System.out.println("the amount withdrawed is equal to : "+((Current_balance+Deposit)-Withdraw-Fixed_fee));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount obj = new Bankaccount(25760,24590);
		obj.Deposit_function();
		obj.withdraw_function();
		
}
}
