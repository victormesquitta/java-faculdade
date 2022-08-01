package lista4;

public class ex13 {

	public static void main(String[] args) {
		int vetorA[]= {1,2,3,4,5};
		int vetorB[]= {6,7,8,9,10};
		int vetorC[]=new int [10];
		
		for(int i=0; i<vetorA.length;i++) {
			vetorC[i]=vetorA[i];
			vetorC[i+5]=vetorB[i];
		}
		
		for(int i=0; i<vetorC.length;i++) {
			System.out.println(vetorC[i]);
		}

	}

}
