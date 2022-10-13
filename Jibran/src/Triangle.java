
public class Triangle{
  int a,b,c;
  public double getArea(){
    return (a+b+c)/2.0;
  }
  public double getPerimeter(){
    return (a+b+c);
  }
}
class Ans{
 public static void main(String[] args){
    Triangle t = new Triangle();
    t.a = 2;
    t.b = 5;
    t.c = 6;
    System.out.println(t.getArea());
    System.out.println(t.getPerimeter());
  }
}
