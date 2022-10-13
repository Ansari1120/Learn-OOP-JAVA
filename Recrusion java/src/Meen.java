//halting condition
/*Every recursive function should have a halting condition, 
which is the condition where the function stops calling itself. In the previous example, the halting condition is when the parameter k becomes 0.
It is helpful to see a variety of different examples to better understand 
the concept. In this example, the function adds a range of numbers between a 
start and an end. The halting condition for this recursive function is when end 
is not greater than start:*/
public class Meen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result=sum(5,10);
System.out.println(result);
	}
	static int sum(int start , int end) {
	if(end>start) {
		return end+sum(start,end-1);
	}
	else 
		return 0;
}
}
   //10+sum(5,10-1)=10+(5,9)=10+9=19+8=27=27+7=34=34+6=40
          
