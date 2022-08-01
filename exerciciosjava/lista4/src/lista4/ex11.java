package lista4;

public class ex11 {

	public static void main(String[] args) {
		int vetor[]= {10, 22, 34, 46 ,58};
		int media=0;
			
			for(int i=0;i<vetor.length;i++) {
				media+= vetor[i];
			}
			media= media/vetor.length;
			for(int i=0;i<vetor.length;i++) {
				if(vetor[i]>media) {
					System.out.println(vetor[i]+ " é maior que a media");
				}
			}
			
			

	}

}
