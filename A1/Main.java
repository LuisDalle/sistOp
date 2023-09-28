
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor1 = new Vetor();
		vetor1.popularVetor();
		vetor1.printVetor();
		int[] vetorPrincipal = vetor1.getVetorNum();

		Media media = new Media(vetorPrincipal);
		media.start();
		
	}

}
