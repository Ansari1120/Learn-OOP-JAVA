package thread;

 class Main2 implements Runnable  {

	public static void main(String[] args) {
Main obj=new Main();
Thread thread=new Thread(obj);
thread.start();
System.out.println("this code running outside of thread");

	}
	@Override
	public void run() {
		System.out.println("this code running inside of thread");
	}

}
