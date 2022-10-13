import java.util.Scanner;
public class Area {
	int length,breadth;
	Area(int l , int b){
		length = l;
		breadth = b;
	}
public int return_Area(){
	return length*breadth;
}
void print_area() {
	System.out.println("The Area is = "+return_Area());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  System.out.println("Enter Length : ");
  int s=input.nextInt();
  System.out.println("Enter Length : ");
  int s2=input.nextInt();
  input.close();
  Area s3 = new Area(s,s2);
  s3.print_area();
	}

}
