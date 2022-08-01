package lista3;

import java.util.Scanner;
import java.lang.Math;

public class ex6 {

	public static float bhaskaraP(int a, int b , int c) {
		float delta;
		float resul;
		float raiz;
		
		delta= (float) Math.pow(b, 2) -4*a*c;
		raiz = (float)Math.sqrt(delta);
		if(delta%raiz==0 & a!=0) {
			resul=(-b + (float) Math.sqrt(delta))/(2*a);
		}
		else {
			resul=-1;
		}
		
		return((float)resul);
	}
	
	public static float bhaskaraN(int a, int b , int c) {
		float delta;
		float resul=0;
		float raiz;
		
		delta= (float) Math.pow(b, 2) -4*a*c;
		raiz = (float)Math.sqrt(delta);
		if(delta%raiz==0 & a!=0) {
			resul=(-b - (float) Math.sqrt(delta))/(2*a);
		}
		else {
			resul=-1;
		}
		
		return((float)resul);
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("ax² + bx + c = 0");

		System.out.print("De o valor de A");
		int n1=teclado.nextInt();

		System.out.print("De o valor de B");
		int n2=teclado.nextInt();

		System.out.print("De o valor de C");
		int n3=teclado.nextInt();

		System.out.println("Escolha qual raiz vai querer receber: \n[1]Maior raiz \n[2]Menor raiz");
		int n4=teclado.nextInt();
		
		if(n4==1) {
			if(bhaskaraN(n1,n2,n3)>=bhaskaraP(n1,n2,n3)) {
				System.out.println("A maior raiz foi " + bhaskaraN(n1,n2,n3));
			}
			else {
				System.out.println("A maior raiz foi " + bhaskaraP(n1,n2,n3));
			}
		}
		else if(n4 == 2) {

			if(bhaskaraN(n1,n2,n3) <= bhaskaraP(n1,n2,n3)) {

				System.out.println("A menor raiz foi " + bhaskaraN(n1,n2,n3));
			}

			else {
				System.out.println("A menor raiz foi " + bhaskaraP(n1,n2,n3));
			}
		}
		else {
			System.out.println("Número inválido!");
		}

		teclado.close();
	}

}
