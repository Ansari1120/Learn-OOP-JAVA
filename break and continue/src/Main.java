
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		
		for ( i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		for (i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println("\n"+i);
			}
	}}