/*
 * Java Dates
Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:

Class	Description
LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DisplayCurrentdatetimethendateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myobj= LocalDate.now();   //.now() method is used to call out import class of date and time
LocalTime myobj2=LocalTime.now();  
LocalDateTime myobj3=LocalDateTime.now();
DateTimeFormatter myobj4=DateTimeFormatter.ofPattern("dd-MM-yyy || HH:mm:ss");
String formatDate=myobj3.format(myobj4);
		System.out.println(myobj);      //date called out
		System.out.println(myobj2);		//time called out
		System.out.println(myobj3);		//time and time called out together at the same time
		System.out.println(formatDate);		//time and time called out together at the same time with format


	}

}
