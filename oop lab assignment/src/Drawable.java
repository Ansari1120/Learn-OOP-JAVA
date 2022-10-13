/*
 where i want to  achieve total abstraction.
  Since java does not support multiple inheritance in case of class, 
  but by using interface it can achieve multiple inheritance . 
  and it is also used to achieve loose coupling. 
  Interfaces are used to implement abstraction.
 */
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class A7 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
A7 obj = new A7();  
obj.print();  
obj.show();  
 }  
}  