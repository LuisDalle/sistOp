
public class MaxMin extends Thread{
	
	// vetor local
		int[] vetor;
		
		// construtor
		public MaxMin(int[] vetor) {
			this.vetor = vetor;
			
		}
		
		
		@Override
		public void run() {
			int max;
			int min;
			
			max=vetor[vetor.length-1];
			min=vetor[0];
			
			System.out.println("Valor Máximo: "+max);
			System.out.println("Valor Mínimo: "+min);
		}
}
