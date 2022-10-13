
public class ABC
{ private double num = 100; 
public double square(double a)
{ setNum(100); return getNum()*a; }
public double getNum() {
	return num;
}
public void setNum(double num) {
	this.num = num;
} 
} 
class Example
{ public static void main(String args[])
{ ABC obj = new ABC();
 System.out.println(obj.getNum()); 			System.out.println(obj.square(10));
	}
} 

