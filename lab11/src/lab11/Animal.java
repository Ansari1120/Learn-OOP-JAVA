package lab11;

class Animal{  
void eat(){System.out.println("mewing...");}  
}  
class Cat extends Animal{  
void thinking(){System.out.println("meowing...");}  
}  
class baby extends Cat{  
void talking (){System.out.println("eating...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
baby d=new baby();  
d.talking();  
d.eat();  
}}  

