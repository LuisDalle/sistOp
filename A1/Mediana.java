
public class Mediana extends Thread{

	// vetor local
	int[] vetor;
	
	// construtor
	public Mediana(int[] vetor) {
		this.vetor = vetor;
		
	}
	
	
	@Override
	public void run() {
		int tamVetor = vetor.length;
		int meio = tamVetor/2;
		double mediana = 0;
		if (tamVetor%2 == 0) {
			mediana += vetor[meio];
			mediana += vetor[meio-1];
			mediana = mediana/2;
		} else {
			mediana = vetor[(tamVetor/2)+1/2];
		}
		
		System.out.println("Mediana: "+mediana);
		
	}
}
