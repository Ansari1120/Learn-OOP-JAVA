/*
In which situation we use abstraction : 
I want to share code among several closely related classes.
I expect that classes that extend your abstract class have many 
common methods or fields or require access modifiers other than public (such as protected and private).
You want to declare non-static or non-final fields. This enables 
you to define methods that can access and modify the state of the object to which they belong.
*/
public abstract class Bank{    
    abstract int getInterestRate();    
}    

class Citi extends Bank{    
    protected int getInterestRate(){return 7;}    
}

class HSBC extends Bank{    
    protected int getInterestRate(){return 6;}    
}    
     
class Main{    
    public static void main(String args[]){    
        Bank b;  
        b = new Citi ();     
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");    
        b = new HSBC ();       
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");    
    }
}    