import java.util.HashMap;
public class Main2 {

	public static void main(String[] args) {
HashMap<String,Integer> Country_countrycode=new HashMap<String,Integer>();
Country_countrycode.put("pakistan",92);
Country_countrycode.put("USA",72);
Country_countrycode.put("India",03);
Country_countrycode.put("Uk",45);
Country_countrycode.put("Iran",55);
for(String i: Country_countrycode.keySet()) {
	System.out.println("key : "+i+" , value : "+Country_countrycode.get(i));
}
	}

}
