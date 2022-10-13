
class Vehicle{  
  //defining a method  
  void run(){System.out.println("Vehicle is moving");}  
}  
//Creating a child class  
class Car2 extends Vehicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("car is running safely");}  
  
  public static void main(String args[]){  
  Car2 obj = new Car2();//creating object
  Vehicle obj2=new Vehicle();
  obj2.run();
  obj.run();//calling method  
  }  
} 
