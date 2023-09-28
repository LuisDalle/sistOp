package threads;

public class Principal2 {

	public static void main(String[] args) {
		System.out.println("inicio da execução");
		Thread thread1 = new Thread(t1);
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread thread2 = new Thread(t2);
		thread2.start();
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		
		
		System.out.println("fim da execução");
		
	}
	
	public static Runnable t1 = new Runnable() {
		public void run() {
			System.out.println("T1");
		}
	};
	
	public static Runnable t2 = new Runnable() {
		public void run() {
			System.out.println("T2");
		}
	};
	
	public static Runnable t3 = new Runnable() {
		public void run() {
			System.out.println("T3");
		}
	};
	
}
