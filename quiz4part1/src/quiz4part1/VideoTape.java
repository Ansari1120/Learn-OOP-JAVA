package quiz4part1;

public class VideoTape {
private String title;
private String classification;
private String time;
VideoTape(String Fulltitle,String ProgramClassification,String Runningtime){
	title=Fulltitle;
	classification=ProgramClassification;
	time=Runningtime;
}
//return the title of this video
void method1() {
	System.out.println("The title of this video is : "+title);
}
//return the classfication of this video
void method2() {
	System.out.println("The Classification of this video is : "+classification);
}
//return the time of this video as String followed by 2:06
void method3() {
	System.out.println("The time of this video is "+time);
}
void method4() {
	System.out.println("The new Classification of this video is : Thriller/horror");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoTape obj=new VideoTape("Escape Room","Mystery","1:21:18");
obj.method1();
obj.method2();
obj.method3();
obj.method4();
	}

}
