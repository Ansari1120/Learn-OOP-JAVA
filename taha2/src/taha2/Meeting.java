package taha2;

public class Meeting{
    String time="12:30",location="205",subject;
    Meeting(String s){
    	subject=s;
    }
    void setTime(){
    System.out.println("the time:" +time);
    }
    void setLocation(){
    System.out.println("location:" +location);
    }
    void setSubject(){
    System.out.println("Subject:" +subject);
    }
    void GetSubject(){
    System.out.println("" +subject);
    }
    void printdetails(){
    System.out.println("Meeting in room" + location + " Time " +time+ "Subject : EngineersMeeting");
    }
public static void main(String []args) {
Meeting m=new Meeting("new Meeting");
m.setLocation();
m.setSubject();
m.setTime();
m.GetSubject();
m.printdetails();
}
}
