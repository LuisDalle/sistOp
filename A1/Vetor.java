
public class Vetor {
	
	private int[] vetorNum;
	private int tamVetor;
	
	public Vetor(int tamVetor) {
		this.tamVetor = tamVetor;
	}
	
	// printa o vetor
	public void printVetor(int[] vetor) {
		for (int i=0; i <vetor.length; i++) {
			
			// printa os valores do array
			System.out.print(vetor[i]+" ");
			if ((i+1)%10 == 0) {
				System.out.println("\n");
			}
			
		}
	}
	
	// organiza o vetor em ordem crescente
	public int[] organizaVetor(int[] vetor) {
		// INSERTION SORT
		int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int key = vetor[i];
            int j = i - 1;
 
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
        return vetor;
	}

	// popula de forma padrão com um Array que vai de 0 a 100; 
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
