
public class ContPrimo extends Thread{

	// vetor local
		int[] vetor;
		
		// construtor
		public ContPrimo(int[] vetor) {
			this.vetor = vetor;
			
		}
		
		static boolean ehPrimo(int num) {
	        if(num<=1)
	        {
	            return false;
	        }
	       for(int i=2;i<=num/2;i++)
	       {
	           if((num%i)==0)
	               return  false;
	       }
	       return true;
	    }
		
		@Override
		public void run() {
			int totalPrimos=0;
			
			for (int i=0;i<vetor.length;i++) {
				if (ehPrimo(vetor[i])) {
					totalPrimos++;
				}
			}
			
			System.out.println("Contagem de primos: "+totalPrimos);
			
		}
}
