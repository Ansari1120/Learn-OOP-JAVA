import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {

	public static void main(String[] args) {
		Pattern pat=Pattern.compile("Welcome back !",Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pat.matcher("WELCOME back");
	    boolean matchfound=matcher.find();
	    if(matchfound) {
	    	System.out.println("match found");
	    }
	    else {
	    	System.out.println("match not found");
	    }
	}

}
