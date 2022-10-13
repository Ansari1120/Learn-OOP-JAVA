import java.util.Scanner;
class Adddistance
{ 
        int feet,r;
        public void Convert(int a,int b,int c,int d)
          {
              int count=0;
              r=a+b;
              while(r>12)
              {
                   r=r-12;
                   count++;
              }
               feet=c+d+count;  
        }
       public int feet()
      {
             return feet;
       }
        public int inches()
        {
             return r;
       }
      public static void main(String[] args)
     {
          int f1,i1,f2,i2;
          Scanner s=new Scanner(System.in);
          Adddistance dis=new Adddistance();
          System.out.println("Enter distance1 in feet");
          f1=s.nextInt();
          System.out.println("Enter distance1 in inches");
          i1=s.nextInt();
          System.out.println("Enter distance2 in feet");
          f2=s.nextInt();
          System.out.println("Enter distance2 in inches");
          i2=s.nextInt();
          s.close();
          dis.Convert(i1,i2,f1,f2);
          System.out.println("Distance in feet is = "+dis.feet());
          System.out.println("Distance in inches is = "+dis.inches());
}
}
