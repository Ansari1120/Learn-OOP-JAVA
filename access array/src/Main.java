
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);     // accessing array
		// Outputs Volvo
		
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"}; // change and element in array
		cars1[0] = "Opel";
		System.out.println(cars1[0]);
		// Now outputs Opel instead of Volvo
		
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"}; //array length
		System.out.println(cars.length);
		// Outputs 4
		
		String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"}; //loop through an array
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		  
		  String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"}; //for each loop
		  for (String i1 : cars) {
		    System.out.println(i1);
		    
		    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		    int x = myNumbers[1][2];
		    System.out.println(x); // Outputs 7
		  }
		}
	}

}
