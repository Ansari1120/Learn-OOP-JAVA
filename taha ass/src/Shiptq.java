
class Shiptq {
    protected String name;
    protected int year;
     Shiptq(String y,int x,int p,int t){
    name=y;
    year=x;
}
void single()
{
System.out.println("Ship Details");
System.out.println("Name"+name);
System.out.println("Year"+year);
}

}
class CruiseShiptq extends Shiptq{
private int p;
CruiseShiptq(String x,int y,int p){
     super(x,y,p,p);
     this.p=p;
}
void Single(){
	System.out.println("Cruise Ship Details");
	System.out.println("the Name of the Ship : "+super.name);
	System.out.println("the build year is : "+super.year);
    System.out.println("Maximum Pessengers: "+p);
}

}
class CargoShiptq extends Shiptq{
	private int t;
         CargoShiptq(String x,int y,int t){
             super(x,y,t,t);
             this.t=t;
         }
void Single(){
	System.out.println("Cargo Ship Details");
	System.out.println("the Name of the Ship : "+super.name);
	System.out.println("the build year is : "+super.year);
    System.out.println("Maximum Tons: "+t);
}
}
class ShipDrivertq{
    public static void main(String[] args) {
        Shiptq obj = new Shiptq("Lollipop",1934, 0, 0);
        obj.single();
        CruiseShiptq obj1 = new CruiseShiptq("harmony", 1924,71237);
        obj1.Single();
        CargoShiptq obj2 = new CargoShiptq("Symphony of the seas",1842,7130);
        obj2.Single();
    }
}