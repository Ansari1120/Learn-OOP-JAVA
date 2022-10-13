package arrays;

public class Howmanyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[]= {"Audi","BMW","TOYOTA","LAMBORGHINI","TESLA"};
System.out.println(array.length);
for(int i=0;i<array.length;i++) {
	System.out.println(array[i]);   //check array length for letting know int value of array to loop
}
for(String i2 : array) {
	System.out.println(i2);
}
	}

}
