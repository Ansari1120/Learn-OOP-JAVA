package thread;

class Main extends Thread{
public static void main(String[] args) {
Main thread=new Main();
thread.start();
System.out.println("this code running outside of thread");
}
public void run() {
	System.out.println("this code running inside thread");
}

}
