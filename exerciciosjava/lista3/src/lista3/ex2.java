package lista3;

import java.util.Scanner;

public class ex2 {
	
	public static int somatoria(int n) {

		int soma=0;
		
		for(int i = 0; i < n; i++) {
		soma += n - i;	
		}
		
		return(soma);
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1= teclado.nextInt();

		if(n1>=0) {	
		System.out.println("O valor da soma é "+(somatoria(n1)));
		}

		else {
			System.out.println("Número inválido!");
		}

		teclado.close();
	}
}
