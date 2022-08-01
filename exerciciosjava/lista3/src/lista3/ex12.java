package lista3;

import java.util.Scanner;

public class ex12 {


	public static void pesoH(float a) {
		float num = (a * 72.7f) - 58;
		System.out.printf("O seu peso ideal é: %.2f\n",num);
       
		}
	
	public static void pesoM(float a) {
		float num = (a * 62.1f) - 44.7f;
		System.out.printf("O seu peso ideal é: %.2f\n",num);
	       
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De o seu altura: ");
		float altura=sc.nextFloat();
		System.out.println("De o seu sexo:\n[H]Homem \n[M]Mulher ");
		char sexo=sc.next().charAt(0);
		
		if(sexo=='H') {
			pesoH(altura);
		}
		else if(sexo=='M') {
			pesoM(altura);
		}
		else {
			System.out.println("Escolha invalida");
		}

	}

}
