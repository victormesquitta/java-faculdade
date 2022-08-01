package lista4;

public class ex4 {

	public static void main(String[] args) {
		int vetor[]= {57, 22, 10, 34 ,46};
		int menor=vetor[0];
		
			
			for(int i=0;i<vetor.length;i++) {
				if(menor>vetor[i]) {
					menor=vetor[i];
				}
			}
			
			System.out.println("O menor numero do vetor é: "+menor);


		}

	}


