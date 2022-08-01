package lista3;

import java.util.Scanner;

public class ex3 {

	public static int fatorial(int a) {
		
		int fat=1;
		
		for(int i = 0; i < a; i++) {
		fat *= a - i;	
		}
		
		return(fat);
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número: ");

		int n1 = teclado.nextInt();

		if(n1 >= 0) {	
			System.out.print("O fatorial é: " + (fatorial(n1)));
			}

		else {
			System.out.print("Número inválido!");
		}

		teclado.close();
	}

}
