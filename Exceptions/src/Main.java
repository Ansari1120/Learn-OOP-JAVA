
public class Main {

	public static void main(String[] args) {
//int[] arrayindex= {1,2,3};
//System.out.println(arrayindex[10]);   error occur in cli showed as in array index 10 the value is existless
		
		try {
			int[] arrayindex= {1,2,3};
			System.out.println(arrayindex[10]);
		}
		catch(Exception e){
			System.out.println("error! something went wrong"); 
			//after condition fails try block skips and catch block executes and handle error
			
		}
		finally {
			System.out.println("try catch is finished !");
		} //seperate entity just to show try catch operation is finished already at above....
	}

}
