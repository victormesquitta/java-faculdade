package lista3;

import java.util.Scanner;

public class ex1 {
	
	 static int menor(int a, int b, int c) {
		 
		int menor = a;
		
		if(menor > b && c > b) {
			menor = b;
		}
		else if (menor > c) {
			menor = c;
		}
		 
		return(menor);
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);

		System.out.print("Primeiro Valor: ");
		int n1 = teclado.nextInt();

		System.out.print("Segundo Valor: ");
		int n2 = teclado.nextInt();
		
		System.out.print("Terceiro Valor: ");
		int n3 = teclado.nextInt();
		
		System.out.print("O menor número foi o "+(menor(n1, n2, n3)));

		teclado.close();
	}
}
