
public class ShipAA {
protected String NameofShip;           //Author : AHMED ALI ANSARI
protected String YearofBuild;
ShipAA(String n,String y,int p,int t){
	NameofShip=n;
	YearofBuild=y;
}
void method_display_name_and_year(){
	System.out.println("Ship Details");
	System.out.println("the Name of the Ship : "+NameofShip);
    System.out.println("the build year is : "+YearofBuild);
}
}
class CruiseShipAA extends ShipAA{
	private int TheofPassengers;
	CruiseShipAA(String n, String y,int p) {
		super(n, y,p, p);
		// TODO Auto-generated constructor stub
	 TheofPassengers=p;
	}
void method_display_name_and_year(){
	System.out.println("\n");
	System.out.println("Cruise Ship Details");
	System.out.println("the Name of the Ship : "+super.NameofShip);
	System.out.println("the build year is : "+super.YearofBuild);
	System.out.println("The number of Passengers : "+TheofPassengers);
	
}	
}
class CargoShipAA extends ShipAA{
	private int NumberofTons;
CargoShipAA(String n, String y,int t) {
		super(n, y,t, t);
		// TODO Auto-generated constructor stub
		NumberofTons=t;
	}
void method_display_name_and_year(){
	System.out.println("\n");
	System.out.println("Cargo Ship Details");
	System.out.println("the Name of the Ship : "+super.NameofShip);
	System.out.println("the build year is : "+super.YearofBuild);
	System.out.println("The number of Tons : "+NumberofTons+" Tons");
}
}
class ShipDriverAA{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ShipAA obj=new ShipAA("Oasis of the Seas","1931", 0, 0);
obj.method_display_name_and_year();
CruiseShipAA obj1=new CruiseShipAA("Zorro Shipment","1843",31269);
obj1.method_display_name_and_year();
CargoShipAA obj2=new CargoShipAA("Wonders of the Seas","2010",164500);
obj2.method_display_name_and_year();
	}
}


