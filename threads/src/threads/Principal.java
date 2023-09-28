package threads;

public class Principal {
	
	public static void main(String[] args) {
		
		Tarefa t1 = new Tarefa("T1");
		t1.start();
		
		Tarefa t2 = new Tarefa("T2");
		t2.start();
		
		Tarefa t3 = new Tarefa("T3");
		t3.start();
		
	}

}
