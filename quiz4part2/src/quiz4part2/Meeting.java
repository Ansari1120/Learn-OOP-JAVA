package quiz4part2;

public class Meeting {
String time="1 hour 45 minutes ";
String location="room 205";
String subject;
Meeting(String s){
	subject=s;
}
void method1() {
	System.out.println("meeting in room no: "+location+" at : "+time+" subject : examiner's meeting");
}
void method2() {
	System.out.println("subject :"+subject);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Meeting obj=new Meeting("admin's meeting");
obj.method1();
obj.method2();
	}

}
