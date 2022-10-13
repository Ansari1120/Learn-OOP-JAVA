package lab03task09;
import java.util.Scanner;
public class Complex {
int real,img;
Complex(int r,int i){
	real =r;
	img=i;
}
 static Complex sum(Complex a, Complex b){
    return new Complex((a.real+b.real),(a.img+b.img));
  }
 static Complex differ(Complex a, Complex b){
	    return new Complex((a.real-b.real),(a.img-b.img));
	  }
 static Complex prod(Complex a, Complex b){
	 return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
	  }
 public void display_Complex(){
	    if(real == 0 && img!=0){
	      System.out.println(img+"i");
	    }
	    else if(img == 0 && real!=0){
	      System.out.println(real);
	    }
	    else{
	      System.out.println(real+"+"+img+"i");
	    }
 }
}
 class Answer{
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("enter first complex number : ");
int s1=input.nextInt();
int s2=input.nextInt();
System.out.println("enter Second complex number : ");
int s3=input.nextInt();
int s4=input.nextInt();
input.close();

Complex s5=new Complex(s1,s2);
Complex s6=new Complex(s3,s4);

Complex x = Complex.sum(s5,s6);
Complex y = Complex.differ(s5,s6);
Complex z = Complex.prod(s5,s6);

x.display_Complex();
y.display_Complex();
z.display_Complex();
}
}
