package lista4;

public class ex16 {

	public static void main(String[] args) {
		int vetor[]= {9,2,7,12,5,10};
		int ordem[]= new int [6];
		int impar=3;
		int par=0;
		
		for(int i=0; i<vetor.length;i++) {
			if(vetor[i]%2==0) {
				ordem[par]=vetor[i];
				par++;
			}
			else if(vetor[i]%2!=0) {
				ordem[impar]=vetor[i];
				impar++;
			}
			
		}
		
		for(int i=0; i<vetor.length;i++) {
			System.out.println(ordem[i]);
			
		}

	}

}
