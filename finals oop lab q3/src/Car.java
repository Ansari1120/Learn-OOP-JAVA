
public interface Car {
    public abstract void turnOnCar();
    public abstract void turnOffCar();
    public abstract String getCarType();
}
class ManualCar implements Car{
    public void turnOnCar() {
        System.out.println("turn on the manual Car");
    }
    public void turnOffCar() {
        System.out.println("turn off the manual Car");
    }
    public String getCarType() {
        System.out.println("Manual Car");
        return "Manual";
    }
}

class AutomaticCar implements Car{
    public void turnOnCar() {
        System.out.println("turn on the automatic Car");
    }
    public void turnOffCar() {
        System.out.println("turn off the automatic Car");
    }
    public String getCarType() {
        System.out.println("Automatic Car");
        return "Automatic";
    }
}

class Main{
    public static void main(String[] arg) {
        
        AutomaticCar obj1 = new AutomaticCar();
            ManualCar obj2 = new ManualCar();
        obj1.turnOnCar();
        obj1.turnOffCar();
        obj1.getCarType();
        obj2.turnOnCar();
        obj2.turnOffCar();
        obj2.getCarType();


    }
}