/*Adding two numbers together is easy to do, but adding a range of numbers is more 
complicated. In the following example, recursion is used to add a range of numbers 
together by breaking it down into the simple task of adding two numbers:*/
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=sum(10);
		System.out.println(result);
	}
		static int sum(int k) {
			if(k>0) {
				return k+sum(k-1);
			}
			else 
				return 0;
		}
	}

