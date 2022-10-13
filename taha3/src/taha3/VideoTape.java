package taha3;

class VideoTape {
private String title,classification,time;
VideoTape(String f,String c,String r){
	title=f;
	classification=c;
	time=r;
}
void set() {
	System.out.println( "title : "+title+"Classification : "+classification+"time : "+time);
}
void get() {
	System.out.println("new : action");
}
	public static void main(String[] args) {
		VideoTape obj=new VideoTape("MARVEL","COMIC BASED","5:33:56");
obj.set();
obj.get();
	}
}

