package quiz;
abstract class Calculate
{
   abstract int add(int a, int b);
}

 class MainClass
{
	 int add(int a, int b)
     {
         return a+b;
     }
   public static void main(String[] args)
   {
           MainClass s=new MainClass();
           System.out.println(s.add(11010,022011));
       
}
}