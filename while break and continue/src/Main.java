
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<10) {      //in while loop
			System.out.println(i);
			i++;
			if(i==4) {
				break;
			}
		}
		while(i<10) {
			System.out.println("\n"+i);
			i++;
			if(i==4) {
				continue;
			}
		}

	}

}
