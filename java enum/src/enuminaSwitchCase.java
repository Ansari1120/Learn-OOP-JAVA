
enum level{
	LOW,
	MEDIUM,
	HIGH;
}
public class enuminaSwitchCase {  //enum is often used in a switch case to check corresponding variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
level my_variable=level.HIGH;
switch(my_variable) {
case LOW:
	System.out.println("low level");
	break;
case MEDIUM:
	System.out.println("medium level");
	break;
case HIGH:
	System.out.println("High level");
	break;
	default:
		System.out.println("invalid input");
}
for(level my_variable2:level.values()) {
	System.out.println("\n"+my_variable2);
}
	}

}
