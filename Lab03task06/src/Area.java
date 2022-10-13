import java.util.Scanner;
public class Area {
int length,breadth;
Area(int l, int b){
	length =l;
	breadth=b;
}
public int setDim(){
	return length*breadth;
}
public void getarea(){
	System.out.println("Area = "+setDim());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter length");
int s1=s.nextInt();
System.out.println("enter breadth");
int s2=s.nextInt();
s.close();
Area s3=new Area(s1 ,s2 );
s3.getarea();
	}

}
