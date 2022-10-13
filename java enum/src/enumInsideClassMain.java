
public class enumInsideClassMain {  //we can creat enum inside class
	enum Lavel {    //enum is a short form of enumeration.where variables should be in uppercase latter
		//enum is a spacial class that represents group of constans which is unchangable varables like final variables
			LOW,
			MEDIUM,         //first and rest of the variables spereted by comma and last one by semi colomn
			HIGH;

	}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Lavel myval=Lavel.MEDIUM;   //we can access enum constants with a dot syntax
		System.out.println(myval);
			}
			}