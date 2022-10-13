
public class Shape
{
public void display()
{
System.out.println("A Shape.");
}
}
class Triangle extends Shape
{
public void display()
{
System.out.println("I am a triangle.");
}
}
class Main{
public static void main(String[] args)
{
Shape obj;
obj = new Shape();
obj.display();
obj = new Triangle();
obj.display();
}
}
