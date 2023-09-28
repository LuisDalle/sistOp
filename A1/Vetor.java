
public class Vetor {
	
	private int[] vetorNum;
	private int tamVetor;
	
	public Vetor(int tamVetor) {
		this.tamVetor = tamVetor;
	}
	
	public void printVetor(int[] vetor) {
		System.out.println("Vetor de Números: ");
		for (int i=0; i <vetor.length; i++) {
			
			// printa os valores do array
			System.out.print(vetor[i]+" ");
			if ((i+1)%10 == 0) {
				System.out.println("\n");
			}
			
		}
	}

	// popula de forma padrão com um Array de 100 itens que vão de 0 a 100; 
	public void popularVetor(int[] vetor) {
		int valorMin = 0;
		int valorMax = 100;
		
		for (int i=0; i <tamVetor; i++) {
			int valor = (int)Math.floor(Math.random() * (valorMax - valorMin + 1) + valorMin);
			vetor[i] = valor;
		}
	}	
	
	// popula de forma customizada o vetor
	public void popularVetor(int[] vetor, int valorMin, int valorMax) {

		
		for (int i=0; i <tamVetor; i++) {
			int valor = (int)Math.floor(Math.random() * (valorMax - valorMin + 1) + valorMin);
			vetor[i] = valor;
		}
	}
	
	public int[] getVetorNum() {
		return vetorNum.clone();
	}

	
}
