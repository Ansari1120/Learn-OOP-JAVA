
public class Result{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input.Display_input_Runner_name_distance();
    Runner obj=new Runner();
    obj.Display_input_Runner_name_distance();
    obj.Display_Runner_name_and_distance();
    obj.Display_input_Runner_name_distance1();
    obj.Display_Runner_name_and_distance1();
    if(obj.Distance_covered_by_Runner > obj.Distance_covered_by_Runner1)
    {
    System.out.println("the Longer Distance Covered by ");
    	obj.Display_first_Runner();
    } 
    else 
    {
    	 System.out.println("the Longer Distance Covered by ");
    	obj.Display_first_Runner1();
    }
    	
	}

}