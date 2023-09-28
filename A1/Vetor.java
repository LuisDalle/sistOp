
public class Vetor {
	
	private int[] vetorNum;
	
	public Vetor() {
		
	}
	
	public void printVetor() {
		System.out.println("Vetor de Números: ");
		for (int i=0; i <vetorNum.length; i++) {
			
			// printa os valores do array
			System.out.print(vetorNum[i]+" ");
			if ((i+1)%10 == 0) {
				System.out.println("\n");
			}
			
		}
	}
	
	
	
	
	

	// popula de forma padrão com um Array de 100 itens que vão de 0 a 100; 
	public void popularVetor() {
		int tamArray = 100;
		int valorMin = 0;
		int valorMax = 100;
		
		vetorNum = new int[tamArray];
		
		for (int i=0; i <tamArray; i++) {
			int valor = (int)Math.floor(Math.random() * (valorMax - valorMin + 1) + valorMin);
			vetorNum[i] = valor;
		}
	}	
	
	// popula de forma customizada o vetor
	public void popularVetor(int tamArray, int valorMin, int valorMax) {

		vetorNum = new int[tamArray];
		
		for (int i=0; i <tamArray; i++) {
			int valor = (int)Math.floor(Math.random() * (valorMax - valorMin + 1) + valorMin);
			vetorNum[i] = valor;
		}
	}
	
	public int[] getVetorNum() {
		return vetorNum.clone();
	}

	
}
