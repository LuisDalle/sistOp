
public class SomaPares extends Thread{

	// vetor local
	int[] vetor;
	
	// construtor
	public SomaPares(int[] vetor) {
		this.vetor = vetor;
		
	}
	
	
	@Override
	public void run() {
		
		int somaPares=0;
		for(int i = 0; i<vetor.length;i++) {
			if (vetor[i]%2 == 0) {
				somaPares += vetor[i];
			}
		}
		
		System.out.println("Soma dos pares: "+somaPares);
		
	}
	

}
