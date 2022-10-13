import java.util.Random;
// A class to find the sum and count of the even and odd numbers generated randomly.
public class RandomTest
{
private Random rand;
private int evenSum, evenCnt;
private int oddSum, oddCnt;
// Constructor for objects of class RandomTestpublic
RandomTest()
{
rand = new Random();
evenSum = 0;
evenCnt = 0;
oddSum = 0;
oddCnt = 0;
}
//A method to find the sum and the count of even and odd numbers separately.
public void summing()
{
int x;
for (int i = 1; i<6; i++)
{
x = (int) rand.nextInt(50);
if ( x % 2 == 0 )
{
evenSum += x ; evenCnt++ ; }
else
{ oddSum += x;
oddCnt++ ; }
System.out.print (x + " ");
}
System.out.println ( );
System.out.println ("Even Sum = "+evenSum + " Odd Sum = "+oddSum);
System.out.println ("Even Count = "+ evenCnt + " Odd Count = "+oddCnt);
}
public static void main(String[] args) {
 RandomTest obj=new RandomTest();
 obj.summing();
}
}