package lista4;

public class ex5 {

	public static void main(String[] args) {
		int vetor[]= {10, 22, 34, 46 ,58};
		int media=0;
			
			for(int i=0;i<vetor.length;i++) {
				media+= vetor[i];
			}
			
			System.out.println(media/vetor.length);

	}

}
