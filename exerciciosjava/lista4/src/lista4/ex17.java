package lista4;
import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float vetor[]= {10,2,8,12,5};
		System.out.println("De um numero");
		float n= sc.nextFloat();
		
		for(int i=0;i<vetor.length;i++) {
			vetor[i]*=n;
		}
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}

	}

}
