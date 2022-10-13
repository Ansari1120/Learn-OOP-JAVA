package javamethods;

public class Main {
	public int addNumbers(int a , int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 24,b = 63;
     
     Main obj = new Main();
     int result = obj.addNumbers(a, b);
     System.out.println("the answer is " + result);
	}
}
