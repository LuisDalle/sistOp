
public class Media extends Thread{
	
	// vetor local
	int[] vetor;
	
	// construtor
	public Media(int[] vetor) {
		this.vetor = vetor;
		
	}
	
	
	@Override
	public void run() {
		double total = 0;
		int tamVetor = vetor.length;
		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		
		media = total/tamVetor;
		System.out.println("Média: "+media);
		
	}
}
