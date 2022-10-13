
import java.util.Random;
// A class to find the sum and count of the even and odd numbers generated randomly.
public class RandomTest
{
private Random rand;
private int evenCnt;

// Constructor for objects of class RandomTestpublic
RandomTest()
{
rand = new Random();
evenCnt = 0;
}
//A method to find the sum and the count of even and odd numbers separately.
public void summing()
{
int x;
for (int i = 0; i<9; i++)
{
x = (int) rand.nextInt(100);
if ( x % 2 == 0 )
{ evenCnt++ ; }
System.out.print (x + " ");
}
System.out.println ( );
System.out.println ("Even Count = "+evenCnt);
}
public static void main(String[] args) {
 RandomTest obj=new RandomTest();
 obj.summing();
}
}