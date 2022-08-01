package lista3;

import java.util.Scanner;
import java.lang.Math;

public class ex5 {
	
	public static float bhaskaraP(int a, int b , int c) {

		float delta;
		float resul;
		float raiz;
		
		delta= (float) Math.pow(b, 2) -4*a*c;

		raiz = (float)Math.sqrt(delta);

		if(delta % raiz == 0 & a != 0) {
			resul=(-b + (float) Math.sqrt(delta)) / (2*a);
		}
		else {
			resul = -1;
		}
		
		return((float)resul);
	}
	
	public static float bhaskaraN(int a, int b, int c) {

		float delta;
		float resul = 0;
		float raiz;
		
		delta= (float) Math.pow(b, 2) -4 * a * c;
		raiz = (float) Math.sqrt(delta);

		if(delta % raiz == 0 & a != 0) {
			resul=(-b - (float) Math.sqrt(delta)) / (2*a);
		}
		else {
			resul = -1;
		}
		
		return((float)resul);
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("ax² + bx + c = 0");

		System.out.print("Digite um número: ");
		int n1 = teclado.nextInt();

		System.out.print("Digite mais um número: ");
		int n2 = teclado.nextInt();

		System.out.print("Digite outro número: ");
		int n3 = teclado.nextInt();

		System.out.println("O resultado da bháskara foi " + (bhaskaraP(n1, n2, n3) + " ou " + bhaskaraN(n1, n2, n3)));

		teclado.close();
	}

}
