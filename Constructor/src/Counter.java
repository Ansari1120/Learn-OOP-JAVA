public class Counter {  
	int CounterIndex;

// Constructor
public Counter()
{
CounterIndex = 0;
}
//Methods to update or access counter
public void increase()
{
CounterIndex = CounterIndex + 1;
}
public void decrease()
{
CounterIndex = CounterIndex - 1;
}
int getCounterIndex()
{
return CounterIndex;
}
}
class MyClass {
public static void main(String args[])
{
Counter counter1 = new Counter();  counter1.increase();
int a = counter1.getCounterIndex();
counter1.increase();
int b = counter1.getCounterIndex();  if ( a > b )
counter1.increase();
else
counter1.decrease();

System.out.println(counter1.getCounterIndex());
}
}
