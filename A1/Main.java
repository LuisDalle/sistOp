
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamVetor=100;
		Vetor vetor1 = new Vetor(tamVetor);
		int[] vetorPrincipal = new int[tamVetor];
		vetor1.popularVetor(vetorPrincipal);
		vetor1.printVetor(vetorPrincipal);

		Media media = new Media(vetorPrincipal);
		media.start();
		
	}

}
