public class CustomThreadDemo {
	public static void main(String[] args) {
		System.out.println("Main Thread Started...");
		
		CustomThread ct= new CustomThread();
		ct.start(); // to make thread ready to run (it will not start a thread)
		
		System.out.println("Main Thread Ends...");
	}
}

class CustomThread extends Thread
{
	@Override
	public void run() {
		System.out.println("Custom Thread started...");
		System.out.println(Thread.currentThread());
		System.out.println("Custom Thread ends...");
	}
}