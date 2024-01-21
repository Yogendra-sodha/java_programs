// running threads, thread object
// thread state - start(), runnable(), dead()
package multithreading;

class mThread extends Thread {
	public void run() {
		Thread n = Thread.currentThread() ;
//		here we are no using new so were not creating new object we just referring to this thread
		System.out.println(n);
	}
}


public class MultiThreading_Demo {

	public static void main(String[] args) {
		mThread m = new mThread();
		m.start(); // this will start new thread
//		m.run(); when calling the object method this just run like normal program, not new thread
		mThread m1 = new mThread();
		m1.start();
	}
}