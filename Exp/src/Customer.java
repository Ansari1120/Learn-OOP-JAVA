

class Customer{
 String Name;
 int CustomerAccount;
 private int CustomerBalance;
 private int customerwithdrew;
 
 Customer(String a,int b){
 this.CustomerAccount=b;
 this.Name=a;
 System.out.println("Account Information");
 System.out.println("Customer Name= "+a);
 System.out.println("Customer Account= "+b);
 }
 
 public void setCutomerbalance(int c){
 
 CustomerBalance=c;
 if( c<0){
 System.out.println("Zero Balance");
 
 }
 else{
 
 }
 
 
 }
 int getCustomerbalance(){
 return CustomerBalance;
 }
 
 public void setCustomerwithdraw(int d){
 customerwithdrew=d;
 if(d>CustomerBalance){
 System.out.println("please write AccurateAmount ");
 }
 else{
 System.out.println("Amount you withdrew "+customerwithdrew);
 } 
 
 }
 
 int getCustomerwithdrew(){
 return customerwithdrew;
 
 }
 
}

public class customer { 

 public static void main(String[] args) {
 // TODO code application logic here
 customer obj=new customer("Shoaib",556);
 obj.setCutomerbalance(4400);
 obj.getCustomerbalance();
 obj.setCustomerwithdraw(1000);
 obj.getCustomerwithdrew();
 }}