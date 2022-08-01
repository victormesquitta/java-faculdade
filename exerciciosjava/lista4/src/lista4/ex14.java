package lista4;

public class ex14 {

	public static void main(String[] args) {
		int vetorA[]= {1,2,3,4,5};
		int vetorB[]= {6,7,8,9,10};
		int vetorC[]=new int [10];
		int addA=0;
		int addB=0;
		
		for(int i=0; i<vetorC.length;i++) {
			if(i%2==0) {
				vetorC[i]=vetorA[addA];
				addA++;
			}else {
				vetorC[i]=vetorB[addB];
				addB++;
			}
		}
		
		for(int i=0; i<vetorC.length;i++) {
			System.out.println(vetorC[i]);
		}

	}

	}