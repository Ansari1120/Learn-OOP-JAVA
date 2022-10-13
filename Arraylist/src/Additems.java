/*
 * The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, 
is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want.
The syntax is also slightly different
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Additems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>cars=new ArrayList<String>();
cars.add("Suzuki");
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
Collections.sort(cars);  //sort cars
System.out.println(cars);
System.out.println(cars.get(2));    //access an array element
System.out.println(cars.set(4,"maclaren"));    //change an array element
System.out.println(cars.remove(3));    //remove an array element     , .clear to remove all elements in array
System.out.println(cars.size());     //how many arrays array list hold
for(String i3:cars) {
	System.out.println(i3);         /*another useful class in the java.util package is the Collections class, 
	                             which include the sort() method for sorting lists alphabetically or numerically:
}                                     */

System.out.println("\n");

for(int i=0;i<cars.size();i++) {
	System.out.println(cars.get(i));        //loop through an array list
	
	for (String i2 : cars) {
	      System.out.println(i2);     //for each loop
	    }
}

/*
 * Elements in an ArrayList are actually objects. In the examples above, we created elements 
 * (objects) of type "String". Remember that a String in Java is an object (not a primitive type). 
 * To use other types, such as int, you must specify an equivalent wrapper class: Integer. 
 * For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
 */
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
myNumbers.add(10);
myNumbers.add(15);
myNumbers.add(20);
myNumbers.add(25);
for (int i : myNumbers) {
  System.out.println(i);
}

	}

}}
