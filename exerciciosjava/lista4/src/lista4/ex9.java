package lista4;

public class ex9 {

	public static void main(String[] args) {
		int vetorA[]= {1, 2, 3, 4 ,5};
		int vetorB[]= {2, 3, 4, 5 ,6};
		int vetorC[]= new int [5];
		
		for(int i=0;i<vetorA.length;i++) {
			vetorC[i]= vetorA[i]*vetorB[i];
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println(vetorC[i]);
		}

	}

}
