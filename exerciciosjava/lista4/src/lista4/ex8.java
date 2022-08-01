package lista4;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int vetor[]= {1, 2, 3, 4 ,5};
		System.out.println("De um numero");
		int n=sc.nextInt();
			
			for(int i=0;i<vetor.length;i++) {
				if(n==vetor[i]) {
					System.out.println("O numero esta dentro do vetor");
					break;
				}
				else if(i==4) {
					System.out.println("O numero não esta dentro do vetor");
				}
			}

	}

}
