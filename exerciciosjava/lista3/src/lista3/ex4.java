package lista3;

import java.util.Scanner;

public class ex4 {

	public static int fatorial(int a) {

		int fat=1;
		
		for(int i = 0; i < a; i++) {

			fat *= a - i;	
		}
		
		return(fat);
	}
	
	public static int soma(int a) {

		int soma = 0;
		
		for(int i = 0; i < a; i++) {

			soma += a-i;	
		}
		
		return(soma);
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("DDigite um número: ");
		int n1 = teclado.nextInt();

		if(n1 >= 0) {	
			System.out.print("O valor da divisão do fatorial pela soma foi "+(fatorial(n1) / soma(n1)));
			}

		else {
			System.out.print("Número inválido!");
		}

		teclado.close();
	}

}
