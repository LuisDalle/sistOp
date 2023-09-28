package threads;

public class Tarefa extends Thread {
		
	public int contador;
	public String nome;
	
	public Tarefa(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void run() {
		System.out.println(this.nome);
		
	}
}
