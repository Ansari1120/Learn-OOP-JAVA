
enum Lavel {    //enum is a short form of enumeration.where variables should be in uppercase latter
//enum is a spacial class that represents group of constans which is unchangable varables like final variables
	LOW,
	MEDIUM,         //first and rest of the variables spereted by comma and last one by semi colomn
	HIGH;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lavel myval=Lavel.MEDIUM;   //we can access enum constants with a dot syntax
System.out.println(myval);
	}
	}
/*
 * Difference between Enums and Classes : 
An enum can, just like a class, have attributes and methods. 
The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
 */


