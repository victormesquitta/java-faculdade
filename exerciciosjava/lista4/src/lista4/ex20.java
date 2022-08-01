package lista4;

public class ex20 {

	public static void main(String[] args) {
		int vetor[]= {10,2,9,12,5};
		int impar[]= new int [2];
		int n=0;
		
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]%3==0) {
				impar[n]=vetor[i];
				n++;
			}
		}
		
		for(int i=0;i<impar.length;i++) {
			if((i+1)%2!=0) {
				System.out.println(impar[i]);
			}
		}

	}

}
