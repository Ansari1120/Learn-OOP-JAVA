
public abstract class Car {
	int year;
	double price;
public Car(double price,int year) {
	this.price=price;
	this.year=year;
}
abstract public double calculateSalePrice();
}
class ClassicCar extends Car{
	public ClassicCar(double price,int year) {
		super(price,year);
		this.price=price;
		this.year=year;
	}
	public  double calculateSalePrice() {
		System.out.println("sale price of the car"+price);
		return price;
	}
}
class SportCar extends Car{
	double sale_price;
	public SportCar(double price,int year) {
		super(price,year);
		this.price=price;
		this.year=year;
	}
	public double calculateSalePrice() {
		
		if(year>2000) {
	
			sale_price= price * 0.75;
		}
		else if(year>1995) {
			
			sale_price= price * 0.5;
		}
		else 
		
		sale_price= price * 0.25;
		System.out.println("sale price of the car"+sale_price);
		return sale_price;
		

	}
	
}
class TestCar{
	public static void main(String []args) {
		ClassicCar c=new ClassicCar(10000,1995);
		c.calculateSalePrice();
		SportCar s=new SportCar(10000,1996);
		s.calculateSalePrice();
	}
}
