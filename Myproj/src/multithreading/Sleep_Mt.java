package multithreading;

class SleepDemo extends Thread {
	public void run() {
		Thread t1 = Thread.currentThread();
		for(int i=1;i<=10;i++) {
			System.out.println("Incremented");
			System.out.println(t1.getClass()+t1.getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("End 1"+t1.getName());
		}
		synchronized(this) {
			notify();
		}
	}
}


class Demo2 extends Thread {
	public void run() {
		Thread t1 = Thread.currentThread();
		for (int i=10;i>=1;i--) {
			System.out.println("Decremeted");
			System.out.println(t1.getClass()+t1.getName()+" "+i);
		}
	}
}


public class Sleep_Mt {
	
	public static void main(String[] args) throws InterruptedException {
		 SleepDemo t = new SleepDemo();
		 System.out.println("Inc 1");
		 t.start();
		 synchronized(t) {
			 t.wait();}
		 System.out.println("completed - mixing -raw");
		 SleepDemo t1 = new SleepDemo();
		 System.out.println("Inc 2");
		 t1.start();
		 Demo2 d = new Demo2();
		 System.out.println("Demo");
		 d.start();
		 
	}
}
