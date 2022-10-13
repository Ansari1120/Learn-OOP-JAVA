
class Point                  
{ protected int x, y;            /*
                               we have to change visibility 
                                   from private to protected to access them in derived classes*/
public Point (int x, int y)
{this.x = x; this.y = y;}
public int getX ( )
{ return x; }
public int getY ( )
{ return y; }
}
class ScaledPoint extends Point
{ private int c;
public ScaledPoint(int x, int y, int c)
{ 
	super(x, y);                   //we need to use super keyword in order access parent class variable in subclass 
	this.x = x;
this.y = y;
this.c = c;}
public int getC ()
{System.out.println(super.x+" "+super.y+" "+c);    // we need to use SOP in order print returned value and to print parent class constructor variables
	return c; }             //either we remove return type or to void from method
}
class Test{                      
	public static void main(String[]args) {
		ScaledPoint obj=new ScaledPoint(1,2,3);
		obj.getC();
		
	}
}