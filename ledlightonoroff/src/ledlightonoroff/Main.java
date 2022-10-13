package ledlightonoroff;
class Lamp{
	boolean isOn;
	
	void turnOn() {
	isOn = true;
	System.out.println("light on ? " + isOn);
	}
	void turnOff() {
		isOn = false;
		System.out.println("light off ? " + isOn);
		}
}
	class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lamp led  = new Lamp();
Lamp halogene  = new Lamp();
led.turnOn();
halogene.turnOff();
	}
	}

