import java.util.HashMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> capitalCities=new HashMap<String,String>();
capitalCities.put("Germany","Berlin");
capitalCities.put("Russia","St.petersburg");
capitalCities.put("USA","LOS ANGLELES");
capitalCities.put("Pakistan","Islamabad");
capitalCities.put("Afghanistan","Kabul");

capitalCities.get("Pakistan");
System.out.println(capitalCities);
capitalCities.remove("USA");
System.out.println(capitalCities);
System.out.println(capitalCities.size());
capitalCities.get("Pakistan");
System.out.println(capitalCities);
for(String i : capitalCities.keySet()) {
	System.out.println(i);
}
for(String i : capitalCities.values()) {

	System.out.println(i);
}
for(String i : capitalCities.keySet()) {

	System.out.println("key : "+i+" , values : "+capitalCities.get(i));
}


	}

}
