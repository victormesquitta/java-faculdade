package lista4;

public class ex3 {

	public static void main(String[] args) {
		int vetor[]= {57, 22, 10, 34 ,46};
		int maior=vetor[0];
		
			
			for(int i=0;i<vetor.length;i++) {
				if(maior<vetor[i]) {
					maior=vetor[i];
				}
			}
			
			System.out.println("O maior numero do vetor ?: "+maior);


		}

	}


