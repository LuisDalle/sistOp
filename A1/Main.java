
public class Main {

	public static void main(String[] args) {
		// controle do tamanho do vetor
		int tamVetor=10;
		
		Vetor vetor1 = new Vetor(tamVetor);
		int[] vetorPrincipal = new int[tamVetor];
		
		System.out.println("\nVetor de números desorganizados: ");
		vetor1.popularVetor(vetorPrincipal, 0, 10);
		vetor1.printVetor(vetorPrincipal);
		
		System.out.println("\nVetor de números organizados:");
		vetor1.organizaVetor(vetorPrincipal);
		vetor1.printVetor(vetorPrincipal);

		Media media = new Media(vetorPrincipal);
		media.start();
		
		Mediana mediana = new Mediana(vetorPrincipal);
		mediana.start();
		
		MaxMin maxmin = new MaxMin(vetorPrincipal);
		maxmin.start();
		
		SomaPares somaPares = new SomaPares(vetorPrincipal);
		somaPares.start();
		
		ContPrimo contPrimo = new ContPrimo(vetorPrincipal);
		contPrimo.start();
	}

}
