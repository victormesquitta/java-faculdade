package lista4;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int vetor[]= {1, 2, 3, 4 ,5};
		System.out.println("De um numero");
		int mult=sc.nextInt();
			
			for(int i=0;i<vetor.length;i++) {
				if(vetor[i]%2!=0) {
					vetor[i]*=mult;
				}
			}
			
			for(int i=0;i<vetor.length;i++) {
					System.out.println(vetor[i]);
				
			}

	}

}
