/*
 * situation : 
When a method in a subclass has the same name.
same parameters or signature, and same return type(or sub-type) as a method in its super-class, 
then the method in the subclass is said to override the method in the super-class.
*/
class ABC{
   
   public void disp()
   {
	System.out.println("disp() method of parent class");
   }	   
}
class Demo extends ABC{
   
   public void disp(){
	System.out.println("disp() method of Child class");
   }
   public void newMethod(){
	System.out.println("new method of child class");
   }
   public static void main( String args[]) {
	
	ABC obj = new ABC();
	obj.disp();

	ABC obj2 = new Demo();
	obj2.disp();
   }
}
